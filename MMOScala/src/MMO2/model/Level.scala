package MMO2.model

object Level {

  def apply(number: Int): Level ={
    if(number == 0){
      new Level{

      }
    }else if(number == 1) {
      new Level {
        gridWidth = 10
        gridHeight = 20

        startingLocation = new GridLocation(1, 21)
        base = new GridLocation(6,7)

        maxBaseHealth = 25

        wallLocations = List(
          new GridLocation(0,14),
          new GridLocation(0,15),
          new GridLocation(1,14),
          new GridLocation(1,15),
          new GridLocation(2,14),
          new GridLocation(2,15),
          new GridLocation(3,14),
          new GridLocation(3,15),
          new GridLocation(4,14),
          new GridLocation(4,15),
          new GridLocation(5,14),
          new GridLocation(5,15),
          new GridLocation(6,14),
          new GridLocation(6,15),



          new GridLocation(4, 3),
          new GridLocation(4, 4),
          new GridLocation(4, 5),
          new GridLocation(4, 6),
          new GridLocation(4, 7),
          new GridLocation(4, 8),
          new GridLocation(4, 9),


          new GridLocation(9, 3),
          new GridLocation(9, 4),
          new GridLocation(9, 5),
          new GridLocation(9, 6),
          new GridLocation(9, 7),
          new GridLocation(9, 8),
          new GridLocation(9, 9),


          new GridLocation(5, 9),
          new GridLocation(6, 9),
          new GridLocation(7, 9),
          new GridLocation(8, 9)
        )
      }
    }else if(number == 2){
      new Level{
        gridWidth = 19
        gridHeight = 19

        startingLocation = new GridLocation(0, 18)
        base = new GridLocation(18, 0)

        maxBaseHealth = 30

        wallLocations = List(
          new GridLocation(2,5),
          new GridLocation(2,6),
          new GridLocation(2,7),
          new GridLocation(2,8),
          new GridLocation(2,9),
          new GridLocation(2,10),
          //          new GridLocation(2,11),
          new GridLocation(2,12),
          new GridLocation(2,13),

          new GridLocation(5,2),
          new GridLocation(6,2),
          new GridLocation(7,2),
          new GridLocation(8,2),
          new GridLocation(9,2),
          new GridLocation(10,2),
          new GridLocation(11,2),
          new GridLocation(12,2),
          new GridLocation(13,2),
          new GridLocation(16,2),

          new GridLocation(5,16),
          new GridLocation(6,16),
          //          new GridLocation(7,16),
          new GridLocation(8,16),
          new GridLocation(9,16),
          new GridLocation(10,16),
          new GridLocation(11,16),
          new GridLocation(12,16),
          new GridLocation(13,16),


          new GridLocation(16,5),
          new GridLocation(16,6),
          new GridLocation(16,7),
          new GridLocation(16,8),
          new GridLocation(16,9),
          new GridLocation(16,10),
          new GridLocation(16,11),
          new GridLocation(16,12),
          new GridLocation(16,13),


          new GridLocation(3,5),
          new GridLocation(3,13),

          new GridLocation(4,6),
          new GridLocation(4,12),

          new GridLocation(5,3),
          new GridLocation(5,7),
          new GridLocation(5,11),
          new GridLocation(5,15),

          new GridLocation(6,4),
          new GridLocation(6,8),
          new GridLocation(6,14),

          new GridLocation(7,5),
          new GridLocation(7,9),
          new GridLocation(7,13),

          new GridLocation(8,6),

          new GridLocation(9,7),
          new GridLocation(9,11),

          new GridLocation(10,6),
          new GridLocation(10,12),

          new GridLocation(11,9),
          new GridLocation(11,13),

          new GridLocation(12,4),
          new GridLocation(12,8),
          new GridLocation(12,10),
          new GridLocation(12,14),

          new GridLocation(13,3),
          new GridLocation(13,11),
          new GridLocation(13,15),

          new GridLocation(14,6),
          new GridLocation(14,12),

          new GridLocation(15,5),
          new GridLocation(15,13)
        )
      }
    }else{
      new Level
    }
  }

}

class Level {

  var towerLocations:List[GridLocation] = List()
  var wallLocations:List[GridLocation] = List()

  var gridWidth: Int = 45
  var gridHeight: Int = 18

  var startingLocation = new GridLocation(0, 19)
  var base = new GridLocation(45, 0)

  var maxBaseHealth = 2

}