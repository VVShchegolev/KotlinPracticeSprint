package Lesson_3_Ex_2

fun main() {

    val name = "Татьяна"
    val middleName = "Сергеевна"
    var surname = "Андреева"
    var age = 20

    var fullName = "$surname $name $middleName"
    println("[$fullName, $age]")

//    можно использовать и такой вариант
//    println("[$surname $name $middleName, $age]")

    surname = "Сидорова"
    age = 22

    fullName = "$surname $name $middleName"
    println("[$fullName, $age]")
//    можно использовать и такой вариант
//    println("[$surname $name $middleName, $age]")

}