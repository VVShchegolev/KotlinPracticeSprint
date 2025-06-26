package Lesson_5_Ex_3

fun main() {

    // Ввод чисел пользователем с подсказками
    println("Введите первое число (от 0 до 42):")
    val userNumber1 = readLine()!!.toInt()
    println("Введите второе число (от 0 до 42):")
    val userNumber2 = readLine()!!.toInt()

    // Проверка выигрыша
    val isFirstNumberCorrect = userNumber1 == WINNING_NUMBER1 || userNumber1 == WINNING_NUMBER2
    val isSecondNumberCorrect = userNumber2 == WINNING_NUMBER1 || userNumber2 == WINNING_NUMBER2
    val isMainPrize = isFirstNumberCorrect && isSecondNumberCorrect && userNumber1 != userNumber2
    val isConsolationPrize = (isFirstNumberCorrect || isSecondNumberCorrect) && !isMainPrize

    // Вывод результата
    println(when {
        isMainPrize -> "Поздравляем! Вы выиграли главный приз!"
        isConsolationPrize -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    })

    // Вывод правильных чисел
    println("Правильные числа: $WINNING_NUMBER1 и $WINNING_NUMBER2")

}

// Правильные числа лотереи
const val WINNING_NUMBER1 = 15
const val WINNING_NUMBER2 = 30