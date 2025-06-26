package Lesson_5_Ex_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(NUMBER_COUNT) { Random.nextInt(0, MAX_NUMBER + 1) }.toSet().toList()

    // Ввод чисел пользователем с подсказками
    println("Введите первое число (от 0 до $MAX_NUMBER):")
    val userNumber1 = readLine()!!.toInt()
    println("Введите второе число (от 0 до $MAX_NUMBER):")
    val userNumber2 = readLine()!!.toInt()
    println("Введите третье число (от 0 до $MAX_NUMBER):")
    val userNumber3 = readLine()!!.toInt()

    // Сохранение введенных чисел в список
    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    // Проверка совпадений с использованием intersect
    val matches = winningNumbers.intersect(userNumbers).size

    // Вывод результата в зависимости от количества совпадений
    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Неудача! Вы не угадали ни одного числа.")
    }

    // Вывод выигрышных чисел
    println("Выигрышные числа: ${winningNumbers.joinToString(", ")}")
}

// Генерация трех случайных чисел от 0 до 42
const val MAX_NUMBER = 42
const val NUMBER_COUNT = 3