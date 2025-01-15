package com.jgdev.fragmentsaction.teste

val nameList = mutableListOf<String>("Anna","Bruno","Pamella","Gutemberg","França")


fun main() {

    var novaLsit = nameList.filter { it -> it.lowercase().contains("u") }

    println(nameList)
    println(novaLsit)
}