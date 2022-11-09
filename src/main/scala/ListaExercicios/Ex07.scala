package ListaExercicios

import scala.io.StdIn.readFloat

object Ex07 {
  def main(args: Array[String]): Unit ={
    var num: Float = 0.0f

    print("Informe um numero: ")
    num = readFloat()

    println(s"O dobro de $num é: ${num*2}")
    println(s"A terça parte de $num é: ${num/3}")
    
  }

}
