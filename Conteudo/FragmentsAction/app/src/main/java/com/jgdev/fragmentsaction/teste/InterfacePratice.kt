package com.jgdev.fragmentsaction.teste
// INTERFACE E SUAPLAICABILIDADE NAMELHORIA DO COD

// GARANTINDO O PRINCIPIO D DRY - DONT REPEAT YOUSELF
// BAIXO ACOPLAMENTO
// CLASSES DEVEM USAR E NÂO CRIAR OUTARS


interface Instrumento {
    fun TocarInstrumento()
}

class Musico (var instrumento : Instrumento){

    fun TocarInstrumento(){
        println("O musico esta tocando...")
        instrumento.TocarInstrumento()
    }
}

class Violao : Instrumento{
    override fun TocarInstrumento() {
        println("TODANDO VIOLÃO")
    }
}

class Pandeiro : Instrumento{
    override fun TocarInstrumento() {
        println("TODANDO PANDEIRO")
    }
}

fun main() {
    val tioBeto = Musico(Violao())
    tioBeto.TocarInstrumento()

    val jacksonDoPandeiro = Musico(Pandeiro())
    jacksonDoPandeiro.TocarInstrumento()
}
