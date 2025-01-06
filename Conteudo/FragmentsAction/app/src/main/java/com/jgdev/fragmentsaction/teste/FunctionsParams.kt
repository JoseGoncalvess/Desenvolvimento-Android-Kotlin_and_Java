package com.jgdev.fragmentsaction.teste


class Matematica  {
    fun  somar (n1 : Int, n2 : Int) : Int{
        return n1 + n2;
    }
}



fun  calcular( number1 : Int, number2 : Int, function : (n1 : Int, n2 : Int) -> Int) : String{
    val result = function(number1, number2).toString();
    return  result;

}

fun main() {

    val matematica = Matematica()
    // TODO A PASSAGEM DE UMA FUNÇÃO SE DA PELA ANOTAÇÃO CLASS :: METODO
    // OU SIMPLISMENTE O NOME DA ::FUNÇÃO

    println(calcular(23,58,matematica::somar ))
}