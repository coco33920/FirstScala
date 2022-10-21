package fr.charlotte
import TokenType.*
enum TokenType:
  case LPar,RPar
  case StringToken(s: String)
  case ORToken
  case ANDToken
  case NOTToken

def printToken(t: TokenType): String =
  t match
    case LPar => "("
    case RPar => ")"
    case StringToken (s: String) => s"[StringToken $s]"
    case ORToken => "[Operator OR]"
    case ANDToken => "[Operator AND]"
    case NOTToken => "[Operator NOT]"

def printTokenList(l: List[TokenType]) : Unit =
  val a = "{" + l.map(printToken).mkString(";") + "}"
  println(a);