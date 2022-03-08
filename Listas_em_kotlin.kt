/*

Como usar listas em Kotlin:

Os tipos de dados básicos do Kotlin são: Int, Double, Boolean e String.
Se você quiser armazenar mais de um valor, nesses casos, é útil o tipo de dados List.

Uma lista é um conjunto de itens em uma ordem específica. O Kotlin tem dois tipos de listas:

Lista somente leitura: a List não pode ser modificada depois de criada.

Lista mutável: a MutableList pode ser modificada depois de criada. Isso significa que você pode adicionar, remover ou atualizar os elementos dela.

Ao usar a List ou a MutableList, é necessário especificar o tipo de elemento que ela pode conter.
Por exemplo, a List<Int> contém uma lista de números inteiros e a List<String> contém uma lista de strings.
Se você definir uma classe CASA em seu programa, poderá criar uma List<CASA> com uma lista de instâncias de objetos CASA.

REFERENCIA: https://developer.android.com/codelabs/basic-android-kotlin-training-lists

*/


fun main() {

    // Delarando uma lista de inteiros
    val numeros: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    /*
    Se o tipo de variável puder ser deduzido (ou inferido) com base no valor no lado direito do operador de atribuição (=), será
    possível omitir o tipo de dados da variável. Dessa forma, a declaração fica:
    
    val numeros = listOf(1, 2, 3, 4, 5, 6)

    */
    
    println("List: $numeros")
    println("Size: ${numeros.size}")

    // Métodos de acesso aos elementos da lista:

    println("Primeiro elemento: ${numeros[0]}")
    println("Segundo elemento: ${numeros[1]}")
    println("Último indíce da lista: ${numeros.size - 1}")
    println("Último elemento da lista: ${numeros[numeros.size - 1]}")
    println("First elemento: ${numeros.first()}")
    println("Último elemento: ${numeros.last()}")

    // Usando o método contains():

    println("A lista tem o número 4?(retorna true ou false) ${numbers.contains(4)}")
    println("A lista tem o número 7?(retorna true ou false) ${numbers.contains(7)}")
    
    // Declarando a lista
    val cores = listOf("verde", "laranja", "azul")
    // Usando os métodos reversed e sorted
    println("Invertendo a lista: ${cores.reversed()}")
	println("Lista original: $cores")
    
    println("Ordenando a lista: ${cores.sorted()}")
    
    //Declarando uma lista de números ímpares
    val numerosImpares = listOf(5, 3, 7, 1)
    
	println("Lista: $numerosImpares")
	println("Lista ordenada: ${numerosImpares.sorted()}")

}

Main()
