package ListaExercicios

import scala.io.StdIn.readInt

object Ex18 extends App{

  var anoNasc, idade: Int = 0
  val anoAtual = 2022

  idade = {

    anoNasc = {
      print("Informe o ano de nascimento: ")
      readInt()
    }

    anoAtual - anoNasc
  }

  if (idade >= 18) print("Pode Votar!!")
  else if (idade > 15) print("Voto facultativo!")
  else print("Não pode votar")

}
