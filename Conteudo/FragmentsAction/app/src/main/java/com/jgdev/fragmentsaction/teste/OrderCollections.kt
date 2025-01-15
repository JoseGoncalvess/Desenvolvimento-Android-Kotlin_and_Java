package com.jgdev.fragmentsaction.teste

val numberList = listOf(1,5,9,6,55,87)
val nomeList = listOf("Guteberg","Anna","Maria","Bruneska", "Gonçalves","Galindo","josue","Marlombrando")



fun main() {

    println("NOTA ORDENADA ACENDENTE:")
    println(numberList.sorted())
    println(nomeList.sorted())

    println("NOTA ORDENADA DECENDENTE:")
    println(numberList.sortedDescending())
    println(nomeList.sortedDescending())

}