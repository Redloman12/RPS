package MMO.SateOfPlayer

import MMO.gameObjects.{Player2, player}

abstract class state(person: Player2) {
  def whenLpressed(): Unit ={}
  def whenRpressed(): Unit ={}
  def whenUppressed(): Unit ={}
  def whenDownpressed(): Unit ={}
  def whenRockPressed(): Unit={}
  def whenPaperPressed(): Unit=()
  def whenScizzorsPressed(): Unit=()
  def isinGame: Boolean = {
    false
  }
}
