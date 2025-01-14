package com.jgdev.fragmentsaction.teste

// TODO LIST QUE APOS SER CRIADA NÂO È POSSIVEL TER SUA ESTRUTURA ALTERADA
val imutableList = listOf<Int>(1,8,25)

// TODO ESSA MESMO APÓS SUA CRIAÇÂO PODE SER ALTERADA
val mutableList = mutableListOf<String>("1","8","25")


fun main() {

    // TODO METODOS LIST PARA MUTABLE LIST
    mutableList.add("COCA")
    mutableList.remove("8")
    mutableList.size
    mutableList.first()
    mutableList.last()

    mutableList.get(0)
    mutableList.addAll(listOf("COCADA","SABÂO","MARACUJA"))

    mutableList.forEach { it -> println(it) }

    // TODO OS ETODOS DE "ADD" "REMOVE" "clear"
}