package Lesson_1

fun main() {

    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / 3600
    val remainingSecondAfterHours: Int = totalSeconds % 3600
    val minutes: Int =  remainingSecondAfterHours / 60
    val seconds: Int =  remainingSecondAfterHours % 60

//    Отформатируем время
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время, проведённое Юрием Гагариным в космосе: $formattedTime")

}