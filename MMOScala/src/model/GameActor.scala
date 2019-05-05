package model

import MMO.physics.PhysicsVector
import akka.actor.{Actor, ActorRef, PoisonPill, Props}
import model.Database._


class GameActor extends Actor {

  var players: Map[String, ActorRef] = Map()
  var towers: List[ActorRef] = List()

  val game: Game2 = new Game2()

  override def receive: Receive = {
    case message: AddPlayer =>{
      game.addPlayer(message.username)
      var player = game.players(message.username)
      player.user = message.username
      if (playerExists(message.username)){
        loadGame(message.username, player)
      }
      else{
        createPlayer(message.username, player.location.x, player.location.y)
      }
    }
    case message: RemovePlayer => game.removePlayer(message.username)
    case message: MovePlayer =>
      if (game.players(message.username).inGame == false)
        game.players(message.username).move(new PhysicsVector(message.x, message.y))
    case message: StopPlayer => game.players(message.username).stop()

    case UpdateGame => {
      game.update()
    }

    case SendGameState => sender() ! GameState(game.gameState())

    case levelMessage: LoadLevel =>
      game.loadLevel(new GameMap())
  }
}

