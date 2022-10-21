package fr.charlotte

import Ast.*

enum Ast:
  case Str(s: String)
  case AndOperator(f1: Ast, f2: Ast)
  case OrOperator(f1: Ast, f2: Ast)
  case NoOperator(f1: Ast)


def printFormula(t: Ast): String =
  t match {
    case Str(s) => s
    case AndOperator(f1, f2) => "(" + printFormula(f1) + " ∧ " + printFormula(f2) + ")"
    case OrOperator(f1, f2) => "(" + printFormula(f1) + " ∨ " + printFormula(f2) + ")"
    case NoOperator(f1) => "(¬" + printFormula(f1) + ")"
  }