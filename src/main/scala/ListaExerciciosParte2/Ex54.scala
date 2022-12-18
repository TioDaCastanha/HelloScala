package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.{readFloat, readInt, readLine}

object Ex54 extends App{

  var peso, altura, mediaAltura: Float = 0.0f
  var qtd90Mais, qtd50Menos, qtdMaior190, qtd: Int = 0

  qtd = {
    print("Quantos pessoas deseja registrar? ")
    readInt()
  }

  contagem(qtd)

  @tailrec
  def contagem(i: Int): Unit = {
    if(i != 0){
      peso = {
        print("Informe o Peso: ")
        readLine().replace(',','.').toFloat
      }

      altura = {
        print("Informe a altura: ")
        readFloat()
      }

      mediaAltura += altura

      if(peso > 90) {
        qtd90Mais += 1
        if (peso > 100 && altura > 1.90) qtdMaior190 += 1
      }
      else if (peso < 50 && altura < 1.60) qtd50Menos += 1

      contagem(i - 1)

    }else print(s"Quantidade de pessoas com mais de 90kg: $qtd90Mais \n" +
      s"Quantidade de pessoas com Menos de 50kg e menos de 1.60m: $qtd50Menos \n" +
      f"Media de Altura do grupo é: ${mediaAltura / qtd} \n" +
      s"Quantidade de pessoas com mais de 100kg e maiores de 1.90m: $qtdMaior190")
  }

}
