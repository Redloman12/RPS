package MMO.gameObjects

//import MMO.SateOfPlayer.{InGame, moving, state}
import MMO.physics._
import model.Database

class Player2(Location: PhysicsVector, Velocity: PhysicsVector) extends PhysicalObject(Location, Velocity) {
  var user: String = ""
  var speed = 4.0
  var score: Double = 0.0

  var inGame: Boolean = false

  var choice: Int = 0

  def move(direction: PhysicsVector){
    val normalDirection = direction.normal2d()
    this.velocity = new PhysicsVector(normalDirection.x * speed, normalDirection.y * speed)
  }

  def stop(): Unit ={
    this.velocity = new PhysicsVector(0, 0)
  }
}
