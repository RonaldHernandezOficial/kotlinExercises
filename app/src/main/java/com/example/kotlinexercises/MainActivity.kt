package com.example.kotlinexercises

import kotlin.math.max
import kotlin.math.min

fun main() {
    menu()
}

private fun menu() {
    var choose: Int

    while (true) {
        println("BIENVENIDO AL MENÚ PRINCIPAL")
        println("1. Entras al menú de los Operadores.")
        println("2. Entras al menú de los Condicionales.")
        println("3. Entras al menú de los Ciclos.")
        println("99. Con este te sales.")
        print("Ingresa una opción: ")
        choose = readLine()?.toIntOrNull() ?: 0

        when (choose) {
            1 -> operatorsMenu()
            2 -> conditionalsMenu()
            3 -> loopsMenu()
            99 -> {
                println("Gracias por usar el programa.")
                return
            }
            else -> println("Opción inválida, intenta de nuevo.")
        }
    }
}

private fun operatorsMenu() {
    var choose: Int

    while (true) {
        println("BIENVENIDO AL MENÚ DE OPERADORES")
        println("1. Calcular el área de un triángulo.")
        println("2. Ingresar dos números y sumarlos.")
        println("3. Ingresar un número y visualizar el número elevado al cuadrado.")
        println("4. Convertir euros a dólares.")
        println("5. Calcular área y perímetro de un cuadrado.")
        println("6. Calcular área y volumen de un cilindro.")
        println("7. Calcular la longitud y el área del círculo inscrito.")
        println("8. Calcular el promedio de tres números.")
        println("99. Volver al menú principal.")
        print("Ingresa una opción: ")
        choose = readLine()?.toIntOrNull() ?: 0

        when (choose) {
            1 -> calculateTheAreaOfATriangle()
            2 -> sumNumbers()
            3 -> numberRaisedToSquared()
            4 -> converteurostodollars()
            5 -> areaPerimeterSquare()
            6 -> areaVolumeCylinder()
            7 -> areaCircle()
            8 -> averageNumbers()
            99 -> return
            else -> println("Opción inválida, intenta nuevamente.")
        }
    }
}
private fun calculateTheAreaOfATriangle() {
    println("Ingresa la base del triángulo: ")
    val base = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa la altura del triángulo: ")
    val height = readLine()?.toDoubleOrNull() ?: return

    val area = 0.5 * base * height
    println("El área del triángulo es de: $area")
}

private fun sumNumbers() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val sum = num1 + num2
    println("La suma de los números es de: $sum")
}

private fun numberRaisedToSquared() {
    println("Ingresa un número: ")
    val num = readLine()?.toDoubleOrNull() ?: return

    val square = num * num
    println("El número elevado al cuadrado es: $square")
}

private fun converteurostodollars() {
    println("Ingresa la cantidad en euros: ")
    val euros = readLine()?.toDoubleOrNull() ?: return

    val dollars = euros * 1.17 //Esto de acuerdo a que la tasa de cambio este con este valor
    println("$euros euros equivalen a $dollars dólares.")
}

private fun areaPerimeterSquare() {
    println("Ingresa el lado del cuadrado: ")
    val side = readLine()?.toDoubleOrNull() ?: return

    val area = side * side
    val perimeter = 4 * side

    println("El área del cuadrado es de: $area")
    println("El perímetro del cuadrado es de: $perimeter")
}

private fun areaVolumeCylinder() {
    println("Ingresa el radio del cilindro: ")
    val radius = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa la altura del cilindro: ")
    val height = readLine()?.toDoubleOrNull() ?: return

    val area = 2 * Math.PI * radius * (radius + height)
    val volume = Math.PI * radius * radius * height

    println("El área del cilindro es de: $area")
    println("El volumén del cilindro es de: $volume")
}

private fun areaCircle() {
    println("Ingresa el radio de la circunferencia: ")
    val rad = readLine()?.toDoubleOrNull() ?: return

    val circum = 2 * Math.PI * rad
    val area = Math.PI * rad * rad

    println("La longitud de la circunferencia es de: $circum")
    println("El área del círculo es de: $area")
}

private fun averageNumbers() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el tercer número: ")
    val num3 = readLine()?.toDoubleOrNull() ?: return

    val average = (num1 + num2 + num3) / 3
    println("El promedio de los tres números fue de: $average")
}



private fun conditionalsMenu() {
    var choose: Int

    while (true) {
        println("BIENVENIDO AL MENÚ DE LOS CONDICIONALES")
        println("1. Saber si el número ingresado por teclado es positivo o negativo.")
        println("2. Comparar dos números y mostrar cual de los dos es el mayor y el menor.")
        println("3. Encontrar el número menor y el número mayor de tres números enteros positivos.")
        println("4. Sumar o restar dos números según la condición dada.")
        println("5. Calcular el cociente entre dos números.")
        println("6. Sumar o multiplicar dos números según la condición dada.")
        println("7. Determinar si un año es bisiesto o no" +
                ".")
        println("99. Volver al menú principal.")
        print("Ingresa una opción: ")
        choose = readLine()?.toIntOrNull() ?: 0

        when (choose) {
            1 -> positiveNegative()
            2 -> compareNumbers()
            3 -> majorNumberMinorNumber()
            4 -> additionSubtraction()
            5 -> quotientNumbers()
            6 -> addMultiply()
            7 -> leapYear()
            99 -> return
            else -> println("Opción inválida, intenta de nuevo.")
        }
    }
}
private fun positiveNegative() {
    println("Ingresa un número: ")
    val num = readLine()?.toDoubleOrNull() ?: return

    if (num > 0) {
        println("El número es positivo.")
    } else if (num < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}

private fun compareNumbers() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val max = max(num1, num2)
    val min = min(num1, num2)

    println("El número mayor es el: $max")
    println("El número menor es el: $min")
}

private fun majorNumberMinorNumber() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el tercer número: ")
    val num3 = readLine()?.toDoubleOrNull() ?: return

    val max = maxNumber(num1, num2, num3)
    val min = minNumber(num1, num2, num3)

    println("El número mayor es el: $max")
    println("El número menor es el: $min")
}

fun minNumber(num1: Double, num2: Double, num3: Double): Double {
    return min(min(num1, num2), num3)
}

fun maxNumber(num1: Double, num2: Double, num3: Double): Double {
    return max(max(num1, num2), num3)
}

private fun additionSubtraction() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = if (num1 < num2) {
        num1 + num2
    } else {
        num1 - num2
    }

    println("El resultado es: $result")
}

private fun quotientNumbers() {
    println("Ingresa el número dividendo: ")
    val dividend = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el número divisor: ")
    val divisor = readLine()?.toDoubleOrNull() ?: return

    if (divisor == 0.0) {
        println("La división no es posible, el divisor es cero.")
    } else {
        val quotient = dividend / divisor
        println("El cociente es de: $quotient")
    }
}

private fun addMultiply() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = if (num1 < 0 || num2 < 0) {
        num1 + num2
    } else {
        num1 * num2
    }

    println("El resultado es de: $result")
}

private fun leapYear() {
    println("Ingresa un año: ")
    val year = readLine()?.toIntOrNull() ?: return

    val leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (leapYear) {
        println("$year si es un año bisiesto.")
    } else {
        println("$year no es un año bisiesto.")
    }
}


private fun loopsMenu() {
    var choose: Int

    while (true) {
        println("BIENVENIDO AL MENÚ DE LOS CICLOS")
        println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
        println("2. Imprimir los números impares entre 0 y 100.")
        println("3. Imprimir los números pares entre 1 y 100.")
        println("4. Imprimir los cuadrados de los números del 1 al 30.")
        println("5. Sumar los cuadrados de los cien primeros números naturales.")
        println("6. Generar y mostrar números entre dos valores de manera ascendente.")
        println("7. Sumar todos los números que se digitan por teclado mientras no sea cero.")
        println("99. Volver al menú principal.")
        print("Ingresa una opción: ")
        choose = readLine()?.toIntOrNull() ?: 0

        when (choose) {
            1 -> multiplesThree()
            2 -> oddNumbers()
            3 -> pairNumbers()
            4 -> printSquares()
            5 -> addTheSquares()
            6 -> generateAndDisplayNumbers()
            7 -> sumsNumbersTypedByKeyboard()
            99 -> return
            else -> println("Opción inválida, intenta de nuevo.")
        }
    }
}
private fun multiplesThree() {
    println("Los múltiplos de 3 entre 1 y 100: ")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println()
}

private fun oddNumbers() {
    println("Los números impares entre 0 y 100: ")
    for (i in 1..100 step 2) {
        print("$i ")
    }
    println()
}

private fun pairNumbers() {
    println("Los números pares entre 1 y 100:")
    for (i in 2..100 step 2) {
        print("$i ")
    }
    println()
}

private fun printSquares() {
    println("Los cuadrados de los números del 1 al 30:")
    for (i in 1..30) {
        val square = i * i
        print("$square ")
    }
    println()
}

private fun addTheSquares() {
    var sum = 0
    for (i in 1..100) {
        sum += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales da como resultado: $sum")
}

private fun generateAndDisplayNumbers() {
    println("Ingresa el primer número: ")
    val num1 = readLine()?.toIntOrNull() ?: return

    println("Ingresa el segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: return

    println("Estos son los números entre $num1 y $num2 en secuencia ascendente:")
    for (i in num1..num2) {
        print("$i ")
    }
    println()
}
private fun sumsNumbersTypedByKeyboard() {
    var sum = 0
    var num: Int

    do {
        println("Ingresa los números que deseas conocer su suma, si pones 0 se terminara: ")
        num = readLine()?.toIntOrNull() ?: 0
        sum += num
    } while (num != 0)

    println("La suma de los números ingresados es de: $sum")
}
