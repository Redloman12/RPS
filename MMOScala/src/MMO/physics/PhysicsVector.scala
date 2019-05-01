package MMO.physics

class PhysicsVector(var x: Double, var y: Double, var z: Double = 0){
  def distance2d(other: PhysicsVector): Double = {
    math.sqrt(math.pow(x - other.x, 2.0) + math.pow(y - other.y, 2.0))
  }

  def normal2d(): PhysicsVector = {
    if (x == 0 && y == 0) {
      new PhysicsVector(0, 0)
    } else {
      val magnitude = math.sqrt(math.pow(x, 2.0) + math.pow(y, 2.0))
      new PhysicsVector(x / magnitude, y / magnitude, z)
    }
  }

  override def toString: String = {
    "(" + x + ", " + y + ", " + z + ")"
  }
}
