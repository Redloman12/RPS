package Tests

import MMO.gameObjects.player
import MMO.physics.PhysicsVector
import model.Game
import org.scalatest.FunSuite

class RockPaperScizzors extends FunSuite {
  test("see2312") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 1
    player2.Choice = 3
    assert(game.RPS(player1,player2) == ("player 1"), "yes1")
  }
  test("see1") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 2
    player2.Choice = 1
    assert(game.RPS(player1,player2) == ("player 1"), "yes2")
  }
  test("see") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 3
    player2.Choice = 2
    assert(game.RPS(player1,player2) == ("player 1"), "yes3")
  }
  test("see42") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 3
    player2.Choice = 1
    assert(game.RPS(player1,player2) == ("player 2"), "yes4")
  }
  test("see32") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 1
    player2.Choice = 2
    assert(game.RPS(player1,player2) == ("Player 2"), "yes5")
  }
  test("see2") {
    var game: Game = new Game
    var player1: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    var player2: player = new player(new PhysicsVector(0, 0), new PhysicsVector(0, 0))
    player1.Choice = 2
    player2.Choice = 3
    assert(game.RPS(player1,player2) == ("player 2"), "yes6")
  }
}
