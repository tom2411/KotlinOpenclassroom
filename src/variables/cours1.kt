package variables

import java.awt.Button

class cours1 {
    // Les différentes façons de déclarer une variable en Kotlin
    // Nous n'avons pas besoin de ; à la fin des déclarations

    // 1. Déclaration de la variable avec le mot-clé val
    // qui signifie que la variable est "immuable" (qu'on ne peut pas la modifier)
    // équivalent Java "final"
    // De plus, nous pouvons voir qu'il y a de l'inférence de type
    val question = "What's your name?"

    // 2. Déclaration de la variable avec le mot-clé val
    // cepandant, nous avons déclaré une variable de type String
    // Kotlin invite à fortement typer les variables
    val question: String = "What's your name?"

    // 3. Déclaration de la variable avec le mot-clé var
    // qui signifie que la variable est "muable" (qu'on peut la modifier)
    // ce qui est par défaut ce que fait Java
    var question: String = "What's your name?"


    val name: String = "Phil"
    val age: Int = 27
    val isDeveloper: Boolean = true
    // équivalent à
    val name = "Phil"
    val age = 27
    val isDeveloper = true

    // 4. Soyons plus subtil
    // Une variable déclarer avec val est immuable après son initialisation
    val message: String

    if (isUserHappy()){
        message = "Glad you're so happy ! :D"
    } else {
        message = "What's going on ? :("
    }

    // 5. Le Null Safety
    // Certain type ne suporte pas le null
    var name = "Phil"
    name = null

    // Kotlin nous indique que l'on doit tester notre variable
    // message avant de faire une action dessus car elle peut
    // être null
    var message: String? = "My mesage can possibly be null !"
    message.UpperCase()

    // Faire le test de la variable null
    var message: String? = "My mesage can possibly be null !"
    message?.UpperCase()
    // ou
    var message: String? = "My mesage can possibly be null !"
    if (message != null) message.UpperCase()

    // 6. Les Prints de variables

    // Avec le $ on peut placer des variables dans les prints
    val name = "Phil"
    print("Hello $name")

    // Faire des constantes en Kotlin
    const val SERVER_URL: String = "https://my.api.com"

    // Initialiser une variable après sa déclaration
    // on ne peut pas écrire ça
    var username: String

    // On peut écrire ça
    var username: String? = null
    // Cependant, on permet à notre variable d'être null
    // ce qui n'est pas vraiment ce que l'on veut faire

    // on peut utiliser le mot-clé "lateinit" pour indiquer que la variable
    // sera initialisée plus tard
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        submitButton = this.getSubmitButton()
    }
}