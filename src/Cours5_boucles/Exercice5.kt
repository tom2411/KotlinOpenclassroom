package Cours5_boucles

class Exercice5 {

    fun showList(list: List<String>){
        // Complétez la fonction pour afficher les éléments de la liste
        for (i in list){
            println(i)
        }
    }

    fun oddNumbersTo10(){
        // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
        for (i in 1..10 step 2){
            println(i)
        }
    }

    private val languages = listOf("Java","Python","C","C++").sorted() // Créez une liste ordonnée de plusieurs languages de programation

    fun main(args: Array<String>) {
        println("Languages :")
        showList(languages)
        println("Odd Numbers to 10 :")
        oddNumbersTo10()
    }



}
