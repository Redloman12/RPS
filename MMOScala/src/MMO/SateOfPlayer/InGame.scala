package MMO.SateOfPlayer

class InGame(person: player) extends state(player) {
  override def whenLpressed(): Unit ={}
  override def whenRpressed(): Unit ={}
  override def whenUppressed(): Unit ={}
  override def whenDownpressed(): Unit ={}
  override def whenLreleased(): Unit = {}
  override def whenRreleased(): Unit = {}
  override def whenUpreleased(): Unit = {}
  override def whenDownreleased(): Unit = {}
  override def isinGame(): Unit = {
    True
  }
}
