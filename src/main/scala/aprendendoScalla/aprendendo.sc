var nome1 = "Alan"

nome1 = "Alan Alves"

val nome = "Alan"

def par(x: Int) = x % 2 == 0

par(10)

def lista = List(1,2,3,4,5,6)

val lista2 = (1 to 6).toList

def fatorial(n: Int): Int = {
  if (n == 0)
    1
  else
    n * fatorial(n - 1)
}

fatorial(4)