package MMO.Player

import MMO.SateOfPlayer.state

class player(var x: Int, var y: Int, val id: String){
  var speed: Int = 200
  val width: Int = 50
  val height: Int = 50


  var LPressed = false
  var Rpressed = false
  var UpPressed = false
  var DownPressed = false

  def whenLpressed(): Unit ={
    this.LPressed = true
    this.state.whenLpressed
  }

  def whenRpressed(): Unit = {
    this.LPressed = true
    this.state.whenRpressed
  }
  def whenUppressed(): Unit = {
    this.LPressed = true
    this.state.whenUppressed
  }
  def whenDownpressed(): Unit = {
    this.LPressed = true
    this.state.whenDownPressed
  }
}
