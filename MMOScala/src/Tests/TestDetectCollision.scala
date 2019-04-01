package Tests

import MMO.physics._
import org.scalatest.FunSuite

class TestDetectCollision extends FunSuite {
  test("see if they intersect") {
    var phys1: PhysicsVector = new PhysicsVector(4, 5, 0)
    var phys2: PhysicsVector = new PhysicsVector(-4, 7, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(0.0, 0.0, 0.0)
    var oof2: PhysicsVector = new PhysicsVector(10, 10, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(0.0, 0.0, 0.0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
  test("see if they intersect num2") {
    var phys1: PhysicsVector = new PhysicsVector(0, 0, 0)
    var phys2: PhysicsVector = new PhysicsVector(5, 6, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(10, 10, 0)
    var oof2: PhysicsVector = new PhysicsVector(11, 12, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(0.0, 0.0, 0.0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (false), "fail")
  }
  test("see if they intersect num3") {
    var phys1: PhysicsVector = new PhysicsVector(-1, -5, 0)
    var phys2: PhysicsVector = new PhysicsVector(-4, -7, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(-10, -10, 0)
    var oof2: PhysicsVector = new PhysicsVector(10, 10, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(-8, -8, 0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
  test("see if they intersect num4") {
    var phys1: PhysicsVector = new PhysicsVector(4, 5, 0)
    var phys2: PhysicsVector = new PhysicsVector(-4, 7, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(6, 4, 0)
    var oof2: PhysicsVector = new PhysicsVector(-20, -10, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(0.0, 0.0, 0.0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
  test("see they intersect") {
    var phys1: PhysicsVector = new PhysicsVector(4, 5, 0)
    var phys2: PhysicsVector = new PhysicsVector(-4, 7, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(0.0, 0.0, 0.0)
    var oof2: PhysicsVector = new PhysicsVector(10, 10, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(0.0, 0.0, 0.0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
  test("they intersect") {
    var phys1: PhysicsVector = new PhysicsVector(-10, -10, 0)
    var phys2: PhysicsVector = new PhysicsVector(-9, -9, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(-10, -10, 0)
    var oof2: PhysicsVector = new PhysicsVector(-9, -9, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(-9, -9, 0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
  test("intersect") {
    var phys1: PhysicsVector = new PhysicsVector(-20, -20, 0)
    var phys2: PhysicsVector = new PhysicsVector(-9, -9, 0)
    var physe: PhysicalObject = new PhysicalObject(phys1, phys2)
    var oof: PhysicsVector = new PhysicsVector(-20, -20, 0)
    var oof2: PhysicsVector = new PhysicsVector(-9, -9, 0)
    var boundary: Boundary = new Boundary(oof, oof2)
    var Vector = new PhysicsVector(-9, -9, 0)
    assert(Physics.detectCollision(physe, Vector, boundary) == (true), "fail")
  }
}
