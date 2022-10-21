package fr.charlotte
  enum TokenType:
    case LPar,RPar
    case StringToken(s: String)
    case ORToken
    case ANDToken
    case NOTToken

  def printToken(t: TokenType): String =
    t match
      case TokenType.LPar => "("
      case TokenType.RPar => ")"
      case TokenType.StringToken (s: String) => s"[StringToken $s]"
      case TokenType.ORToken => "[Operator OR]"
      case TokenType.ANDToken => "[Operator AND]"
      case TokenType.NOTToken => "[Operator NOT]"

  def printTokenList(l: List[TokenType]) : Unit =
    val a = "{" + l.map(printToken).mkString(";") + "}"
    println(a);