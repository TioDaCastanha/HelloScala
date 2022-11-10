package ListaExercicios

import scala.io.StdIn.readFloat

object Ex09 extends App {

  var reais: Float = 0.0f

  print("Informe a quantidade em R$: ")
  reais = readFloat()

  printf("Você pode adquirir U$%.2f com R$%.2f", reais / 3.45 , reais)
}
