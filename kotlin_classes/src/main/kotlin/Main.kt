fun main() {
    val pushok: Dog = Dog("Pushok", 2)
    pushok.say_something()
    val murka: Cat = Cat("Murka",1)
    murka.say_something()
    murka.bite(pushok)
}

abstract class Animal(val name: String, val age: Int){

    abstract fun say_something()
    abstract fun bite(animal: Animal)
}

class Dog(name: String, age: Int): Animal(name, age) {
    val sound = "Ауф идерзейн"
    override fun say_something(){
        println(sound)
    }

    override fun bite(animal: Animal) {
        println("${animal.name} был куцнут")
    }
}

class Cat(name: String, age: Int): Animal(name, age) {
    val sound = "Миау! Вы продоёте рыбов?"
    override fun say_something(){
        println(sound)
    }
    override fun bite(animal: Animal) {
        println("${animal.name} был куцнут")
    }

}


