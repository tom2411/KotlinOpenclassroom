package Cours6_smart_cast

class Exercice6 {
    open class Fruit(var name: String)

    class Apple() : Fruit("Apple")
    class Orange() : Fruit("Orange")
    class Banana() : Fruit("banana")
    class Strawberry() : Fruit("Strawberry")
    class Raspberry() : Fruit("Raspberry")


    fun showFruitColor(fruit: Fruit){
        // Complétez le code de cette fonction pour afficher la couleur du fruit
        when(fruit){
            is Apple -> println("Vert")
            is Orange -> println("Orange")
            is Banana -> println("Jaune")
            is Strawberry -> println("Rose")
            is Raspberry -> println("Rouge")
        }
    }

    fun main(args: Array<String>) {

        val apple = Apple()
        val orange = Orange()
        val strawberry = Strawberry()

        showFruitColor(apple)
        showFruitColor(orange)
        showFruitColor(strawberry)
    }

}