package MMO.Player

class player {
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
