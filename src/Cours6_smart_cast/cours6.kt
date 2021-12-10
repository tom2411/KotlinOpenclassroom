package Cours6_smart_cast

class cours6 {
    // Le smart cast en Kotlin
    // le is nous permet de nous passer du instanceof de Java
    //Egalement, on voit que l'objet en paramètre est de type Any qui est la superclasse de tous les objets
    // Aussi nous n'avons pas besoin de faire un cast explicite car le is s'en occupe déjà
    private fun getDefaultSize(anyObject: Any): Int {
        // Vérification du type
        if (anyObject is String) {
            return anyObject.length
            // Vérification du type
        } else if (anyObject is List<*>) {
            return anyObject.size
        }
        return 0
    }

    // simplification de la fonction précédente
    private fun getDefaultSize2(anyObject: Any) = when (anyObject) {
        is String -> anyObject.length
        is List<*> -> anyObject.size
        else -> 0
    }

    // unsafe cast, on utilise le as pour forcer le cast
    // il est dit non sécurisé car il nous renverra une exception si le cast n'est pas possible
    // de type ClassCastException
    val anyObject: Any = "Hello Kotlin students !"
    val message = anyObject as String
    println(message)


    // pour gérer l'exception
    // le bon vieux try/catch
    val anyObject: Any = "Hello Kotlin students !"

    try{
        val message = anyObject as Int
        print(message)

    } catch(excetpion: ClassCastException) {
        print("Error !")
    }

    // Sinon avec le ? pour dire que l'on accepte le null
    val anyObject: Any = "Hello Kotlin students !"
    val message: Int? = anyObject as? Int
    print(message)

}