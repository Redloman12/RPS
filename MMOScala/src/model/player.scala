package model

import MMO.SateOfPlayer._
import MMO.physics._



class player(Location: PhysicsVector, velocity: PhysicsVector) extends PhysicalObject(Location, velocity){
  var points: Double = 0
  var speed: Int = 200
  val width: Int = 50
  val height: Int = 50

  var state: state = new moving(this)

  var Choice = 0

  def whenLpressed(): Unit ={
    this.state.whenLpressed()
  }

  def whenRpressed(): Unit = {
    this.state.whenRpressed()
  }

  def whenUppressed(): Unit = {
    this.state.whenUppressed()
  }
  def whenDownpressed(): Unit ={
    this.state.whenDownpressed()
  }

  def whenRockPressed(): Unit = {
    this.state.whenRockPressed
  }
  def whenPaperPressed(): Unit = {
    this.state.whenPaperPressed
  }
  def whenScizzorsPressed(): Unit ={
    this.state.whenScizzorsPressed
  }
  def left(): Unit = {
    this.location.x -= 0.5
  }
  def right(): Unit = {
    this.location.x += 0.5
  }

  def up(): Unit={
    this.location.y += 0.5
  }
  def down(): Unit ={
    this.location.y -= 0.5
  }

  def Rock(): Unit ={
    this.Choice = 1
  }
  def Paper(): Unit = {
    this.Choice = 2
  }
  def scizzors(): Unit = {
    this.Choice = 3
  }

  def isingame: Boolean = {
    this.state.isinGame
  }
}
