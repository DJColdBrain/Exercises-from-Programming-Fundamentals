<?php

namespace CalculatorBundle\Controller;

use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use CalculatorBundle\Entity\Calculator;
use CalculatorBundle\Form\CalculatorType;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Request;

class CalculatorController extends Controller
{
    /**
     * @param Request $request
     *
     * @Route("/", name="index")
     *
     * @return \Symfony\Component\HttpFoundation\Response
     *
     */
    public function index(Request $request)
    {
        $calculator = new Calculator();

        $form = $this->createForm(CalculatorType::class, $calculator);

        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()){
            $leftOperator = $calculator->getLeftOperand();
            $rightOperator = $calculator->getRightOperand();
            $operator = $calculator->getOperator();
            
            $result = 0;

            switch ($operator) {
                case '+':
                    $result = $leftOperator + $rightOperator;
                    break;
                case '-':
                    $result = $leftOperator - $rightOperator;
                    break;
                case '*':
                    $result = $leftOperator * $rightOperator;
                    break;
                case '/':
                    if ($rightOperator != 0) {
                        $result = $leftOperator / $rightOperator;
                    } else {
                        $result = 0;
                    }
                    break;
                case '^':
                    $result = pow($leftOperator, $rightOperator);
                    break;
                case 'OR':
                    if ($leftOperator != 0 || $rightOperator != 0){
                        $result = 1;
                        }else{
                        $result = 0;
                    }
                    break;
                case 'AND':
                    if (($leftOperator != 0 || $rightOperator != 0) && $leftOperator == $rightOperator){
                        $result = 1;
                    }else{
                        $result = 0;
                    }
                    break;
                case 'XOR':
                    if ( $leftOperator != $rightOperator){
                        $result = 1;
                    }else{
                        $result = 0;
                    }
                    break;

            }

            return $this->render('calculator/index.html.twig', [
                'result' => $result, 'calculator' => $calculator, 'form' => $form->createView()
            ]);
        }

            return $this->render('calculator/index.html.twig', ['form' => $form->createView()]);

    }
}
