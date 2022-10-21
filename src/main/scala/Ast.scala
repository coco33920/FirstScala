package fr.charlotte

abstract trait BinaryOperator[A,B]:
    def apply() : A
abstract trait UnaryOperator[A]:
    def apply(): A
case class Str(s: String)
case class AndOperator(f: formula,f2: formula) extends BinaryOperator[formula,formula]:
  def apply(): formula = f
case class OrOperator(f: formula, f2: formula) extends BinaryOperator[formula,formula]:
  def apply(): formula = f2
case class NoOperator(f: formula) extends UnaryOperator[formula]:
  def apply(): formula = f
case class LeftParenthesis()
case class RightParenthesis()

type formula = Str | AndOperator | OrOperator | NoOperator | LeftParenthesis | RightParenthesis

 def printFormula(t: formula): String =
   t match {
     case Str(s) => s
     case AndOperator(f1, f2) => "(" + printFormula(f1) + " ∧ " + printFormula(f2) + ")"
     case OrOperator(f1, f2) => "(" + printFormula(f1) + " ∨ " + printFormula(f2) + ")"
     case NoOperator(f1) => "(¬" + printFormula(f1) + ")"
     case LeftParenthesis() => "("
     case RightParenthesis() => ")"
   }