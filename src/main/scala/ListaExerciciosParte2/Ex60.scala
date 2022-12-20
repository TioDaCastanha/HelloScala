package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex60 extends App {

  var nome, sexo, nomeMaisVelho, nomeMaisNovo, opcao: String = ""
  var mediaIdade, idade, homens30mais, mulheres18menos, maisNovoMulher, maisVelho, cont: Int = 0

  opcao = "s"

  contagem()

  @tailrec
  def contagem(): Unit ={
    if(opcao.equalsIgnoreCase("s")){
      pegarInfo()

      mediaIdade += idade

      if(idade > maisVelho) atribuirMaisVelho(idade, nome)
      if(sexo.equalsIgnoreCase("f")) {
        atribuirMaisNovo(idade, nome)

        if(idade < 18) mulheres18menos += 1
      }else if (idade > 30) homens30mais += 1

      cont += 1

      escolha()

      contagem()

    } else resultado()

  }

  def escolha(): Unit = {
    opcao = {
      print("Deseja continuar (S/N)? ")
      readLine()
    }

  }

  def pegarInfo(): Unit ={
    nome = {
      print("Informe o nome: ")
      readLine()
    }

    idade = {
      print("Informe a idade: ")
      readLine().toInt
    }

    sexo = {
      print("Informe o sexo: ")
      readLine()
    }
  }

  def atribuirMaisVelho(idade: Int, nome: String): Unit ={
    maisVelho = idade
    nomeMaisVelho = nome
  }

  def atribuirMaisNovo(idade: Int, nome: String): Unit = {
    if(maisNovoMulher == 0) {
      maisNovoMulher = idade
      nomeMaisNovo = nome
    }else if (idade < maisNovoMulher) {
      maisNovoMulher = idade
      nomeMaisNovo = nome
    }
  }

  def resultado(): Unit ={
    print(s"O nome da pessoa mais velha é: $nomeMaisVelho" +
      s"\nO nome da mulher mais Jovem é: $nomeMaisNovo" +
      s"\nMedia de Idade do grupo é: ${mediaIdade / cont}" +
      s"\nQuantidade de mulheres menores de 18: $mulheres18menos" +
      s"\nQuantidade de Homens maiores de 30: $homens30mais")
  }
}
