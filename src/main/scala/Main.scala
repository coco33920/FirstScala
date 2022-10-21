package fr.charlotte

@main def run(): Unit =
  val token = OrOperator(Str("b"),AndOperator(NoOperator(Str("C1")),Str("C2")))
  println(printFormula(token))

