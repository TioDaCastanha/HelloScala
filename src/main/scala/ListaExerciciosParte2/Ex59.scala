package ListaExerciciosParte2

import scala.io.StdIn.{readInt, readLine}

object Ex59 extends App{

  var idade, maiorIdade, qtdHomens, idadeMJoven, mediaHomem: Int = 0
  var sexo: String = ""

  contagem()

  def contagem(): Unit = {

    pegaDados()

    testeMaiorIdade(idade)

    if(sexo.equalsIgnoreCase("m")) testeQtdHomens(idade)
    else idadeMulherJovem(idade)

    recursive()
  }

  def pegaDados(): Unit ={
    sexo = {
      print("Informe o sexo: ")
      readLine()
    }

    idade = {
      print("Informe a idade: ")
      readInt()
    }
  }

  def testeMaiorIdade(idade: Int): Unit = if (idade > maiorIdade) maiorIdade = idade

  def testeQtdHomens(idade: Int): Unit ={
      qtdHomens += 1
      mediaHomem += idade
  }

  def idadeMulherJovem(idade: Int): Unit ={
    if (idadeMJoven == 0) idadeMJoven = idade
    else if (idade < idadeMJoven) idadeMJoven = idade
  }

  def recursive(): Unit ={
    val opcao = {
      print("Deseja continuar (S/N? ")
      readLine()
    }

    if (opcao.equalsIgnoreCase("s")) contagem()
    else print(s"A maior idade lida foi: $maiorIdade" +
    s"\nQuantidade de homens cadastrados: $qtdHomens" +
    s"\nMedia de Idade dos Homens: ${mediaHomem / qtdHomens}" +
    s"\nIdade da mulher mais jovem: $idadeMJoven")

  }

}
