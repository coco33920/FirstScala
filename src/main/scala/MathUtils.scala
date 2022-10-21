package fr.charlotte

trait AddService:
  def add(a: Int, b: Int) = a+b

trait MultService:
  def mult(a: Int, b: Int) = a*b

object MathUtils extends AddService,MultService
