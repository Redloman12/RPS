package MMO.Control

import javafx.event.EventHandler
import javafx.scene.input.KeyEvent
import MMO.Player._

abstract class Keys(person: player) extends EventHandler[KeyEvent]{
  val left: String
  val right: String
  val up: String
  val down: String
  override def handle(event: KeyEvent): Unit = {
    val code = event.getCode
    val eventtype = event.getEventType.getName
    eventtype match{
      case "Pressed" => code.getName match{
        case this.left => person.whenLpressed()
        case this.right => person.right()
        case this.up => person.up()
        case this.down => person.down()
      }
    }
  }
}
