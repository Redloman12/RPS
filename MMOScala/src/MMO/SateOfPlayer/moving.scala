package MMO.SateOfPlayer

import MMO.Player.player

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
    person.down
  }
  override def whenLreleased(): Unit = {
    person.state = new notmoving(person)
  }
  override def whenRreleased(): Unit = {
    person.state = new notmoving(person)
  }
  override def whenUpreleased(): Unit = {
    person.state = new notmoving(person)
  }
  override def whenDownreleased(): Unit = {
    person.state = new notmoving(person)
  }
  override def isinGame: Boolean = {
    false
  }
}
