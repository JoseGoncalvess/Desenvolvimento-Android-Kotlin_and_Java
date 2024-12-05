package com.jgdev.aprendendokotlindozero.assuntos

// TODO CONSTRUTORES SÂO ULTILIZADO PARA INICIAR AS PROORIEDADES DE UM OBJETO
/*
Como o proprio nome dis ele constroi o objeto podendo ou não ter pripriedades.
Um memso objeto pode ter mais de um construtor que ao ser cirado referencia o construtor primário
 */

// CLASSE COM O CONSTRUTOR PRIMARO
class Usuario constructor(val nome : String = "",  val idade : Int = 0){

    fun  apresentacao(){
        println("Olá, me chamo $nome e tenho $idade")
    }

    // INIT SERA INICIADO ASSIM FOR CIRADOO OBJETO E CONSTRUTOR PRIMARIO
    init {
        println("OBJETO INICIALIZADO")
    }

    // TODO CONTRUTOR  ELE PASSAR AS PROPRIEDADES PARA O CONSTRUCTOR 1
    constructor( nome : String, email : String ) : this() {
        println("CONSTRUTOR 2 $nome e tenho o email $email")
    }

}

fun main() {
    val user = Usuario("Gonçlaves",23, )
    val user2 = Usuario("Anny", "jg@gmail.com")
}