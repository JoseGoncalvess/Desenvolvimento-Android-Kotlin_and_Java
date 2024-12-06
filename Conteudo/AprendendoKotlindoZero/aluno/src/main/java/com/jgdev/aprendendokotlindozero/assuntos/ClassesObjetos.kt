package com.jgdev.aprendendokotlindozero.assuntos

//  TODO CLASSO NORMAL COM ATRIBUTOS E METODOS
// ABSTRAÇÃO
class Jogador{
    var nome : String = ""
    var kart : String = ""

    fun  acelerar(){
        println("$nome ACELERNADOOOOO")
    }

    fun  parar(){
        println("$nome PARANDOOO")
    }

}

class player  {

}


fun main() {
    val jogador : Jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.nome = "Gonçalves"

}