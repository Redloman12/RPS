package MMO.SateOfPlayer

import MMO.gameObjects.player

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
  override def isinGame: Boolean = {
    false
  }
}
