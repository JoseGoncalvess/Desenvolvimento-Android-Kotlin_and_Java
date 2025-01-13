package com.jgdev.fragmentsaction.teste




fun main() {
    // TODO LISTA GENERICA
    var listItem = arrayOf("Opa","Luana", 23,true)

    listItem.forEach { item -> println(item) }

    // TODO METODO PLUS DA LISTA - FUNCIONA COMO U COPWIF
    var newLista = listItem.plus("Cacu")
    // TODO METODO SIZE  RETORNA O TAMNHO DA LISTA
    println(listItem.size)

    // TODO METODO indexO  RETORNA O INDEX DA LISTA
    println(listItem.indexOf(23))

    // TODO METODO LAST  RETORNA O ULTIMO ITEM  DA LISTA
    println(listItem.last())

    // TODO METODO contains  RETORNA SE O ITEM CONTEM nA LISTA
    println(listItem.contains(false))

    // TODO METODO contains  RETORNA SE O ITEM CONTEM nA LISTA
    println(listItem.contains(false))

    // TODO METODO shuffle  EMBARALHA A ORDEM DOS ITENS DA  LISTA
    println(listItem.shuffle())



}