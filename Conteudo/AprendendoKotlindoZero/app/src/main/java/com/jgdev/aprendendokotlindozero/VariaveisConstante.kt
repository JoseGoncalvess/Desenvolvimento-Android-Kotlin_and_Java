package com.jgdev.aprendendokotlindozero

const val usuario = "Gonçalves" // TEMPO DE COMPILAÇÃO

fun main() {
    // TODO EXISTE DOIS TIPOS DE VARIAVEIS ->  "VOLATEIS" e "IMUTAVEIS"
    // AS PALAVRAS RESERVADAS QUE MARCAM ESSA SITUAÇÂO É

    //TODO VARIAVEL = VAR
    var nome = "Gonçalves"


    //TODO IMUTAVEL = VAL
    val idade = 23 // TEMPO DE EXECUÇÃO

    // TODO A MUDANÇA DE VALOR NÂO PODE ACONTECER POIS idade é final
    //    idade = 55

    // TODO  A MUDANÇA PODE OCORRER POIS nome É MUTAVEL
    nome = "Anny"
    println("$nome tem $idade de Idade !")


    // TODO TEÓRIA
    /*
        O termo const val é de aplicabilidade global de modo que é uma boa prática usar esa fora de escopo de funções
        devido ao fato de preciso do valor em tempo de compilação diferendo do val que é apenas em tempo de execução

     */

    /*
    O kotlin possui inferência de tipo, claro que as boas pratica empregam que devemos tipar para garantir uma visualização
    assertivas do código, mas caso venha a acontecer o Kotlin possui essa qualidade.

     */


}