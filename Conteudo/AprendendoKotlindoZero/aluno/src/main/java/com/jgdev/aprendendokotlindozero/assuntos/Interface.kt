package com.jgdev.aprendendokotlindozero.assuntos

// COMUMENTE USADA PARA FECHAR  UM CONTARTO COM CLASSE QUE POSSUIM ATRIBUI COMPORTAMENTOS OU METODOS QUE APRESENTA COMPORTAMENTOS DIFERENTES
/*
    DIFERENTE das classes abstratas  ela possuim um comportamento diferente, podendo ser mais verssatil
 */

// TODO OBRIGATORIAMENTE DEVO IMPLEMNETAR OS METODOS DISPOSTO NELA


interface Contratavel{
    fun candidatarseAVaga();
}


// TODO AS ABSTRATACT PODE SER HERDADO MAS CARECE DE DEFINIÇÂO DE QUEM CRIOU
// DE ESTABELECER COMO CADA COISA PODE SER NÂO OBRIGATORIAMENTE DEVO IMPLEMNETAR OS METODOS
abstract class ContratavelClass{

    fun candidatarseAVaga(){
        println("ENTRAGAR CURRICULO")
    }
}


// TODO AS CLASSE QUE IMPLEMENTA PODEM DEFINIR COMO SERA A IMPLEMNETAÇÃO
class Pessoa : Contratavel {
    override fun candidatarseAVaga() {
        println("ENTREGOU CURRÍCULO ")
    }
}

class Desenvolvedor : ContratavelClass(){

}




fun main() {

    // TODO: POR FIM O COMPORTAMENTO É "IGUAL" MAS  FORA OCMO SERA IMPLEMENTADO OU O PORQUE DE USAR CADA UMA,
    // TODO: È O QUE DIFERENCIA

    val pessoa : Pessoa = Pessoa()
    val dev : Desenvolvedor = Desenvolvedor()

    pessoa.candidatarseAVaga()
    dev.candidatarseAVaga()

}