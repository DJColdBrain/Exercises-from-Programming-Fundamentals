<?php

namespace SoftUniBlogBundle\Controller;

use Doctrine\ORM\Mapping\Cache;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Method;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use SoftUniBlogBundle\Entity\Article;
use SoftUniBlogBundle\Entity\Book;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class HomeController extends Controller
{
    /**
     * @Route("/", name="blog_index")
     * @Method("GET")
     */
    public function indexAction()
    {
        $articles = $this->getDoctrine()->getRepository(Article::class)->findAll();
        return $this->render('blog/index.html.twig', ['articles' => $articles]);
    }
    /**
     * @Route("/blog", name="blog_books")
     * @Method("GET")
     */
    public function bookAction()
    {
        $books = $this->getDoctrine()->getRepository(Book::class)->findAll();
        return $this->render('blog/books.html.twig', ['books' => $books]);
    }


}
