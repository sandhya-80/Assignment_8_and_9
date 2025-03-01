package Assignment9.animal

import org.scalatest.funsuite.AnyFunSuite

class DogTest extends AnyFunSuite {
  test("Dog should make Woof sound") {
    val dog = new Dog()
    assert(dog.makeSound() == "Woof")
  }
}
