package com.jgdev.aprendendokotlindozero.assuntos

class USer{
    // TODO TODO ETODO TEM UAM ASSINATURA QUE O TORNA UNICO

    /*
    A ASINATURA È COMPOSTA DE  : NOME + PARAMETROS E TIPOS
     */
    fun logar( email:String, password : String): Unit {
        println("USusario logado com email:$email e Senha:$password")
    }

    fun logar(telefone: String): Unit {
        println("USusario logado com telefone:$telefone")
    }
}



//TODO ESSA ABORDAGEM PERMITE QUE O MESMO METODO TENHA DIFERENTES COMPORTAMENTOS


fun main() {
 val ususario = USer()

    ususario.logar("87995656565")
    ususario.logar("g@gmail.com","252625258")
}