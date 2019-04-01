package MMO.SateOfPlayer
import model.player
class InGame(person: player) extends state(person){
  override def whenLpressed(): Unit ={}
  override def whenRpressed(): Unit ={}
  override def whenUppressed(): Unit ={}
  override def whenDownpressed(): Unit ={}
  override def whenLreleased(): Unit = {}
  override def whenRreleased(): Unit = {}
  override def whenUpreleased(): Unit = {}
  override def whenDownreleased(): Unit = {}
  override def whenRockPressed(): Unit={
    person.Rock()
  }
  override def whenPaperPressed(): Unit={
    person.Paper()
  }
  override def whenScizzorsPressed(): Unit={
    person.scizzors()
  }
  override def isinGame: Boolean = {
    true
  }
}
