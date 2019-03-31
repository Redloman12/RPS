package MMO

import MMO.Player.player

object game {
  var FPS: Int = 30
  var INTERVAL: Int = 1000/FPS
  var STEP = INTERVAL/1000

  def findRandom(min: Int, max: Int): Long = {
    var random: Double = Math.random() * (+max - +min) + +min
    Math.round(random)
  }

  var player: player = new player(findRandom(), 0)
  var room: Map = new Map(5000, 3000)
  room.generate()

}
