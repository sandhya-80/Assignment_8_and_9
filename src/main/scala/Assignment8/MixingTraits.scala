package Assignment8
class Duck extends Flying with Swimming {
  def quack(): String = "Quack!"
}

class Penguin extends Swimming {
  def waddle(): String = "Waddle!"
}

// Unit Tests for Mixing Traits
object TraitTest2 {
  def main(args: Array[String]): Unit = {
    val duck = new Duck
    val penguin = new Penguin

    println(s"Duck : ${duck.fly()}")
    println(s"Duck : ${duck.swim()}")
    println(s"Duck : ${duck.quack()}")

    println(s"Penguin : ${penguin.swim()}")
    println(s"Penguin : ${penguin.waddle()}")

    assert(duck.fly() == "Flying!")
    assert(duck.swim() == "Swimming!")
    assert(duck.quack() == "Quack!")

    assert(penguin.swim() == "Swimming!")
    assert(penguin.waddle() == "Waddle!")

    println("Mixing traits tested successfully!")
  }
}
