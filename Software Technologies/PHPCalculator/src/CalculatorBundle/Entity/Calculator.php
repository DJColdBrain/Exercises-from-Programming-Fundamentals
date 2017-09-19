<?php

namespace CalculatorBundle\Entity;

Class Calculator{
    /**
     * @var  float
     */
    private $leftOperand;
    /**
     * @var  float
     */
    private $rightOperand;
    /**
     * @var  string
     */
    private $operator;

    /**
     * Get leftOperator
     *
     * @return float
     */
    public function getLeftOperand(){
        return $this->leftOperand;
    }

    /**
     * @param float $leftOperator
     *
     * @return Calculator
     */
    public function setLeftOperand(float $leftOperator)
    {
        $this->leftOperand = $leftOperator;
        return $this;
    }

    /**
     * @return string
     */
    public function getOperator()
    {
        return $this->operator;
    }

    /**
     * @param string $operator
     * @return Calculator
     */
    public function setOperator(string $operator)
    {
        $this->operator = $operator;
        return $this;
    }

    /**
     * @return float
     */
    public function getRightOperand()
    {
        return $this->rightOperand;
    }

    /**
     * @param float $rightOperator
     * @return Calculator
     */
    public function setRightOperand(float $rightOperator)
    {
        $this->rightOperand = $rightOperator;
        return $this;
    }

}