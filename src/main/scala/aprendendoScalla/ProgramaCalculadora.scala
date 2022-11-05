package aprendendoScalla

object ProgramaCalculadora {

  def main(args: Array[String]): Unit ={
    val result = Calculadora.soma(10,20)
    println(s"O resultado da soma é: $result")

    println(Calculadora.+(10,3))
    println(Calculadora.-(10,3))
    println(Calculadora.*(10,3))
    println(Calculadora./(10,3))

  }
}
