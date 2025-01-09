package com.jgdev.fragmentsaction.teste

class Dicionario(){

    fun definirPalavras(vararg  palavras : String){

        for  (p  in palavras){
            println(p)
        }
    }
}






fun main() {

    val dicionario = Dicionario()

    dicionario.definirPalavras("Cachorro","Gato","Python", "Java","Flutter")

}