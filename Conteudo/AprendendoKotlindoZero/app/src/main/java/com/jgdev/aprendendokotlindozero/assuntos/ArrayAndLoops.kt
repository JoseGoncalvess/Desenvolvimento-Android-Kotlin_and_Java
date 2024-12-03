package com.jgdev.aprendendokotlindozero.assuntos

fun main() {

    // TODO o array com "Val" não faz referencia a os itens pois pode ser alterado, porem quando um array é val ele não pode ser requiado ou atribuido
    // nomes sera sempre um array e não posso criar outro
    val nomes = arrayOf(
        "Gonçalves", "Anny","Aline","Maria","Celine","Guilherme"
    )

    /*
    Os itens podem ser apresentados  por meio dos loops
     */
    println("Array na Pratica com loop")
    nomes.iterator().forEach {
        n ->
        println(n)
    }

    println("While na Pratica")

    var number : Int = 1

    while ( number <= 10){
        println(number)
        number ++

    }

    println("Outra forma de aplicar o while")
    while ( number in (1..5)){
        println(number)
        number ++

    }

    println("For na Pratica")
    /*
    Essa estrutura  comumente usada princpalmente nas interações com soleções
     */

    for ( i in 1..5){
        println("Numero $i")

    }

    println("For em Coleções")

    for (n in nomes){
        println("As pessoas da vez $n")
    }

    for ((index, nome) in nomes.withIndex()){
        println("As pessoas da vez $index - $nome")
    }

    /*
    As estruturas de repetição são amplamente usadas para efetuar ações repeditas ou ate memso interar sobre alguma coleção  ou variavel
    Estrutura poderosa e  pode ajudar muito durante o desenvolvimento
     */

}