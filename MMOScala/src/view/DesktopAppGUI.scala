package Desktop.view

import javafx.event.ActionEvent
import javafx.scene.input.{KeyCode, KeyEvent}
import model.{Game, Map}
import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.TextAlignment._
import scalafx.scene.text.{Font, Text}

object DesktopAppGUI extends JFXApp {
  val game = new Game()
  stage = new application.JFXApp.PrimaryStage {
    title.value = "Test"
    scene = new Scene(1280, 720) {


      fill = White

      var map: Map = new Map(5000, 3000)

      val gridTexture: List[Rectangle] = map.generate()

      val title = new Text(420, 200, "Welcome to RPS Battle Royale!") {
        textAlignment = Center
        font = new Font(32)
      }


      val hint = new Text(615, 270, "Login") {
        textAlignment = Center
        font = new Font(20)
      }


      val usernametext = new Text("Username") {
        font = new Font(16)
        layoutX = 570
        layoutY = 330
      }
      val username = new TextField {
        layoutX = 570
        layoutY = 340
      }


      val passwordtext = new Text("Password") {
        font = new Font(16)
        layoutX = 570
        layoutY = 390
      }
      val password = new PasswordField {
        layoutX = 570
        layoutY = 400
      }


      val player = new Rectangle {
        width = 50
        height = 50
        x = (1280 / 2) - 25
        y = (720 / 2) - 25
        fill = White
      }


      val buttonR = new Button("Rock") {
        layoutX = 380
        layoutY = 500
        minWidth = 120
        minHeight = 40
      }
      val buttonP = new Button("Paper") {
        layoutX = 580
        layoutY = 500
        minWidth = 120
        minHeight = 40
      }
      val buttonS = new Button("Scissors") {
        layoutX = 780
        layoutY = 500
        minWidth = 120
        minHeight = 40
      }



      val score = new Text("Score: 0") {
        layoutX = 600
        layoutY = 640
        font = new Font(20)
      }


      val position = new Text("X: 0, Y: 0") {
        layoutX = 1130
        layoutY = 40
        font = new Font(24)
      }


      def enterGame(): Unit = {
        content = List(player, buttonR, buttonP, buttonS, position, score)
        fill = DarkGray
      }


      val enter = new Button("Let's Go!") {
        layoutX = 510
        layoutY = 500
        minWidth = 250
        minHeight = 40
        onAction = (event: ActionEvent) => enterGame()
      }
      def keyPressed(keyCode: KeyCode): Unit = {
        keyCode.getName match {
          case "W" => game.player1.location.y += 1 // INPUT SHIT GOES HERE RYAN
          case "A" => game.player1.location.x -= 1 // INPUT SHIT GOES HERE RYAN
          case "S" => game.player1.location.y -= 1 // INPUT SHIT GOES HERE RYAN
          case "D" => game.player1.location.x += 1 // INPUT SHIT GOES HERE RYAN
          case _ => println(keyCode.getName + " pressed with no action")
        }
        position.text = "X: " + game.player1.location.x.toString() + " Y: "+ game.player1.location.y.toString()
      }

      content = List(title, hint, usernametext, username, passwordtext, password, enter)

      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))
    }
  }
}
