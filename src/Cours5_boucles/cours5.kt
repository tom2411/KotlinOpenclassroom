package Cours5_boucles

class cours5 {
    // WHILE Java
    /*
    while (isARainyDay) {
        System.out.println("I don't love rain...");
    }

    // Do While
    do {
        System.out.println("I don't love rain...");
    } while (isARainyDay)*/

    //While Kotlin
    while (isARainyDay)
    {
        println("I don't love rain...")
    }

    // Do While
    do
    {
        println("I don't love rain...")
    } while (isARainyDay)

    // Pour les boucles for
    // Java
    /*List<String> names = Arrays.asList("Jake Wharton", "Joe Birch", "Robert Martin");

    for (String name : names) {
        System.out.println("This developer rocks : " + name);
    }*/

    // Kotlin
    // le in remplace les : du for Java
    val names = listOf("Jake Wharton", "Joe Birch", "Robert Martin");

    for (name in names)
    {
        println("This developer rocks : $name");
    }

    // For avec index
    for (i in names.indices)
    {
        println("This developer with number $i rocks : ${names[i]}")
    }

    for ((index, value ) in names.withIndex())
    {
        println("This developer with number $index rocks : $value")
    }

    // cette boucle Java N'EXISTE PAS en Kotlin
    /*for(int i = 1; i <= 42; i++) {
        System.out.println("I love this number : "+i);
    */

    // elle est remplacé par
    // L'intervale de i est fermé et inclusif
    for (i in 1..42)
    {
        println("I love this number : $i")
    }

    // On peut également utiliser les boucles for comme ceci
    // sortie : les entier de 10 à 1 avec 1 pas de 2
    for (i in 10 downTo 1 step 2)
    {
        println("Index is :$i")
    }

    // Ou ceci
    for (i in 1..10 step 2)
    {
        println("Index is :$i")
    }


    // On peut également créer différement des listes
    // listOf
    val listOfNames = listOf("Jake Wharton", "Joe Birch", "Robert Martin")
    listOfNames[0] // => Jake Wharton
    listOfNames[0] = "Mathieu Nebra" // => ERROR ! List is immutable

    // mutableListOf
    val listOfNames = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
    listOfNames[0] // => Jake Wharton
    listOfNames[0] = "Mathieu Nebra" // => SUCCESS !

    // setOf
    val setOfNames = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
    listOfNames.first() // => Jake Wharton
    listOfNames.add("Mathieu Nebra") // => ERROR ! Set is immutable

    // mutableSetOf
    val setOfNames = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")
    listOfNames.first() // => Jake Wharton
    listOfNames.add("Mathieu Nebra") // => SUCCESS !
}