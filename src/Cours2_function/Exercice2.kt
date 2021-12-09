package Cours2_function

class Exercice2 {
    // Corrigez cette fonction
    fun sayMyName(name: String) = println(" $name ")

    // Simplifiez cette fonction
    fun sayHello() =  "Hello"

    // Simplifiez cette fonction
    fun isStudent(isLearning: Boolean) = isLearning

    fun main(args: Array<String>) {
        println( sayHello() )
        sayMyName("Name")
        println( "Is Student : ${isStudent(true)} " )
    }

}