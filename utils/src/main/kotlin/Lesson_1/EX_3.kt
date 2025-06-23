package Lesson_1

fun main() {

    val nameOfCosmicMan: String = "Юрий Гагарин"
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Год полёта: $year")
    println("Час взлёта: $hour")
    println("Минута взлёта: $minute")

    hour = 10
    minute = 55
    println()
    println("Время посадки $nameOfCosmicMan: $hour:$minute")

}