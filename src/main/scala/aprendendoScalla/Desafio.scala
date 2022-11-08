package aprendendoScalla

import scala.io.StdIn.{readInt, readLine}

object Desafio {
  def main(args: Array[String]){

    var golsBrasil, golsAdversario, pontos = 0

    for (i <- 1 to 3) {
      print(s"Quantos gols o Brasil fez na partida $i: ")
      golsBrasil = readInt()
      print(s"Quantos gols o Adversário fez na partida $i: ")
      golsAdversario = readInt()

      if (golsBrasil == golsAdversario) {
        pontos += 1
      } else if (golsBrasil > golsAdversario){
        pontos +=3
      }
    }

    println(s"A pontuação total do Brasil foi: $pontos")
  }
}
