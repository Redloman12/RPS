package model

import MMO.SateOfPlayer._
import MMO.physics._



class player(Location: PhysicsVector, velocity: PhysicsVector) extends PhysicalObject(Location, velocity){
  var points: Double = 0
  var speed: Int = 200
  val width: Int = 50
  val height: Int = 50

  var state: state = new moving(this)

  var LPressed = false
  var Rpressed = false
  var UpPressed = false
  var DownPressed = false

  var Choice = 0

  def whenLpressed(): Unit ={
    this.LPressed = true
    this.state.whenLpressed()
  }

  def whenRpressed(): Unit = {
    this.LPressed = true
    this.state.whenRpressed()
  }

  def whenUppressed(): Unit = {
    this.LPressed = true
    this.state.whenUppressed()
  }

  def whenDownpressed(): Unit = {
    this.LPressed = true
    this.state.whenDownpressed()
  }

  def whenLreleased(): Unit ={
    this.LPressed = false
    this.state.whenLreleased()
  }

  def whenRreleased(): Unit = {
    this.LPressed = false
    this.state.whenRreleased()
  }

  def whenUpreleased(): Unit = {
    this.LPressed = false
    this.state.whenUpreleased()
  }

  def whenDownreleased(): Unit = {
    this.LPressed = false
    this.state.whenDownreleased()
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
    this.velocity.x = -this.speed
  }
  def right(): Unit = {
    this.velocity.x = this.speed
  }

  def up(): Unit={
    this.velocity.y = -this.speed
  }
  def down(): Unit ={
    this.velocity.y = this.speed
  }

  def releasedleft(): Unit ={
    this.velocity.x = 0
  }
  def releasedright(): Unit={
    this.velocity.x = 0
  }

  def releasedup(): Unit={
    this.velocity.y = 0
  }
  def releaseddown(): Unit={
    this.velocity.y = 0
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