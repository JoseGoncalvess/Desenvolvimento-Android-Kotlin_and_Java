package com.jgdev.fragmentsaction.teste

var lanche = mutableListOf<String>("BATA FRITA","COCA COLA","PASTEL")
var sobremesa = mutableListOf<String>("SORVETE","BRIGADEIRO")
var janta = mutableListOf<String>("ARROZ","FEIJÃO","CARNE")


fun main() {

    var comidaDeHoje  = lanche.union(sobremesa)
    println(comidaDeHoje)

    comidaDeHoje  = janta.toSet() + sobremesa
    println(comidaDeHoje)


}