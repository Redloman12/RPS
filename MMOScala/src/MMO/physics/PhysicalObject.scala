package MMO.physics

import MMO.gameObjects.GameObject

class PhysicalObject(var location: PhysicsVector, var velocity: PhysicsVector) extends GameObject{
  def collide(): Unit = {}


  override def toString = s"PhysicalObject($location, $velocity)"
}
