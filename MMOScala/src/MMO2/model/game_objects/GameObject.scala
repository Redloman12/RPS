package MMO2.model.game_objects

class GameObject {

  var destroyed: Boolean = false

  def destroy(): Unit = {
    destroyed = true
  }

}
