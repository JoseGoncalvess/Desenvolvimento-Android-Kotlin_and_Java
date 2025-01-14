package com.jgdev.fragmentsaction.teste
// ESTA ESTRUTURA DE DADOS TARS CONSIGO UMA ESTRUTURA QUE NÂO SE REPETE


// TODO SET QUE APOS SER CRIADA NÂO È POSSIVEL TER SUA ESTRUTURA ALTERADA
val imutableSetList = setOf<Int>(1,8,25)

// TODO ESSA MESMO APÓS SUA CRIAÇÂO PODE SER ALTERADA
val mutableSET = mutableSetOf<String>("BRUNO","ROSA","MARIA")


fun main() {

    // TODO METODOS LIST PARA MUTABLE LIST
    mutableSET.add("WALESKA")
    mutableSET.remove("ROSA")
    mutableSET.size
    mutableSET.first()
    mutableSET.last()
//mutableSET.get() //
    mutableSET.sorted()
    mutableSET.addAll(listOf("COCADA","SABÂO","MARACUJA"))

    mutableSET.forEach { it -> println(it) }

    // TODO OS ETODOS DE "ADD" "REMOVE" "clear"
}