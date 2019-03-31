package MMO.SateOfPlayer
import MMO.Player.player
abstract class state(person: player) {
  def whenLpressed(): Unit ={}
  def whenRpressed(): Unit ={}
  def whenUppressed(): Unit ={}
  def whenDownpressed(): Unit ={}
  def whenLreleased(): Unit = {}
  def whenRreleased(): Unit = {}
  def whenUpreleased(): Unit = {}
  def whenDownreleased(): Unit = {}
  def isinGame: Boolean = {
    false
  }
}
