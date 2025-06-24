package Lesson_3_Ex_5

fun main() {

    val moveString = "D2-D4;0"

//    Разбираем строку на части по ";"
    val parts = moveString.split(";")
    val movePart = parts[0]
    val moveNumber = parts[1].toInt()

//    Разбираем "D2-D4" на "D2" и "D4"
    val moveDetails = movePart.split("-")
    val from = moveDetails[0]
    val to = moveDetails[1]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")

}