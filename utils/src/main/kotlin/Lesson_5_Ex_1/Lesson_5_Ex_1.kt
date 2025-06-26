package Lesson_5_Ex_1

fun main() {

    println("Чтобы доказать, что вы не бот, решите пример: $NUMBER1 + $NUMBER2 = ?")
    println("Введите ответ")

    val userAnswer = readln().toInt()

    println(if (userAnswer == CORRECT_SUM) "Добро пожаловать!" else "Доступ запрещен.")

}

const val NUMBER1 = 5
const val NUMBER2 = 3
const val CORRECT_SUM = NUMBER1 + NUMBER2