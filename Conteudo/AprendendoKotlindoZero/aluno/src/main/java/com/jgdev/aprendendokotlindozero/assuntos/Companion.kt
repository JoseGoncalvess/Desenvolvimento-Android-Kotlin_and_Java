package com.jgdev.aprendendokotlindozero.assuntos


// TODO  COMUM SAR O COMAPINION PARA PODER CRIAR ATRIBUTOS ACESSIVEIS SEM A NECESSIDADE
//  DE INSTACIA R A CLASSE
//  PODEMOS EM SITUAÇÕES TER VALORES OU FUNÇÕES QUE POSSUEM UAM FREQEUNCIA DE USO
class Veiculo(
    var modelo : String = "",
    var velocidade : Double = 20.00
)
{


    // IMPLEMENTAÇÃO DO COMPANION E TUDO QEU TIVER DENTRO DELE TEM ACESSO  SEM ESTANCIA
    /*
    Podendo ele também ser nomeado, raramente usado
     */
    companion object{
        const val VELOCIDADE_MAX_PERMITIDA = 120;

        fun apresentarDocumentos( nome: String){
            println("Aque esta os docuemntos do ${nome}")
        }
    }



    fun  apresentarInfo(){
        println("O $modelo está a $velocidade Km/h")
    }

}



fun main() {

    // TODO estancia d euma classe e o atributo que podemos acessar
val fusca : Veiculo = Veiculo("Fusca",80.0)
    fusca.apresentarInfo()

    val ferrari : Veiculo = Veiculo("Ferrari",200.0)
    ferrari.apresentarInfo()
    // TODO atributo acessivel sem estancia
    println("A velocidade maxima desta vie é -> ${Veiculo.VELOCIDADE_MAX_PERMITIDA}");

    println(Veiculo.apresentarDocumentos("Ferrari"));
}