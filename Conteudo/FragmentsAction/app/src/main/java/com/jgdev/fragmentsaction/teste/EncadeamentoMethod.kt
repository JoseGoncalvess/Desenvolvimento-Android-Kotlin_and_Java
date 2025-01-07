package com.jgdev.fragmentsaction.teste


class Mensagem(val mensagem : String, val duration : Int){

    companion object {
        fun construirMsg(msg : String, duration : Int) : Mensagem{
            return Mensagem(mensagem = msg, duration = duration)
        }
    }

    fun ExibirMsg(){
        println("A mensagem é -> ${this.mensagem} com duaração de -> ${this.duration} sec.")
    }

}


fun main() {

    Mensagem
        .construirMsg("Ação Avisada",
            5)
        .ExibirMsg()
}