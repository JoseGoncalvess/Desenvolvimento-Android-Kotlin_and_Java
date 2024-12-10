package com.jgdev.aprendendokotlindozero.assuntos

// TODO AS E MANEIRAS DE DEFINIR UMA VARIAVEL

/*
1) - COM VALOR
2) - NULL
3) LATEINIT -INICIAÇÃO TARDIA
 */
class Produto{
    var descrocao : String = "";
    var preco : Int? = null;
    lateinit var marca : String; // INICIANOD DEPOISMAS SO FUNCIONA COM VAR
    fun apresentar(){
        println("O $descrocao da $marca no $preco")
    }

    // TODO OBS DEVE SE TOMAR CUIDADO COM ESSE TIPO DE MODIFICAOR, POIS SE NÃO INICIADO VAI ESTOURA O ERRO
}




fun main() {
val produto : Produto = Produto()
    produto.descrocao  = "BOLO D ECHOCOLATE"
    produto.preco = 15

//    produto.apresentar() // ERRO

    produto.marca = "DONA BENTA"
    produto.apresentar() // ERRO
}