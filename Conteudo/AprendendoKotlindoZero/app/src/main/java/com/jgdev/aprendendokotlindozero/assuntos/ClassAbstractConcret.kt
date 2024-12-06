package com.jgdev.aprendendokotlindozero.assuntos

// TODO UAM CLASSE ABSTRATCT BASICAMENTE È UMA GENERICA QUE DEFINIMOS QUE SEJA IMPLEMNETADA
// TODO ASSIM COMO A PALAVRA "OPEN" CRIANDO UAM SPECIE DE CONTRATO
abstract class Empres {
    var nome: String = ""
    var CNPJ: String = ""

    // TODO UM METODO ABSTRATO E UMA FORMA D EEXIGIR QUE QUALQEUR OUTRA CLASSE QUE HERDE IMPLEMNETE ESTE METODO
    // TODO OBRIGATORAMENTE
    abstract fun abrir()
    abstract fun fechar()
    abstract fun slogan()

    /*
    Essa function não é obrigatoria a sua implemnetação
    mas ela pode sim ser sobrescrita por classes filhas
     */
   open  fun baixarCNPJ(){
        println("O $CNPJ INFELISMENTE FOI BAIXAIDO !")
    }
}

/*
Eu poderia sobrescrever os metodos, mas a vantagem de uma classe abstrata é justamente
deixa para quem herdar definir como cada objeto ira funcionar seguindo um contrato

tornando mais flexível as criação de objetos
 */

// CLASSE FILHA EU IMPLEMENTA UMA CLASS ABSTRATA
class Horadocafe constructor(nome : String, CNPJ : String) : Empres(){

    init {
        this.nome = nome;
        this.CNPJ = CNPJ
    }


    override fun abrir() {
        println("ABRINDO CAFETERIA")
    }

    override fun fechar() {
        println("FECHANDO CAFETERIA")
    }

    override fun slogan() {
        println("MELHOR CAFÉ DA CIDADE")
    }


    // METODO QEU PODE SER SOBRESCRITO, LEMBRANDO QEU NA HERANÇA O USO DAS PROPRIEDADES
    // NÃO È OBRIGATÓRIO

    override fun baixarCNPJ() {
        super.baixarCNPJ()
    }

}


fun main() {
val cafeteria :Horadocafe = Horadocafe("HORA DO CAFÉ","126.121/00001-88")

cafeteria.slogan()
}