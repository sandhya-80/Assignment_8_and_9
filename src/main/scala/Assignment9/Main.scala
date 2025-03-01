package Assignment9

import Assignment9.animal.{Cat, Dog}
import Assignment9.utils.Helper

@main def run(): Unit = {
  val cat = new Cat()
  val dog = new Dog()

  println(Helper.formatSound("Cat", cat.makeSound()))
  println(Helper.formatSound("Dog", dog.makeSound()))
}
