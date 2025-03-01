package Assignment9.traits

import org.scalatest.funsuite.AnyFunSuite
import Assignment9.animal.Cat

class SoundTest extends AnyFunSuite {
  test("Cat should implement Sound trait and return 'Meow'") {
    val cat = new Cat()
    assert(cat.makeSound() == "Meow")
  }
}
