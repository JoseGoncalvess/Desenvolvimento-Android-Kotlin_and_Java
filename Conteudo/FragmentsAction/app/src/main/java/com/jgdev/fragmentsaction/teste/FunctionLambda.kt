package com.jgdev.fragmentsaction.teste

// TODO MODELO DE FUNÇÃO COMUM

val functionComum = println("FUNÇÃO EM VARIAVEL")

fun functionScoop(){
    println("FUNÇÃO COM CORPO COMUM")
}



// TODO FUNCTION LAMBDA
val lambda =  {
    println("FUNÇÃO LAMBDA")
}

// LAMBDA COM APRAMNS
val lambdaWhitParams =  { name : String, age : Int ->
    println("FUNÇÃO LAMBDA WHITH PARAMS")
    println("Olá, me chamo $name e tenho $age de Idade")
}




class Example {
    fun functionMetod( function: (args:String)-> Unit){
        function("PARAMETRO")
    }
}

fun main() {

    val example : Example = Example()

    functionComum

    functionScoop()

    lambda()

    lambdaWhitParams("Dressa",55)

    example.functionMetod { args ->

        println("OLÀ, SOU UMA FUNCTIO  E FUI APSSADA COMO PARAMETRO -> $args")
    }


}