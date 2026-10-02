package com.example.ejercicioinicio

fun csv() {
    var todaInformacion: String = """nombre,nota1,nota2,nota3
     Ana,7,8,9
     Luis,5,6,4
     Marta,9,10,8"""
    //Dividir por salto de linea
    val texto = todaInformacion.split("\n")
    var nombre: String
    var nota1: Int
    var nota2: Int
    var nota3: Int
    var notaF: Double
    var mensaje: String=""

    for (i in 0 until texto.size) {
        if (i == 0) {
            println(texto[0])
        }
        //Si no es la cabecera
        else {
            //Me va a dividir las partes
            var partes = texto[i].split(",")
            //Si es la primera parte es el nombre
            nombre = partes[0] //Si no
            nota1 = partes[1].toInt()
            nota2 = partes[2].toInt()
            nota3 = partes[3].toInt()
            notaF = (nota1 + nota2 + nota3) / 3.toDouble()
            when(notaF){
                in 0.0 .. 4.99->mensaje="Suspenso"
                in 5.0 .. 6.99->mensaje="Aprobado"
                in 7.0 .. 8.99->mensaje="Notable"
                in 9.0.. 10.00 ->mensaje="Sobresaliente"
                else -> "Eso es imposible"
            }
            println("$nombre $nota1 $nota2 $nota3 $notaF $mensaje")
        }
    }
}



