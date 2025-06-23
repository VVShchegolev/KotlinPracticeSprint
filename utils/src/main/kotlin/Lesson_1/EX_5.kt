package Lesson_1

fun main() {

    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / SECOND_IN_HOUR
    val remainingSecondAfterHours: Int = totalSeconds % SECOND_IN_HOUR
    val minutes: Int =  remainingSecondAfterHours / SECONDS_IN_MINUTE
    val seconds: Int =  remainingSecondAfterHours % SECONDS_IN_MINUTE

//    Отформатируем время
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время, проведённое Юрием Гагариным в космосе: $formattedTime")

}

const val SECOND_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60
