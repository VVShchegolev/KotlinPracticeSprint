package Lesson_1

fun main() {

    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println("""
        Расстояние: $length
        Возраст: $age
        Часть дня: $partOfDay
        Секунды: $seconds
        Часть года: $partOfYear
        Апогей орбиты: $apogee
    """.trimIndent())

//    можно конечно вывести через кучу println()
//    или сделать так:
//    println(" Расстояние: $length \n Возраст: $age \n Часть дня: $partOfDay \n Секунды: $seconds \n Часть года: $partOfYear \n Апогей орбиты: $apogee")

}