package MMO.Player

object game {
  var FPS: Int = 30
  var INTERVAL: Int = 1000/FPS
  var STEP = INTERVAL/1000

  def findRandom(min: Int, max: Int): Long = {
    var random: Double = Math.random() * (+max - +min) + +min
    Math.round(random)
  }

  var player: player = new player(findRandom(1000, 4000), findRandom(500, 2500))
  var room: Map = new Map(5000, 3000)
  room.generate()

  var camera: Camera = new Camera(0, 0, 0, 0, room.width, room.height)
  camera.follow(player, 0, 0)

  def update(): Unit = {
    player.update()
    camera.update()
  }
}
