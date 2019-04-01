package Tests

import MMO.physics._
import org.scalatest.FunSuite

class TestComputeLocation extends FunSuite {
  test("see if it computes object location") {
    var phys1: PhysicsVector = new PhysicsVector(4, 5, 6)
    var phys2: PhysicsVector = new PhysicsVector(-4, 7, 10)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    assert(Physics.computePotentialLocation(physe, 3).x == (-8.0), "fail1")
    assert(Physics.computePotentialLocation(physe, 3).y == (26.0), "fail")
    assert(Physics.computePotentialLocation(physe, 3).z == (36.0), "fail")
  }
  test("object location") {
    var phys3: PhysicsVector = new PhysicsVector(4, 5, 0)
    var phys4: PhysicsVector = new PhysicsVector(6, -7, 0)
    var physes: PhysicalObject = new PhysicalObject(phys3, phys4)
    assert(Physics.computePotentialLocation(physes, 2).x == (16.0), "fail")
    assert(Physics.computePotentialLocation(physes, 2).y == (-9.0), "fail")
    assert(Physics.computePotentialLocation(physes, 2).z == (0.0), "fail")
  }

}
