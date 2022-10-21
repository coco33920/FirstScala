package fr.charlotte
  enum AST:
    case Str(s: String)
    case AndOperator(f1: AST, f2: AST)
    case OrOperator(f1: AST, f2: AST)
    case NoOperator(f1: AST)


  def printFormula(t: AST): String =
    t match {
      case AST.Str(s) => s
      case AST.AndOperator(f1, f2) => "(" + printFormula(f1) + " ∧ " + printFormula(f2) + ")"
      case AST.OrOperator(f1, f2) => "(" + printFormula(f1) + " ∨ " + printFormula(f2) + ")"
      case AST.NoOperator(f1) => "(¬" + printFormula(f1) + ")"
    }