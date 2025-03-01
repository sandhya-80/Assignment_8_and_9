package Assignment9.utils

import org.scalatest.funsuite.AnyFunSuite

class HelperTest extends AnyFunSuite {
  test("Helper should format sound correctly") {
    assert(Helper.formatSound("Cat", "Meow") == "Cat makes sound Meow")
    assert(Helper.formatSound("Dog", "Woof") == "Dog makes sound Woof")
  }
}
