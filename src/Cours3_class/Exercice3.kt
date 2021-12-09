package Cours3_class

class Exercice3 {

}

class Student(var name: String = "", var isGraduated: Boolean = false) {
    private var password: String? = null

    fun setPassword(password: String) {
        this.password = password
        println("Password is updated")
    }
}

fun main(args: Array<String>) {
    val student = Student()
    student.name = "Erwan"
    println("Hello student, your name is : ${student.name} ")
    println("Your graduation status : ${student.isGraduated} ")
    student.setPassword("123456")
}
