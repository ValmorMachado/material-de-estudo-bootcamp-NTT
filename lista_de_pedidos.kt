/*
Lista de pedidos

CODELAB Google Android: https://developer.android.com/codelabs/basic-android-kotlin-training-lists

RESUMO:

O Kotlin oferece funcionalidades para ajudar a gerenciar e manipular conjuntos de dados com mais facilidade
usando a BIBLIOTECA PADRÃO DO KOTLIN. Uma conjunto pode ser definido como uma série de objetos do mesmo
tipo de dados. Existem vários tipos de conjuntos básicos no Kotlin: listas, conjuntos e mapas. Esse codelab
se concentrou especificamente em listas.

Uma lista é um conjunto ordenado de elementos de um tipo específico, como uma lista de Strings.
O índice é a posição inteira que reflete a posição do elemento (por exemplo, myList[2]).
Em uma lista, o primeiro elemento fica no índice 0 (por exemplo, myList[0]) e o último
no myList.size-1 (por exemplo, myList[myList.size-1] ou myList.last()).

Há dois tipos de listas: List e MutableList.
Uma List é somente leitura e não pode ser modificada depois de inicializada.
No entanto, você pode aplicar operações como sorted() e reversed(), que retornam uma nova lista sem mudar a original.

Uma MutableList pode ser modificada após a criação, como ao adicionar, remover ou modificar elementos.
É possível adicionar uma lista de itens a uma lista mutável usando addAll().

Use uma repetição while para executar um bloco de código até que a expressão seja avaliada como falsa e
a repetição seja concluída.

while (expression) {

// While the expression is true, execute this code block

}

Use uma repetição for para iterar todos os itens de uma lista:
for (item in myList) {

// Execute this code block for each element of the list

}

O modificador "vararg" permite que você transmita um número variável de argumentos para uma função ou um construtor.

RODE O CÓDIGO NO PLAYGROUND KOTLIN: https://play.kotlinlang.org
Link: https://pl.kotl.in/jp2h5hL33

*/

open class Item(val name: String, val price: Int)

class Order(val orderNumber: Int) {
   private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

class Noodles : Item("Noodles", 10) {
   override fun toString(): String {
       return name
   }
}

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
   override fun toString(): String {
       if (toppings.isEmpty()) {
        return "$name Chef's Choice"
       } else {
           return name + " " + toppings.joinToString()
       }
   }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)
    
    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
ordersList.add(order4)

    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach")))
    
    for (order in ordersList) {
        order.print()
        println()
    }
    
}
