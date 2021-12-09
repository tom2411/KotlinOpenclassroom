package function

class Exercice2 {
    // Corrigez cette fonction
    fun sayMyName() { println(" $name ") }

    // Simplifiez cette fonction
    fun sayHello(): String {
        return "Hello"
    }

    // Simplifiez cette fonction
    fun isStudent(isLearning: Boolean): Boolean {
        if (isLearning){
            return true
        } else {
            return false
        }
    }


    fun main(args: Array<String>) {
        println( sayHello() )
        sayMyName("Name")
        println( "Is Student : ${isStudent(true)} " )
    }

}