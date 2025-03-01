package Assignment8

trait SparrowTrait {
  def chirp(): String = "Chirp chirp!"
}

trait ParrotTrait {
  def chirp(): String = "Squawk! I can produce sounds!"
}

class HybridBird extends SparrowTrait with ParrotTrait {
  override def chirp(): String = super[ParrotTrait].chirp() // Resolving conflict by choosing ParrotTrait's method
}

// Unit Tests for Method Conflict Resolution
object TraitTest3 {
  def main(args: Array[String]): Unit = {
    val hybridBird = new HybridBird
    println(s"Hybrid bird chirping : ${hybridBird.chirp()}")
    assert(hybridBird.chirp() == "Squawk! I can produce sounds!")
    println("Method conflict resolution tested successfully!")
  }
}

