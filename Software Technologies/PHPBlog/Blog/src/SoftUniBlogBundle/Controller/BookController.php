<?php

namespace SoftUniBlogBundle\Controller;

use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use SoftUniBlogBundle\Entity\Book;
use SoftUniBlogBundle\Form\BookType;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Request;

class BookController extends Controller
{


    public function indexAction($name)
    {

        return $this->render('', array('name' => $name));
    }

    /**
     *
     * @param Request $request
     *
     * @Route("/book/create", name="book_create")
     * @Security("is_granted('IS_AUTHENTICATED_FULLY')")
     *
     * @return \Symfony\Component\HttpFoundation\RedirectResponse
     */
    public function create(Request $request){

        $book = new Book;
        $form = $this->createForm(BookType::class, $book);

        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()){
            $em = $this->getDoctrine()->getManager();
            $em ->persist($book);
            $em-> flush();

            return $this->redirectToRoute('blog_books');
        }

        return $this->render('book/create.html.twig' , ['form' => $form->createView()]);
    }


    /**
     * @Route("/book/{id}", name="book_view")
     * @param $id
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function viewBook($id){
        $book = $this->getDoctrine()->getRepository(Book::class)->find($id);

        return $this->render('book/book.html.twig', ['book' => $book]);
    }
}
