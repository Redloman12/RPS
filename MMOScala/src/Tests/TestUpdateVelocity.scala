package Tests

import MMO.physics.{PhysicalObject, Physics, PhysicsVector, World}
import org.scalatest.FunSuite

class TestUpdateVelocity extends FunSuite {

  test("see if it computes object location") {
    val earth: World = new World(0)
    var phys1: PhysicsVector = new PhysicsVector(10, 3, 0)
    var phys2: PhysicsVector = new PhysicsVector(-6, -8, 0)
    var ball: PhysicalObject = new PhysicalObject(phys1, phys2)
    Physics.updateVelocity(ball, earth, 3)
    assert(ball.velocity.z == (0), "fail")
  }
  test(" computes object location") {
    val venus: World = new World(0)
    var phys3: PhysicsVector = new PhysicsVector(0, 0, 0)
    var phys4: PhysicsVector = new PhysicsVector(3, 3, 0)
    var obj: PhysicalObject = new PhysicalObject(phys3, phys4)
    Physics.updateVelocity(obj, venus, 4)
    assert(obj.velocity.z == (0), "fail1")
  }
  test("object location") {
    val mars: World = new World(0)
    var phys: PhysicsVector = new PhysicsVector(1, -8, 0)
    var phys5: PhysicsVector = new PhysicsVector(-6, 7, 0)
    var no: PhysicalObject = new PhysicalObject(phys, phys5)
    Physics.updateVelocity(no, mars, 5)
    assert(no.velocity.z == (0), "fail2")
  }
  test("object is location") {
    val mars: World = new World(0)
    var phys: PhysicsVector = new PhysicsVector(1, -8, 0)
    var phys5: PhysicsVector = new PhysicsVector(-6, 7, 0)
    var no: PhysicalObject = new PhysicalObject(phys, phys5)
    Physics.updateVelocity(no, mars, 5)
    assert(no.velocity.z == (0), "fail3")
  }
  test("object if location") {
    val mars: World = new World(0)
    var phys: PhysicsVector = new PhysicsVector(4, 5, 0)
    var phys5: PhysicsVector = new PhysicsVector(-4, 10, 0)
    var no: PhysicalObject = new PhysicalObject(phys, phys5)
    Physics.updateVelocity(no, mars, 3)
    assert(no.velocity.z == (0), "fail4")
  }

}
