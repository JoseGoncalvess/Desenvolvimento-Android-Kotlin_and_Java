package com.jgdev.fragmentsaction.teste
data class Anime(var nome : String, var anoLanc : Int)






// ESTA ESTRUTURA DE DADOS TARS CONSIGO UMA ESTRUTURA QUE A KEY NÂO SE REPETE

// TODO MAP QUE APOS SER CRIADA NÂO È POSSIVEL TER SUA ESTRUTURA ALTERADA
val imutableMapList = mapOf(1 to "Carro",8 to "Cavalo",25 to "Celine")

// TODO ESSA MESMO APÓS SUA CRIAÇÂO PODE SER ALTERADA
val mutableMap = mutableMapOf(1 to "BIKE",8 to "MOTO",25 to "CARRO")


fun main() {

    // TODO METODOS LIST PARA MUTABLE LIST
    mutableMap.put (30, "WALESKA")
    mutableMap.remove(25)
    println(  mutableMap.size)
    println(mutableMap[1])

    var objectMap = mutableMapOf<Int, Anime>(1 to Anime("NAruto",2018),2 to Anime("Demon Slayer",2022))

    objectMap.forEach { anime ->
        println("Na posição ${anime.key} está o  ${anime.value.nome} Que foi lançado em ${anime.value.anoLanc}")
    }


    // TODO OS ETODOS DE "ADD" "REMOVE" "clear"
}