package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object Ex53 extends App{

  var qtdHomens, qtdMulheres, media, mediaHomens, qtdMulher20, idade, mediaH, qtd: Int = 0

  qtd = {
    print("Informe quantas pessoas deseja cadastrar: ")
    readInt()
  }

  contagem(qtd)

  @tailrec
  def contagem(i: Int): Unit ={
    if (i != 0) {
      idade = {
        print("Informe sua idade: ")
        readInt()
      }

      media += idade

      val sexo = {
        print("Informe seu Sexo: ")
        readLine()
      }

      if (sexo.equalsIgnoreCase("f")) {
        qtdMulheres += 1
        if (idade > 20) qtdMulher20 += 1
      } else {
        qtdHomens += 1
        mediaH += idade
      }

      contagem(i - 1)

    }else print(s"Quantidade de homens cadastrados: $qtdHomens \n" +
    s"Quantidade de Mulheres cadastradas: $qtdMulheres \n" +
    s"Media idade do grupo: ${media / qtd} \n" +
    s"Media idade homens: ${mediaH / qtdHomens} \n" +
    s"Quantidade de mulheres acima de 20: $qtdMulher20")

  }

}
