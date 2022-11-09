package ListaExercicios

import scala.io.StdIn.readLine

object Ex08 {
  def main(args: Array[String]): Unit ={
    var metros: Float = 0.0f

    print("Informe a distância percorrida em metros: ")

    //Funciona com .replace para trocar a , por .
    metros = readLine().replace(',','.').toFloat

    println(s"A distância de ${metros}m corresponde a:")

    println(s"${metros / 1000}Km        ${metros * 10}dm")
    println(s"${metros / 100}Hm        ${metros * 100}cm")
    print(s"${metros / 10}Dam        ${metros * 1000}mm")
  }
}
