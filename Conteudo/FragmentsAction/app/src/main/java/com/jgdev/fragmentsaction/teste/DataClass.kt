package com.jgdev.fragmentsaction.teste

// Todo CLASSE NORMAL QUE CADA INSTANCIA SERA DIFERENTE INDEPENDTE DO CONTEUDO

class Aluno(val nomeAluno : String){

    fun exibirAluno(){
        println("Olá, eu sou $nomeAluno ")
    }
}

// TODO penssando am classe voltadas  apra lidar com dados surge a ideia das dataclass,
//  possui alocaçõa na memoria identica porem, os dados podem ser diferentes


data class Pessoa( var name : String, val age : Int)



fun main() {
    val aluno1 = Aluno("Gustavo")
    val aluno2 = Aluno("Valeska")

    // CONSIDERANDO A INSTANCIA
    println(aluno1 == aluno2)

    val pessoa1 = Pessoa("Cesar", 28)
    val pessoa2 = Pessoa("Cesar", 28)


    // CONSIDERANDO OS DADOS
    println(pessoa1 == pessoa2)
    pessoa1.name ="Maria"
    println(pessoa1 == pessoa2)
}