package ListaExercicios

import scala.io.StdIn.readInt

object Ex21 {
  def main(args: Array[String]): Unit = {
    var ano: Int = 0
    val bissexto = {

      ano = {
        print("Informe um Ano: ")
        readInt()
      }

      if (ano % 400 == 0) s"O ano de $ano é Bissexto"
      else if (ano % 4 == 0){
        if (ano % 100 == 0) s"O ano de $ano Não é Bissexto"
        else s"O ano de $ano é Bissexto"
      }
      else s"O ano de $ano Não é Bissexto"
    }

    print(bissexto)
  }

}
