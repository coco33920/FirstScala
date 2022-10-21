package fr.charlotte
import Ast.*

@main def run(): Unit =
  val tokenList =
    List(TokenType.StringToken("b"),TokenType.LPar,
      TokenType.NOTToken,TokenType.StringToken("C1"),TokenType.ORToken,TokenType.StringToken("C2"),TokenType.RPar)
  printTokenList(tokenList)
  val ast = OrOperator(Str("b"),AndOperator(NoOperator(Str("C1")),Str("C2")))
  println(printFormula(ast))

