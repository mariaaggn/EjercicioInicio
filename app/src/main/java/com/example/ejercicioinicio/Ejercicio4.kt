package com.example.ejercicioinicio

fun validadorContrasena() {
    var contrasena: String
    var todoCorrecto = false
    while (!todoCorrecto) {
        println("---Para escribir una contraseña----")
        println("Mínimo 8 carácteres")
        println("Al menos una mayúscula")
        println("Al menos una minúscula")
        println("Al menos un dígito")
        println("Al menos un carácter especial")
        println("Escriba contraseña:")
        contrasena = readln()
        todoCorrecto = true

        if (contrasena.length < 8) {
            println("Mínimo 8 caracteres")
            todoCorrecto = false
        }
        if (!contrasena.any { it.isUpperCase() }) {
            println("Al menos una mayúscula")
            todoCorrecto = false
        }
        if (!contrasena.any { it.isLowerCase() }) {
            println("Al menos una minúscula")
            todoCorrecto = false
        }
        if (!contrasena.any { it.isDigit() }) {
            println("Al menos un dígito")
            todoCorrecto = false
        }
        if (!contrasena.any { !it.isLetterOrDigit() }) {
            println("Al menos un carácter especial")
            todoCorrecto = false
        }
    }
    println("Contraseña válida")
}