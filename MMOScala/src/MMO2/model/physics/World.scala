package MMO2.model.physics

import MMO2.model.game_objects.{Boundary, PhysicalObject}

class World(var gravity: Double) {

  var objects: List[PhysicalObject] = List()
  var boundaries: List[Boundary] = List()

}
