package com.example.ejercicioinicio


fun frecuenciaLetras(){
    //Pillo el texto
    println("Ingrese el texto que desee")
    var texto= readln()
    //Le quito los espacios y los pongo en minuscula
    texto=texto.trim().lowercase()
    //Mapa mutable Colección de pares clave valor,
    val contador = mutableMapOf<Char, Int>()
    //Recorre cada caracter en el texto
    for(letra in texto){
        //Si el caracter no es un espacio en blanco
        if (letra != ' ') {
            //Cuenta la letra si está le suma+1
            contador[letra]=(contador[letra] ?: 0)+1
        }
    }

    //Contador.to list converte en una lista de pares (letra, frecuencia)
    //ordena de manera descendiente por el segundo valor(que es el que tiene el num de frecuencia)
    val ordenado = contador.toList().sortedByDescending { it.second }

    //Recorre la lisra separando la letra de la frecuencia en dos variables
    for ((letra, frecuencia) in ordenado) {
        //Y asi lo puedo imprimir
        println("$letra: $frecuencia")
    }}