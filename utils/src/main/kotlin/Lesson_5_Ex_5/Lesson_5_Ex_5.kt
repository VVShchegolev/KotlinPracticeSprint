package Lesson_5_Ex_5

fun main() {

    val winningNumbers = List(NUMBER_COUNT) { (0..MAX_NUMBER).random() }

    println("Введите первое число (от 0 до $MAX_NUMBER):")
    val userNumber1 = readln().toInt()
    println("Введите второе число (от 0 до $MAX_NUMBER):")
    val userNumber2 = readln().toInt()
    println("Введите третье число (от 0 до $MAX_NUMBER):")
    val userNumber3 = readln().toInt()

    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    val matches = winningNumbers.intersect(userNumbers).size

    when (matches) {
        NUMBER_COUNT -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Неудача! Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winningNumbers.joinToString(", ")}")
}

const val MAX_NUMBER = 42
const val NUMBER_COUNT = 3