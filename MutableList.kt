/*
MUTABLE LIST
Listas mutáveis são aquelas que podem ser modificadas após a criação. Você pode adicionar, remover ou alterar itens.
Também é possível fazer as mesmas operações das listas somente leitura. As listas mutáveis são do tipo MutableList,
e é possível criá-las chamando mutableListOf().

REFERENCIA: https://developer.android.com/codelabs/basic-android-kotlin-training-lists

*/

fun main() {

    val cardapio: MutableList<String> = mutableListOf()
    
    //Lista vazia
    println("Entrada: $cardapio")
    // Inserindo um valor de cada vez
    println("Inserindo Polenta Bramata: ${cardapio.add("Polenta Bramata")}")
	  println("Entrada: $cardapio")
    println("Inserindo Tábua com stracciatella: ${cardapio.add("Tábua com stracciatella")}")
	  println("Entrada: $cardapio")
    
    // Inserindo uma lista
    val maisEntradas: List<String> = listOf("Polvo All'Agliata", "Raviolli com gema de ovo caipira", "Arancini Pomodoro")
    
    println("Adicionando uma lista de entradas: ${cardapio.addAll(maisEntradas)}")
	  println("Entradas: $cardapio")
    
    //Removendo
    
    println("Removndo Polvo All'Agliata: ${cardapio.remove("Polvo All'Agliata")}")
	  println("Entrada: $cardapio")
    
    //Se não existe retorna falso
    println("Removendo item que não existe: ${cardapio.remove("massa")}")
    println("Entrada: $cardapio")
    
    //Removendo um indíce da lista
    println("Removendo o primeiro elemento: ${cardapio.removeAt(0)}")
    println("Entrada: $cardapio")
    
    //Apagndo a lista
    cardapio.clear()
    println("Entrada: $cardapio")
    
    //Verificando se está vazia
    println("Lista vazia? ${cardapio.isEmpty()}")
    
}

Main()
