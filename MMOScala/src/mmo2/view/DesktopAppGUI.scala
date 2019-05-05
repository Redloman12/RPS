package mmo2.view

import io.socket.client.IO
import io.socket.emitter.Emitter
import javafx.event.ActionEvent
import javafx.scene.input.{KeyCode, KeyEvent}
import model.{Game2, GameMap}
import play.api.libs.json.{JsValue, Json}
import scalafx.application
import scalafx.application.{JFXApp, Platform}
import scalafx.scene.Scene
import scalafx.scene.control.{Button, PasswordField, TextField}
import scalafx.scene.paint.Color.{DarkGray, White}
import scalafx.scene.shape.Rectangle
import scalafx.scene.text.TextAlignment.Center
import scalafx.scene.text.{Font, Text}

object DesktopAppGUI extends JFXApp {
  var socket = IO.socket("http://localhost:8080/")
  socket.connect()


  val game=new Game2()
  this.stage = new application.JFXApp.PrimaryStage {
    title.value = "Test"
    scene = new Scene(1280, 720) {


      fill = White

      var map: GameMap = new GameMap(5000, 3000)

//      val gridTexture: List[Rectangle] = map.generate()

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
//          case "W" => game.players.values.// INPUT SHIT GOES HERE RYAN
//          case "A" => game.player1.state.whenLpressed() // INPUT SHIT GOES HERE RYAN
//          case "S" => game.player1.state.whenDownpressed() // INPUT SHIT GOES HERE RYAN
//          case "D" => game.player1.state.whenRpressed() // INPUT SHIT GOES HERE RYAN
          case _ => println(keyCode.getName + " pressed with no action")
        }
        position.text = "X: " + game.players.values.foreach(player =>player.location.x.toString()) + " Y: "+ game.players.values.foreach(player =>player.location.y.toString()
        }

      content = List(title, hint, usernametext, username, passwordtext, password, enter)

      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))(event: KeyEvent) => {

        socket.emit("gameState", game.getClass)
      })
    }
  }
  class HandleMessagesFromPython() extends Emitter.Listener {
    override def call(objects: Object*): Unit = {
      val message = objects.apply(0).toString
      // do something with message
      Platform.runLater(() => {
        val jsonGameState = objects.apply(0).toString
        println(jsonGameState)
        val gameState: JsValue = Json.parse(jsonGameState)
        val player = (gameState \ "players").as[Map[String, JsValue]]

        for ((k, v) <- player) {
          DesktopAppGUI.equipmentButtons(k).text

          game.players.values.foreach(player => player.location = player.location
        }
      }
  socket.on("gameState", new HandleMessagesFromPython)
}
}
}
}
