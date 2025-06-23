package Ex_2

fun main() {

    val regularEmployers = 50
    val regularSalary = 30000
    val interns = 30
    val internSalary = 20000

//    Расходы на зарплату постоянных сотрудников
    val regularEmployersSalary = regularEmployers * regularSalary

//    Общие расходы по зарплате после прихода стажеров
    val totalSalary = (regularEmployers * regularSalary) + (interns * internSalary)

//    Средняя зарплата одного сотрудника после устройства стажёров
    val averageSalary = totalSalary / (regularEmployers + interns)

    println("Расходы на зарплату постоянных сотрудников: $regularEmployersSalary рублей")
    println("Общие расходы по зарплате: $totalSalary рублей")
    println("Средняя зарплата одного сотрудника: $averageSalary рублей")
}