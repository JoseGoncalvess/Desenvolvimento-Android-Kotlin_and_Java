package com.jgdev.fragmentsaction.teste

data class Copo(val color : String, var capacit : Double){
    fun showCup(){
        println("O copo $color tem a capacidade de $capacit ml")
    }

    fun drikingCup(){
        println("Colocando Suco no copo $color")
    }

    fun drikinWater(){
        println("Bebendo Água")
    }
    fun drikin(bebida : String){
        println("Bebendo $bebida")
    }

    fun exitCup(){
        println("Descartando o Copo na Lixeira")
    }
};




fun main() {
    val copoDescatvel  = Copo("Branco",250.0)
    println(copoDescatvel)

    // LET - USADO PARA ALTERAL UM OBJETOE RETORNA OBJETO ALTERADO
    copoDescatvel.let {
        it.capacit = 500.0
    }
    println(copoDescatvel)

    // RUN - USADO PARA EXECULTA ALGO NO OBJETO ACESSO AOS METODOS
    copoDescatvel.run {
        showCup()
    }
    // WITH - FAZ ALGO COM O OBJETO PASSADO
    with(copoDescatvel){
        drikingCup()
    }

    // APPLY _ APLICA ALGO AO OBJETO
    copoDescatvel.apply {
        drikin("PITU")
        exitCup()
    }

    // ALSO _ FAÇO ALGO ALENDO O QUE JA FI PEDIDO "TAMBÈM FAÇA ISSO"
    copoDescatvel.apply {
        drikin("PITU")
        exitCup()
    }.also {
        it.showCup()
    }

}
