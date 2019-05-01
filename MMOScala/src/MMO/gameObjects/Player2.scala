package MMO.gameObjects

import MMO.physics._

class Player2(Location: PhysicsVector, velocity: PhysicsVector) extends PhysicalObject(Location, velocity) {

  def move(direction: PhysicsVector){
    val normalDirection = direction.normal2d()
    this.velocity = new PhysicsVector(normalDirection.x * speed, normalDirection.y * speed)
  }

  def stop(): Unit ={
    this.velocity = new PhysicsVector(0, 0)
  }
}
