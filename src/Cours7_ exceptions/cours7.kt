package `Cours7_ exceptions`

class cours7 {
    // les exceptions
    // en Java
    /*private int substractNumber(int a, int b) throws Exception {
        if (a >= b) return a - b;
        else throw new Exception("a is smaller than b !")
    }*/

    // en Kotlin
    private fun substractNumber(a: Int, b: Int) = if (a >= b) a - b else throw Exception("a is smaller than b !")

    // en Kotlin, on ne fait pas la différence entre les exceptions non gérées et les exceptions gérées
    // Expression non gérée
    subtracNumber(20, 10)

    // Expression gérée
    try {
        substractNumber(20, 10);
    } catch (e: Exception) {
        println(e.message)
    }

    // Cependant attention à utiliser la permier dans des cas où l'on est sur qu'aucune exception ne sera levée

    // Egalement en Kotlin, les try catch et le throw sont des expressions, ce qui permet de faire ceci :
    val password = user.password?: throw IllegalArgumentException("Password required")

    // l'opérateur ?: est un opérateur qui permet de faire une opération si une valeur est nulle
    // il s'appelle l'operateur Elvis

    // nous pouvons également éviter de faire de copier coller pour tester les exceptions
    // Nothing est le Type retourné d'une expression "throw"
    private fun fail(message: String): Nothing = throw IllegalStateException(message)

    val password = user.password ?: fail("Password required")
    val email = user.email ?: fail("Email required")

    // le type de renvoie Nothing est un type que renvoie une expression "throw"
    // il est aussi utilisé pour la fonction TODO()

    // Voici un exemple d'une fonction qui utilise le try catch en tant qu'expression
    val result = try { substractNumber(10,20) } catch (é: Exception) { 0 }
    print(result)
}