package Assignment8

trait Flying {
  def fly(): String = "Flying!"
}

trait Swimming {
  def swim(): String = "Swimming!"
}

// Unit Tests for Traits
object TraitTest1 {
  def main(args: Array[String]): Unit = {
    val flying = new Flying{}
    val swimming = new Swimming {}

    assert(flying.fly() == "Flying!", "Flying trait test failed!")
    assert(swimming.swim() == "Swimming!", "Swimming trait test failed!")

    println("Traits tested successfully!")
  }
}




