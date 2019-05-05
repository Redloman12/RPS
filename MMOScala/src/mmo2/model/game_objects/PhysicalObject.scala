package mmo2.model.game_objects

import mmo2.model.physics.PhysicsVector

class PhysicalObject(var location: PhysicsVector, var velocity: PhysicsVector) extends GameObject {

  def onGround(): Unit = {}
  def collide(): Unit = {}


  override def toString = s"PhysicalObject($location, $velocity)"
}
