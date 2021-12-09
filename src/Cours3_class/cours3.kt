package Cours3_class

class cours3 {

}

/* Exemple de classe Java
public class User {

    // PROPERTIES
    private String email;
    private String password;
    private int age;

    // CONSTRUCTOR
    public User(String email, String password, int age){
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // GETTERS
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getAge() { return age; }

    // SETTERS
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setAge(int age) { this.age = age; }

}*/

// Voici la même classe en Kotlin
// En kotlin, la visibilité est par défaut public
// Il y a 4 visibilités : public, private, protected, internal
// public  : Un membre déclaré comme  public  sera visible partout et par tout le monde.
// private  : Un membre déclaré comme  private  sera visible uniquement dans la classe où il est déclaré.
// protected  : Un membre déclaré comme  protected  sera visible uniquement dans la classe où il est déclaré ET dans ses sous-classes (via l’héritage).
// internal : Un membre déclaré comme  internal  sera visible par tous ceux du même module. Un module est un ensemble de fichiers compilés ensemble (comme une librairie Gradle ou Maven, par exemple).

// Les getters et setters sont déclarés automatiquement grâce aux mots clés val et var
// val = getter
// var = getter et setter
class User(var email: String, var password: String, var age: Int)

//Voici l'instanciation d'un objet de la classe User en Java
//User user = new User("hello@gmail.com", "azerty", 27);
// et voir le résultat en Kotlin
val user = User("hello@gmail.com", "azerty", 27)

val user1 = User("hello@gmail.com", "azerty", 27)
user1.email // Getter
user1.email = "new_email@gmail.com" // Setter

// Si l'on veut modifier un getter ou un setter, il faut utiliser les méthodes getter et setter
class User1(email: String, var password: String, var age: Int){
    var email: String = email
        get() {
            // ; pour terminer la ligne
            // le mot-clé field nous sert à référer à la variable dans laquelle on est en train de travailler
            println("User is getting his email.");return field
        }
        set(value) {
            println("User is setting his email");field = value
        }
}

// pour changer la visibilité d'un attribut, il suffit de mettre private ou protected devant la déclaration de l'attribut
class User2(var email: String, private var password: String, var age: Int)