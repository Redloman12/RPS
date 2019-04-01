package MMO.physics

import java.awt.geom.Line2D

object Physics {
  def updateWorld(world: World, deltaTime: Double): Unit ={
    var r: Int = 0
    for (i <-world.objects){
      r = 0
      if (r == 0){
        i.location = computePotentialLocation(i, deltaTime)
      }
    }
  }

  def computePotentialLocation(Object: PhysicalObject, deltaTime: Double): PhysicsVector = {
    var Vector = new PhysicsVector(0.0, 0.0)
    Vector.x=Object.location.x+Object.velocity.x*deltaTime
    Vector.y=Object.location.y+Object.velocity.y*deltaTime
    Vector
  }

  def detectCollision(Object: PhysicalObject, Vector: PhysicsVector, wall: Boundary ): Boolean ={
    var x1 = Object.location.x
    var y1 = Object.location.y
    var x2 = Vector.x
    var y2 = Vector.y
    var x3 = wall.start.x
    var y3 = wall.start.y
    var x4 = wall.end.x
    var y4 = wall.end.y
    Line2D.linesIntersect(x1,y1,x2,y2,x3,y3,x4,y4)
  }
}
