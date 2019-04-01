package MMO.Control

import model.Game
import scalafx.scene.control.Button

class RPS(game: Game, xaxis: Double, yaxis: Double) extends Button{
  minWidth = 100 * xaxis
  minHeight = 100 * yaxis
  style = "-fx-font: 12 comic-sans;"
}
//class Rock(game:Game, xaxis: Double, yaxis: Double) extends RPS(game,xaxis,yaxis){
//  text = "Rock"
//  style = "-fx-font: 28 comic-sans"
//  onAction = (event: ActionEvent) =>
//}
