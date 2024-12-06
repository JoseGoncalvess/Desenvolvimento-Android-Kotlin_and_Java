package com.jgdev.aprendendokotlindozero.assuntos

/*
SITE REFERENC: https://kotlinlang.org/docs/keyword-reference.html#operators-and-special-symbols
 */

fun main() {
    // TODO OS OPERADORES MATEMÁTICOS COMUM:
    /*
    + = Adição
    - = Subtração
    * =Vezes
    / = Divisão
    % = Resto da divisão
     */

    val num = 1
    val  num2 = 3

    println("TODO OS OPERADORES MATEMÁTICOS COMUM:")
    println("num * num2 : ")
    println(num * num2)
    println("num - num2 : ")
    println(num - num2)
    println("(num / num2) * num2 : ")
    println((num / num2) * num2)
    println("num2 % num : ")
    println(num2 % num)

// TODO OS OPERADORES RELACIONAIS COMUM:
    /*
    == = Igual
    > = Maior que
    < = Menor que
    >= | <= = Maior ou Igual
    != = Diferente de
    ! = Negação
     */

    println("TODO OS OPERADORES RELACIONAIS COMUM:")
    println("num > num2 : ")
    println(num > num2)
    println("num < num2 : ")
    println(num2 < num)
    println("num2 != num : ")
    println(num2 != num)
    println("num2 == num : ")
    println(num2 == num)
    println("!(num2 == num) : ")
    println(!(num2 == num))



    // TODO OS OPERADORES LOGÍCOS COMUM:
    /*
    && = and
    || = or
    ! = Not
     */

    println("TODO OS OPERADORES LOGÍCOS COMUM:")
    println("num > num2 && num == num : ")
    println(num > num2 && num == num)
    println("num2 < num || num != num2 : ")
    println(num2 < num || num != num2)
    println("!(num2 == num : ")
    println(!(num2 == num))

}