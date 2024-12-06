package com.jgdev.aprendendokotlindozero.assuntos

// TODO ESSE PARADIGMA E ORIENTADO A FUNÇÕES ONDE CRIAMOS FUNÇÕES
// PARA FAZER ACONTECER AS COISAS

// EXEMPLO DE FUNÇÃO
fun grita(palava: String) {
    println("${palava.uppercase()}!!!")

}

// TODO AS FUN PODE SER COM E SEM RETORNO

// COM RETORNO
fun somar(): Int {
    return 1 + 2
}

// SEM RETORNO
fun subitrair() {

}

// TODO EXISTE UM MANEIRA DIFERENTE DE ESCREVER FUNCTIONS = INLINE FUNCTIONS
// INLINE FUNCTIONS
fun nome() = println("Inline Functions")
fun nome2(): String = "Inline Functions"

// TODO FUNCTIONS COM PARAMETROS

fun somandoComParametro(number: Int, number2: Int = 1) = number + number2 // FUNÇÔES COM E SEM VALORES PADÃO

/*
 As funções com parametros podem ser usados com e sem valor padrão
 esasa  não senod obrigatorio serem passadas na chamada do metódo

 */



fun main() {
    grita("any")
    println(somandoComParametro(number = 20, number2 = 66))
}