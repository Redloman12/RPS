package model

import MMO.physics.World
import model.player

class Game {
  val world = new World(0)

  def player_choice(player1_choice: Int) {
    //Register and shows the players choice//
    if (player1_choice == 1) {
      print("The player1 chose rock")
    }
    else if (player1_choice == 2){
      print("The player1 chose paper")
    }
    else {
      print("The player1 chose scissors")
    }
  }

  def isWinner(player: player): Boolean ={
    if (player[5] == 50){
      true
    }
    else{
      false
    }
  }



  def number(Player: player) {
    return Player[0]
  }


  def ranking(Playerlist: List[player]) {
    Playerlist.sort(key = number)
    return Playerlist
  }


  x = detectcollisions(player1.x, player1.y, player1.width, player1.height, player1.x, player1.y, player1.width, player1.height)
  print(x)


  def player_choice(player1: player)= {
    if (player1.Choice == 1)
      println("The player1 chose rock")
    else if (player1.Choice == 2)
      println("The player1 chose paper")
    else if (player1.Choice == 3)
      println("The player1 chose scissors")
  } //Register and shows the players choice


  def player2_choice(player2: player): Unit ={
    if (player2.Choice == 1)
      println("The player1 chose rock")
    else if (player2.Choice == 2)
      println("The player1 chose paper")
    else if (player2.Choice == 3)
      println("The player1 chose scissors")
  }  //Register and shows the cpus choice


  def result(player1: player, player2: player): Unit ={
    if (player1.Choice == player2.Choice) {
      player1.points += 0.5
      player2.points += 0.5
    }
    else if (player1.Choice == 3 && player2.Choice == 1) {
      player2.points += 1
    }
    else if (player1.Choice == 1 && player2.Choice == 3) {
      player1.points += 1
    }
    else if (player1.Choice > player2.Choice) {
      player1.points +=1
    }
    else if (player1.Choice < player2.Choice) {
      player2.points += 1
    }
  }  //Define the game result


  def print_score(p1_score: Double, p2_score: Double){  //Identifies the result and print the total score
    print("Score:""\nPlayer1:" + p1_score.toString + "\nPlayer2:" + p2_score.toString)
    }


  def validation_input():  //Validates the input
  while True{
    try {
      user_input = int(input("Put your choice:"))
      if user_input not in range(1, 4):
        print
      ("We only accept commands between 1 and 3, according to the table, type again")
      continue
      if
      type (user_input) == int:
        break
      except ValueError:
        print
      ("We only accept exact numbers")
      continue
      return user_input
    }
  }



  print('''1 - Rock
  2 - Paper
  3 - Scissors''')   //Printing the instructions
  human1_score = 0
  human2_score = 0
  while True:  //The condition is not important since the loop will stop on line 68 if the user wishes so
    player1 = validation_input()
  player_choice(player1)
  ai = random.randint(1, 3)
  player2_choice(ai)
  human1_score, computer_score = result(player1, ai, human1_score, human2_score)  # Accumulate the score
  print_score(human1_score, human2_score)
  command = int(input("Type 0 to stop the program, type any another number to keep playing"))
  if command == 0:
    break

}
