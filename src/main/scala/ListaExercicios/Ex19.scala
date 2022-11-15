package ListaExercicios

import scala.io.StdIn.{readFloat, readLine}

object Ex19 extends App {

  var nome: String = ""
  var nota1, nota2, media: Float = 0.0f

  val aproveitamento = {

    nome = {
      print("Informe nome do Aluno: ")
      readLine()
    }

    media = {
      nota1 = {
        print("Informe nota 1 do Aluno: ")
        readFloat()
      }

      nota2 = {
        print("Informe nota 2 do Aluno: ")
        readFloat()
      }

      (nota1 + nota2)/2
    }

    if (media >= 7) "Parabéns você foi Aprovado!"
    else if (media >= 5) "Você está de recuperação! Estude mais!"
    else "Reprovado, tente novamente semestre que vem."

  }

  print(aproveitamento)

}
