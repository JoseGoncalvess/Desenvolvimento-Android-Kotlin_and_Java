package com.jgdev.fragmentsaction.teste

data class Pergunta (var pergunta: String, val resposta : String)



fun main() {
    // TODO POR SE TARTAR D EUMA OBJETO DE DADOS PODEMOS ACESSAR OS DADOS D EMANEIRA DECOMPOSTA POR MEIO DOS "( variaveis)"
    // TORANOD SEU ACESSO INDIVIDUAL
val (pergunta, resposta) = Pergunta("Que time é teu?","Te lasca")

    println(pergunta)
    println(resposta)
}