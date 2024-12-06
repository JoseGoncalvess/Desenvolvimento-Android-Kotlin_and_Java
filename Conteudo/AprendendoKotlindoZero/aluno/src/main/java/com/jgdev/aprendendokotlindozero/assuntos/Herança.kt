package com.jgdev.aprendendokotlindozero.assuntos

// TODO HERANÇA È UMA FORMA DE HERDA PROPRIEDADES E METODOS ENTRE HOBJETOS
// QUE FACILITA A REULTILIZAÇÃO DO CODIGO E ESTRUTURA DO PROJETO




// TODO SUPER CLASS = CLASS PAI
/*
Por motivos de sintaxe a classe pai precisa ter a palava "open" antes dela e dos seus metodos para permitir a herança
por padrão toda classe tem sua criação definida por final
 */
open class Animal {
    var nome = ""
    var tipo = ""

    open fun comer(){
        println("COMENDO")
    }

    open fun dormir(){
        println("DORMINDO")
    }
    open fun acordar(){
        println("ACORDANDO")
    }

}





// TODO CLASS FILHA
/*
A Herança se da por meio dos : CLASS PAI, agora as classe filhas possuem todos os metódos e atributos do PAI
 */
class Passaro constructor(val corDasPenas : String ) : Animal(){

    // TODO POSSO TER NAS CLASS FILHAS METODOS E ATRIBUTOS ESPECIFICOS DE CADA ENTIDADE
    fun voar(){
        println("VOANDO")
    }

    //TODO POSOS TAMBEM SOBRESCREVER UM METÓDO
    override fun dormir() {
        println("PASSARO ESTÁ COMENDO")
    }

}

class Cachorro constructor(val raca : String ): Animal(){

    // TODO POSSO TER NAS CLASS FILHAS METODOS E ATRIBUTOS ESPECIFICOS DE CADA ENTIDADE
    fun latir(){
        println("LATINDO")
    }

    //TODO POSOS TAMBEM SOBRESCREVER UM METÓDO
    override fun dormir() {
        println("O CACHORRO ESTÁ DORMINDO")
    }
}






fun main() {

    val passaro : Passaro = Passaro("Azul")
    val cachorro : Cachorro = Cachorro("Pit-Bull")

    // Metódos genericos
    passaro.acordar()
    cachorro.comer()

    // Metódos especificos
    passaro.voar()
    cachorro.latir()
}