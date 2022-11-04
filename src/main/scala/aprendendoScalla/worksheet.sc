def par(x: Int): Boolean = x % 2 == 0

def impar(x: Int): Boolean = !par(x)

par(10)

impar(3)

val lista = List(1, 2, 3, 4, 5, 6)

val listaPares = lista.filter(x => par(x))

val listaImpar = lista.filterNot(par(_))

val listaMultPorDois = lista.map(x => x*2)

lista.reverse