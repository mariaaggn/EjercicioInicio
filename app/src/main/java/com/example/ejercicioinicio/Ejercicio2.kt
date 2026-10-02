package com.example.ejercicioinicio

val tareas = mutableListOf<String>()
var opcion: Int = 0

fun gestorTareas() {
    var nombreTarea: String
    var indiceTarea: Int
    while (opcion != 5) {
        menu()
        when (opcion) {
            1 -> {
                println("Escriba el nombre de la tarea")
                nombreTarea = readln()
                anadir(nombreTarea)
                println("Tarea Añadida")
            }

            2 -> {
                println("Indique el núm de tarea que quiere marcar como completado")
                indiceTarea = readln().toInt()
                completar(indiceTarea)
            }

            3 -> listar()
            4 -> pendientes()
            else -> println("--No sé que quieres hacer--")
        }
    }
}

fun menu() {
    println("--Opciones--")
    println("1.Añadir Tarea")
    println("2.Completar Tarea")
    println("3.Listar Tareas")
    println("4.Tareas Pendientes")
    println("5.Salir")
    println("Seleccione lo que desea hacer:")
    opcion = readln().toInt()
}

fun anadir(tarea: String) {
    tareas.add(tarea)
}

fun completar(indice: Int) {
    if (tareas.size > 0 && indice >= 0 && indice <= tareas.size + 1 && !tareas[indice].contains("[X]")) {
        val indice = indice - 1
        tareas[indice] = "[X]" + tareas[indice]
    } else {
        println("No hay tareas en la lista o El indice es superior al núm de tareas que hay en la lista")
    }
}

fun listar() {
    //Predefinido de kotlin
    for (i in tareas.indices) {
        println("Tarea:${i + 1} ${tareas[i]}")
    }
}

fun pendientes() {
    for (t in tareas) {
        if (!tareas.contains("[X]")) {
            println("$t")
        }
    }
}
