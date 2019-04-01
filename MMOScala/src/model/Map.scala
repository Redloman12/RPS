package model

import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle

import scala.collection.mutable.ListBuffer

class Map(var width: Int, var height: Int) {
  def generate(): List[Rectangle] = {
    var rectangles: ListBuffer[Rectangle] = ListBuffer()
    var rows = (this.width/44) + 1
    var columns = (this.height/44) + 1

    var i = 0
    var x: Double = 0
    while (i < rows) {
      var y: Double = 0
      var j = 0
      while (j < columns) {
        rectangles += new Rectangle{
          width = 40
          height = 40
          translateX = x.toDouble
          translateY = y.toDouble
          fill = Color.LightGray
        }
        y += 44
        j += 1
      }
      x += 44
      i += 1
    }
    rectangles.toList
  }
  def draw(){}
}
