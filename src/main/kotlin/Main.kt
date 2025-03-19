package ru.netology

fun main() {
    val amount = 400.0
    val commission = 0.075
    var resalt = amount * commission
    val minCommission = 35.0

    if (resalt <= minCommission){
        resalt = minCommission
    } else {
        resalt
    }

    println("Ваша коммисия: $resalt")
}