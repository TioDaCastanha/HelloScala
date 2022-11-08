package ListaExercicios

import scala.io.StdIn.readLine

object Ex02 {
  def main(args: Array[String]): Unit ={
    var nome: String = ""

    print("Qual é seu nome? ")
    nome = readLine()

    print(s"Olá $nome, é um prazer te conhecer!")

  }

}
