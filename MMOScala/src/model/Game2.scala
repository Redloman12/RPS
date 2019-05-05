package model

import play.api.libs.json.{JsValue, Json}
import MMO.physics._
import Database._

class Game2 {
  val world: World = new World(0)

  var level: GameMap = new GameMap()

  var players: Map[String, Player2] = Map()
  val playerSize: Double = 0.3

  var lastUpdateTime: Long = System.nanoTime()


  def loadLevel(newLevel: GameMap): Unit = {
    world.boundaries = List()
    level = newLevel


    blockTile(0, 0, level.gridWidth, level.gridHeight)

    players.values.foreach(player => player.location = startingVector())

  }


  def addPlayer(id: String): Unit = {
    val player = new Player2(startingVector(), new PhysicsVector(0, 0))
    players += (id -> player)
    world.objects = player :: world.objects
  }


  def removePlayer(id: String): Unit = {
    players(id).destroy()
    players -= id
  }

  def blockTile(x: Int, y: Int, width: Int = 1, height: Int = 1): Unit = {
    val ul = new PhysicsVector(x, y)
    val ur = new PhysicsVector(x + width, y)
    val lr = new PhysicsVector(x + width, y + height)
    val ll = new PhysicsVector(x, y + height)

    world.boundaries ::= new Boundary(ul, ur)
    world.boundaries ::= new Boundary(ur, lr)
    world.boundaries ::= new Boundary(lr, ll)
    world.boundaries ::= new Boundary(ll, ul)
  }

  def startingVector(): PhysicsVector = {
    new PhysicsVector(math.random() * level.gridWidth, math.random() * level.gridHeight)
  }



  def update(): Unit = {
    val time: Long = System.nanoTime()
    val dt = (time - this.lastUpdateTime) / 1000000000.0
    Physics.updateWorld(this.world, dt)
    this.lastUpdateTime = time
    for (p <- players.keys){
      val player = players(p)
      saveGame(p, player.score, player.location.x, player.location.y, player.velocity.x, player.velocity.y, player.inGame)
    }
  }


  def gameState(): String = {
    val gameState: Map[String, JsValue] = Map(
      "gridSize" -> Json.toJson(Map("x" -> level.gridWidth, "y" -> level.gridHeight)),
      "players" -> Json.toJson(this.players.map({ case (k, v) => Json.toJson(Map(
        "x" -> Json.toJson(v.location.x),
        "y" -> Json.toJson(v.location.y),
        "v_x" -> Json.toJson(v.velocity.x),
        "v_y" -> Json.toJson(v.velocity.y),
        "points" -> Json.toJson(v.score),
        "speed" -> Json.toJson(v.speed),
        "in_game" -> Json.toJson(v.inGame),
        "id" -> Json.toJson(k))) }))
      )

    Json.stringify(Json.toJson(gameState))
  }
}
