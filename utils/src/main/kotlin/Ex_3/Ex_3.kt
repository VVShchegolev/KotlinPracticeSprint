package Ex_3

fun main() {

    val trainHour = 9
    val trainMinute = 39
    val travelTimeMinutes = 457

    val trainTotalMinutes = trainHour * 60 + trainMinute
    val arrivalTotalMinutes = trainTotalMinutes + travelTimeMinutes
//    вычисляем час и минуту прибытия
    val arrivalHour = (arrivalTotalMinutes / 60) % 24 // 24 - часов в сутки
    val arrivalMinute = arrivalTotalMinutes % 60

    val formattedArrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)

    println("Время прибытия поезда: $formattedArrivalTime")
}