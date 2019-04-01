package MMO.SateOfPlayer

import model.player

class moving(person: player) extends state(person){
  override def whenLpressed(): Unit ={
    person.left()
  }
  override def whenRpressed(): Unit ={
    person.right()
  }
  override def whenUppressed(): Unit ={
    person.up()
  }
  override def whenDownpressed(): Unit ={
    person.down()
  }
  override def whenLreleased(): Unit = {
    person.releasedleft()
  }
  override def whenRreleased(): Unit = {
    person.releasedright()
  }
  override def whenUpreleased(): Unit = {
    person.releasedup()
  }
  override def whenDownreleased(): Unit = {
    person.whenDownreleased()
  }
  override def isinGame: Boolean = {
    false
  }
}
