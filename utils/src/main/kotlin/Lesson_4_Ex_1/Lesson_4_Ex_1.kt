package Lesson_4_Ex_1

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val isAvailableToday = bookedToday < TOTAL_TABLES
    val isAvailableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("[Доступность столиков на сегодня: $isAvailableToday],\n[Доступность столиков на завтра: $isAvailableTomorrow]")
}

const val TOTAL_TABLES = 13