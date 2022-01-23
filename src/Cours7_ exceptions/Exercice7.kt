package `Cours7_ exceptions`

class Exercice7 {
    fun divide(a: Int, b: Int) = a/b

    fun main(args: Array<String>) {
        // Affichez un message personalisé lors d'une division par 0
        val result = try{ divide(10, 0)} catch (e: ArithmeticException) { "Division par 0 impossible" }
        println("Result is : $result")
    }

    // Correction
//    fun divide(a: Int, b: Int) = a/b
//
//    fun main(args: Array<String>) {
//        try{
//            val result = divide(10, 0)
//            println("Result is : $result")
//        }catch(e: Exception){
//            println("La division par 0 interdite !")
//        }
//    }

}