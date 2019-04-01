package view

class Camera(var xView: Int, var yView: Int, var canvasWidth: Int, var canvasHeight: Int, var worldWidth: Int, var worldHeight: Int) {
  var xDeadZone: Int = 0
  var yDeadZone: Int = 0

  var hview: Int = canvasHeight
  var wview: Int = canvasWidth

  var viewpointRect: Rectangle = new Rectangle(this.xView, this.yView, this.wview, this.hview)
  var worldRect: Rectangle = new Rectangle(0, 0, worldWidth, worldHeight)

  var followed: player = null

  def follow(gameObject: player, xDeadZone: Int, yDeadZone: Int): Unit ={
    this.followed = gameObject
    this.xDeadZone = xDeadZone
    this.yDeadZone = yDeadZone
  }

//  def update(): Unit ={
//    if ()
//  }
}
