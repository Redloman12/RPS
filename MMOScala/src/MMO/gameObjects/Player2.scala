package MMO.gameObjects

import MMO.physics._

class Player2(Location: PhysicsVector, Velocity: PhysicsVector) extends PhysicalObject(Location, Velocity) {

  var speed = 4.0
  var score: Double = 0.0

  var choice: Int = 0

  def move(direction: PhysicsVector){
    val normalDirection = direction.normal2d()
    this.velocity = new PhysicsVector(normalDirection.x * speed, normalDirection.y * speed)
  }

  def stop(): Unit ={
    this.velocity = new PhysicsVector(0, 0)
  }
}
