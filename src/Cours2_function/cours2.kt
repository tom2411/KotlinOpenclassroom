package Cours2_function

class cours2 {

    // La définition d'une fonction en Kotlin
    private fun main(args: Array<String>) {
        println("Hello, world!")
    }

    // En Kotlin on peut retourner un if
    // car c'est une expression et non une instruction comme en Java
    // le type qui se trouve après les parentheses est le type de retour
    // de la fonction
    private fun minOf(a: Int, b: Int): Int {
        return if(a < b ) a else b
    }


    private fun main2(args: Array<String>) {
        println("Hello, world!")
    }

    // Unit est le type de retour par défaut
    // équivalent à void en Java
    // Quasiment jamais écrit grâce à l'inférence de type
    var hello: Unit = main(arrayOf(""))

    // On peut également coder des fonctions qui n'ont pas de corps
    private fun minOf2(a: Int, b: Int): Int = if (a < b) a else b
    // ou plus lisible
    private fun minOf3(a: Int, b: Int) = if (a < b) a else b

    // Ces 3 fonctions sont équivalentes
    fun sayHello1() = println("Hello !")

    fun sayHello2(): Unit = println("Hello !")

    fun sayHello3(): Unit { println("Hello !") }

    // 😱
    // L'inférence de type ne fonctionne pas si nous avons un corps de fonction
    // c'est pour optimiser les performances du compilateur
    fun getUrlApi1() { return "https://www.my.api.com" }

    // 🙂
    fun getUrlApi2(): String { return "https://www.my.api.com" }

    // 😎
    fun getUrlApi3() = "https://www.my.api.com"

}