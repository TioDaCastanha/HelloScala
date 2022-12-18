package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.util.Random

object Ex52 {

  var media, maior, qtdMaior18, qtdMenor5, idade: Int = 0
  var random = new Random()

  def main (args: Array[String]): Unit ={

    contagem(10)

  }

  @tailrec
  def contagem (i: Int): Unit ={
    if(i != 0){
      idade = {
        random.nextInt(101)
      }

      if (idade > maior) maior = idade

      if (idade > 18) qtdMaior18 += 1
      else if (idade < 5) qtdMenor5 += 1

      media += idade

      contagem(i - 1)
    } else printf("A Media de idade é: %.2f \nPessoas com mais de 18 anos: %d \nPessoas com menos de 5 anos: %d \nA maior idade lida é: %d", media / 10f, qtdMaior18, qtdMenor5, maior)

  }

}
