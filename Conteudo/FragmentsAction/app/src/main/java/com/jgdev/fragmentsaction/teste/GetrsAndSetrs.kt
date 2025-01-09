package com.jgdev.fragmentsaction.teste


// TODO EM KOTLIN OS GETRS E SETRS  SÂO "IBUTIDOS" DIFERENTE DO JAVA QUE PRECISA SER DECLARADO SO METODOS
class Person() {
    var nome : String = ""

        get() {
            return  field
        }

        set(value) {
            field = value
        }

    var ange : Int = 0

}








fun main() {

    val pessoa = Person()
    pessoa.nome = "Julia"
    pessoa.ange = 25

    println(pessoa)

}