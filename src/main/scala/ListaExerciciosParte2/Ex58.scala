package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex58 extends App {

  var qtdAlunos, idade, media: Int = 0

  soma(opcao())

  @tailrec
  def soma(escolha: Int): Unit = {
    if (escolha != 999) {
      qtdAlunos += 1
      media += escolha
      soma(opcao())
    } else print(s"O total de aluno informados foi: $qtdAlunos \nA média de idade é de ${media / qtdAlunos}")
  }

  def opcao(): Int = {
    idade = {
      print("Informe idade do aluno (Digite 999 para sair): ")
      readInt()
    }

    idade
  }
}
