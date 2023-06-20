import java.sql.RowIdLifetime

fun main() {
    var product1 = Product("Bairo", 21, 12)
    var product2 = Product("pencil", 20, 2 )

    var Wolf = Wildlife("wolf","carnovorous", 30, "summer")
    var giraffe = Wildlife("giraffe", "herbivorer", 20, "summer")
    Wolf.hunt
    giraffe.hunted
}


//**Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance might come into play if there are different types of
//stories or storytellers.

//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.



//3. **Wildlife Preservation:** You're a wildlife conservationist working on a
//program to track different species in a national park. Each species has its own
//characteristics and behaviors, such as its diet, typical lifespan, migration
//patterns, etc. Some species might be predators, others prey. You'll need to


// pseudocode
// input = name, diet, lifespan, migrationPatterns
// output = to keep  track of  different species in a national park
// process = create a class Animal, identify the attributes, create methods,
// understand what they are inheriting and also have each animals unique characteristics



open class Wildlife(var name: String, var diet:String, var lifeSpan: Int, var migrationPattern:String){
    open fun animalInformation(){
        println("this animals are all $diet")
    }
}
class Predator(name: String, diet: String,lifeSpan: Int,migrationPattern: String, var prey:String): Wildlife(name,diet,lifeSpan, migrationPattern){
     fun hunt(){
        println("the $name  is being hunting the $prey")
    }
}
class Prey (name: String, diet: String,lifeSpan: Int,migrationPattern: String, var predator:String): Wildlife(name,diet,lifeSpan, migrationPattern){
     fun hunted(){
        println("the $name  is being hunted down by the $predator")
    }
}

//create classes to model `Species`, `Predator`, `Prey`, etc., and think about how
//these classes might relate to each other through inheritance.
//4. **African Music Festival:** You're in charge of organizing a Pan-African music
//festival. Many artists from different countries, each with their own musical style
//and instruments, are scheduled to perform. You need to write a program to
//manage the festival lineup, schedule, and stage arrangements. Think about how
//you might model the `Artist`, `Performance`, and `Stage` classes, and consider
//how you might use inheritance if there are different types of performances or
//stages.


//5. Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

// pseudocode
// input = names, price, quantity
// output = getting the total value of the product
// process = create a class for product, identify the attributes, create methods
// and calculate their total


class Product (var name: String, var price:Int, var quantity:Int){
    fun productValue(){
        println(price * quantity)
    }
}
 var product1 = Product("Bairo", 20, 2)
 var product2 = Product("pencil", 20, 2 )



//6. Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.
//
//7. Create a FlightBooking class that represents a flight booking system. Implement
//methods to search for available flights based on destination and date, reserve
//seats for customers, manage passenger information, and generate booking
//confirmations.
//
//8. Create a LibraryCatalog class that handles the cataloging and management of
//books in a library. Implement methods to add new books, search for books by
//title or author, keep track of available copies, and display book details.