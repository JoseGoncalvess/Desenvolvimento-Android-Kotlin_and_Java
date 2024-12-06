package com.jgdev.aprendendokotlindozero.assuntos

// TODO NULLSAFETY é  uma fomra de garantir e tartar as possiveis erros nulos

/*
Por padrão as variáveis dos kotlin não permitem null mas podemos especificar que ela será null por meio do sinal "?"
esse erro acontece em tempo de execução
 */

class Carro{
    var  cor ="vermelho"
    var modelo = "Esportivo"
}

fun main() {
    var carro: Carro? = null
//    carro = Carro()

    // TODO quando quero garantir que não ser anulo ultilizo  as exclamações "!!",
    //  assim tou dizendo por kotlin que eu garando que não é null
    println(carro!!.cor)

    // TODO o kotlin entedne que você verificou se não é null e nem apresenta erro
    if (carro != null){
        println(carro.cor)
    }


    /*
    Posso também efetuar uma chamada segura por meio do sinal "?"
     */
    println(carro?.modelo)


}