fun main() {
val op = Operaciones()
    val listaOperaciones: MutableList<Operaciones> = mutableListOf()
    val listaOperacionesResultados: MutableList<Double> = mutableListOf()

    do {
        println("Calculadora")
        println("1. Suma ")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. Division")
        println("5. Cuadrado")
        println("6. Imprimir lista")
        println("Ingrese su opcion: ")
        var opcion: Int = readln().toInt()

        when (opcion) {
            1 -> {
                println("Ingrese numero 1: ")
                var n1: Double = readln().toDouble()
                println("Ingrese Numero 2: ")
                var n2: Double = readln().toDouble()
                op.setN1(n1)
                op.setN2(n2)
                op.suma()
            }

            2 -> {
                println("Ingrese numero 1: ")
                var n1: Double = readln().toDouble()
                println("Ingrese Numero 2: ")
                var n2: Double = readln().toDouble()
                op.resta(n1, n2)
            }

            3 -> {
                println("Ingrese numero 1: ")
                var n1: Double = readln().toDouble()
                println("Ingrese Numero 2: ")
                var n2: Double = readln().toDouble()
                op.setN1(n1)
                op.setN2(n2)
                println(op.multiplicacion())
                listaOperacionesResultados.add(op.multiplicacion())
            }

            4 -> {
                println("Ingrese numero 1: ")
                var n1: Double = readln().toDouble()
                println("Ingrese Numero 2: ")
                var n2: Double = readln().toDouble()
                println(op.division(n1, n2))
                listaOperacionesResultados.add(op.division(n1,n2))
            }

            5 -> {
                println("Ingrese numero 1: ")
                var n1: Double = readln().toDouble()
                println(op.cuadrado(n1))
                listaOperacionesResultados.add(op.cuadrado(n1))
            }
        }
        listaOperaciones.add(op)

    }while (opcion!=6)

    println("listas: $listaOperaciones")

    for (n in listaOperacionesResultados){
        println(n)
    }

    println( op.toString())

}
/*
1. forma de crear clases
cuando solo requeremos uso de un solo constructor

2. mas de un constructor

 */

