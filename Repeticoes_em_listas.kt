/*
Repetições em uma lista: Podemos usar While ou For

Observação: veja outras variações do que você pode fazer com as repetições for,
incluindo o uso em intervalos com etapas específicas (em vez de aumentar apenas um por vez).

for (item in list) print(item) // Imprime na ordem da lista

for (item in 'b'..'g') print(item) // imprime entre 'b' e 'g'

for (item in 1..5) print(item) // Crescente

for (item in 5 downTo 1) print(item) // Decrescente

for (item in 3..6 step 2) print(item) // Imprime: 35

REFERENCIA: https://developer.android.com/codelabs/basic-android-kotlin-training-lists

*/
fun Main() {
  
    // USANDO WHILE
    val convidados = listOf(2, 4, 1, 3)
    
    var total = 0
    var index = 0
  
    while (index < convidados.size) {
        total += convidados[index]
        index++
    }
    
    println("Total de convidados: $total")
    
    // USANDO FOR
    
    val nomes = listOf("Carla", "Lucia", "Aline", "Juliana")
    
    for (nome in nomes) {
        println("$nome - Numero de letras do nome: ${nome.length}")
    }

}

Main()
