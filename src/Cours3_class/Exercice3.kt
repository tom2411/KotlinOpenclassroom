package Cours3_class

class Exercice3 {

}

class Student(){

    var name: String
    var isGraduated: Boolean
    private var password: String? = null

    init{
        this.name = ""
        this.isGraduated = false
    }

    //Create the function setPassword
}


fun main(args: Array<String>) {

    val student = Student()
    student.name = "Erwan"
    println("Hello student, your name is : ${student.name} ")
    println("Your graduation status : ${student.isGraduated} ")
    //student.setPassword("123456")
}
