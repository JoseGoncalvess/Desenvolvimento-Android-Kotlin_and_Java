package com.jgdev.aprendendokotlindozero.assuntos

// TODO METODO POR PADRÂO É PUBLIC = VISIVEL PARA TODOS

abstract  class Fruta{

    // O PRIVATE = VISIVEL APENAS PARA CLASSE INTERNAMENTE
    private var nome = ""

    // O PROTECTE = FICA VISIVEL PARA TODA CLASSE PAI E FILHAS
    protected  var cor = ""
}


class Goiaba: Fruta() {

    var sabor ="DOCE"

}




fun main() {



val goiaba : Goiaba = Goiaba()


}