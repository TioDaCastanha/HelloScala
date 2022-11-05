package aprendendoScalla

import scala.util.Try

object Calculadora {
  def soma(x: Int, y: Int): Int = x + y

  def sub(x: Int, y: Int): Int = x - y

  def mult(x: Int, y: Int): Int = x * y

  def div(x: Int, y: Int): Int = Try(x / y).getOrElse(0)

  def + : (Int, Int) => Int = soma

  def - : (Int, Int) => Int = sub

  def * : (Int, Int) => Int = mult

  def /(a: Int, b:Int): Int = div(a, b)

}
