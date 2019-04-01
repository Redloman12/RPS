package MMO.Control

import java.awt.event.ActionEvent

import model.Game
import scalafx.scene.control.Button

class RPS(game: Game, xaxis: Double, yaxis: Double) extends Button{
  minWidth = 100 * xaxis
  minHeight = 100 * yaxis
  style = "-fx-font: 12 ariel;"
}
class Rock(game:Game, xaxis: Double, yaxis: Double) extends RPS(game,xaxis,yaxis){
  text = "Rock"
  style = "-fx-font-size: 48pt"
  onAction = (event: ActionEvent) =>
}
