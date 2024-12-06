package com.jgdev.aprendendokotlindozero.assuntos

// TODO ESTRUTURAS DE CONTROLE IF ELSE WHEN

fun main() {

    val idade = 5

    /*
      Estrutura de controle, possibilita criar situações e tomada de decição
      flexibilisado as soluções logicas.

            IF AND ELSE - >Mais comum e possivelmente a msi simples de usar
     */

    if (idade >= 18) {
        println("MAIOR DE IDADE!")
    } else {
        println("MENOR DE IDADE")
    }

    // TODO o "in" me permite setar um intervalo para a condição que estou tetsando

    val opc = 5
    if (opc in (1..6)) {
        println("OPÇÃO 1, 2,3,4,5,6")
    } else {
        println("OPÇÃO  entre 09 ... 23")
    }

    // TODO o "When" me permite criar estrutura de condição modalidade a condições setadas! algo mais definido
    /*
    Essa estrutura Conhecida como switch em outras linguagem aqui a nomenclatura muda mas o funcionamento é o mesmo
     */


    val opcaoBancaria = 3

    when (opcaoBancaria) {

        0 ->
            println("Seja Bem vindo");

        1 ->
            println("Transferencia bancaria")

        in (10..15)  -> println("Cartão de Crédito")

        else ->
            println("Opção não Selecionada!")

    }
    /*
    Posso em Conjunto utilizar as outras estruturas possibilitando as demais possibilidades.
     */

}