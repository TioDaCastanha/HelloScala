package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readFloat

object Ex51 extends App {

  var preco, maior, menor: Float = 0.0f

  contagem(8)

  @tailrec
  def contagem(i: Int): Unit ={
    if (i == 0) print(s"Maior preço digitado: $maior \nMenor preço digitado: $menor")
    else {
      preco = {
        print ("Informe um valor: ")
        readFloat()
      }

      if(preco > maior) maior = preco
      else if (menor == 0) menor = preco
      else if (preco < menor) menor = preco

      contagem(i - 1)
    }
  }

}
