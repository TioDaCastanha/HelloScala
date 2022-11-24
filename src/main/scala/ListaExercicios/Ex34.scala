package ListaExercicios

import scala.io.StdIn.readFloat

object Ex34 extends App {

  var altura, peso, imc: Float = 0.0f

  val classificacao = {
    imc = {
      altura = {
        print("Informe sua altura: ")
        readFloat()
      }

      peso = {
        print("Informe seu peso: ")
        readFloat()
      }

      peso / (altura * altura)
    }

    if (imc >= 40) "Obesidade Mórbida"
    else if (imc >= 30) "Obesisdade"
    else if (imc >= 25) "Sobrepeso"
    else if (imc >= 18.5) "Peso ideal"
    else "Abaixo do peso"
  }

  print("Classificação: " + classificacao)

}
