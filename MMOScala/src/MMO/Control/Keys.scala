package MMO.Control

import javafx.event.EventHandler
import javafx.scene.input.KeyEvent
import model.player

abstract class Keys(person: player) extends EventHandler[KeyEvent] {
  val left: String
  val right: String
  val up: String
  val down: String

  override def handle(event: KeyEvent): Unit = {
    val code = event.getCode
    val eventtype = event.getEventType.getName
    eventtype match {
      case "Pressed" => code.getName match {
        case this.left => person.whenLpressed()
        case this.right => person.whenRpressed()
        case this.up => person.whenUppressed()
        case this.down => person.whenDownpressed()
        case _ =>
      }
      case "Released" => code.getName match {
        case this.left => person.whenRreleased()
        case this.right => person.whenRreleased()
        case this.up => person.whenUpreleased()
        case this.down => person.whenDownreleased()
        case _ =>
      }
      case _ =>
    }
  }
}
class ArrowInputs(person: player) extends Keys(person) {
  override val left: String = "Left"
  override val right: String = "Right"
  override val up: String = "Up"
  override val down: String = "Down"
}