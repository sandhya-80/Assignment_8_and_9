package Assignment9.animal

import org.scalatest.funsuite.AnyFunSuite

class CatTest extends AnyFunSuite {
  test("Cat should make Meow sound") {
    val cat = new Cat()
    assert(cat.makeSound() == "Meow")
  }
}
