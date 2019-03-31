package MMO.SateOfPlayer
import MMO.Player.player
class InGame(person: player) extends state(person){
  override def whenLpressed(): Unit ={}
  override def whenRpressed(): Unit ={}
  override def whenUppressed(): Unit ={}
  override def whenDownpressed(): Unit ={}
  override def whenLreleased(): Unit = {}
  override def whenRreleased(): Unit = {}
  override def whenUpreleased(): Unit = {}
  override def whenDownreleased(): Unit = {}
  override def isinGame: Boolean = {
    true
  }
}
