package MMO.Player

class Rectangle(left: Int, top: Int, width: Int, height: Int) {
  var right: Int = this.left + this.width
  var bottom: Int = this.top + this.top


  def within(r: Rectangle): Boolean ={
    r.left <= this.left &&
      r.right >= this.right &&
      r.top <= this.top &&
      r.bottom >= this.bottom
  }


  def overlaps(r: Rectangle): Boolean ={
    this.left < r.right &&
      r.left < this.right &&
      this.top < r.bottom &&
      r.top < this.bottom
  }
}
