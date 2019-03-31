package MMO.Player
import MMO.SateOfPlayer.{notmoving, state}

class player(var x: Int, var y: Int, val id: String){
  var points: Int = 0
  var speed: Int = 200
  val width: Int = 50
  val height: Int = 50

  var state: state = new notmoving(this)

  var LPressed = false
  var Rpressed = false
  var UpPressed = false
  var DownPressed = false

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
    this.LPressed = true
    this.state.whenLreleased()
  }

  def whenRreleased(): Unit = {
    this.LPressed = true
    this.state.whenRreleased()
  }

  def whenUpreleased(): Unit = {
    this.LPressed = true
    this.state.whenUpreleased()
  }

  def whenDownreleased(): Unit = {
    this.LPressed = true
    this.state.whenDownreleased()
  }
  def left(): Unit = {
    this.x = -this.speed
  }
  def right(): Unit = {
    this.x = this.speed
  }

  def up(): Unit={
    this.y = -this.speed
  }
  def down(): Unit ={
    this.y = this.speed
  }

  def isingame: Boolean = {
    this.state.isinGame
  }
}
