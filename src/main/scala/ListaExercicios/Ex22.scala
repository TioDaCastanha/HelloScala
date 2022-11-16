package ListaExercicios

import scala.io.StdIn.readInt

object Ex22 extends App {

  var ano, idade: Int = 0
  val anoAtual = 2022

  val alistamento = {

    idade = {
      ano = {
        print("Informe o Ano de nascimento: ")
        readInt()
      }

      anoAtual - ano
    }

    if (idade < 18) s"Faltam ${18 - idade} anos para se alistar!"
    else if (idade > 18) s"Ja se passaram ${idade - 18} anos do seu alistamento!"
    else "Você deve se Alistar!"
  }

  print(alistamento)
}
