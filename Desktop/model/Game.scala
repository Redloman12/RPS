package model

import MMO.physics.World

class Game {
  val world = new World(0)


//  def player_choice(player1_choice: Int) {
//    //Register and shows the players choice//
//    if (player1_choice == 1) {
//      print("The player1 chose rock")
//    }
//    else if (player1_choice == 2){
//      print("The player1 chose paper")
//    }
//    else {
//      print("The player1 chose scissors")
//    }
//  }
//
//  def player_choice(player1_choice): Unit ={
//    if (player1_choice == 1){
//      println("The player1 chose rock")
//    }
//    else if (player1_choice == 2){
//      println("The player1 chose paper")
//    }
//    else{
//      print("The player1 chose scissors")
//    }
//  }  //Register and shows the players choice
//
//
//
//  def player2_choice(player2_choice): Unit ={
//    if (player2_choice == 1){
//      print("The player2 chose rock")
//    }
//    else if (player2_choice == 2) {
//      print("The player2 chose paper")
//    }
//    else{
//      print("The player2 chose scissors")
//    }
//
//  }  //Register and shows the cpus choice
//
//  def print_score(p1_score, p2_score):  //Identifies the result and print the total score
//    print("Score:""\nPlayer1:", p1_score, "\nPlayer2:", p2_score)
//
//
//  def validation_input():  //Validates the input
//  while True:
//  try:
//  user_input = int(input("Put your choice:"))
//  if user_input not in range(1, 4):
//    print("We only accept commands between 1 and 3, according to the table, type again")
//  continue
//  if type(user_input) == int:
//    break
//  except ValueError:
//    print("We only accept exact numbers")
//  continue
//  return user_input
//
//
//  print('''1 - Rock
//  2 - Paper
//  3 - Scissors''')   //Printing the instructions
//  human1_score = 0
//  human2_score = 0
//  while True:  //The condition is not important since the loop will stop on line 68 if the user wishes so
//    player1 = validation_input()
//  player_choice(player1)
//  ai = random.randint(1, 3)
//  player2_choice(ai)
//  human1_score, computer_score = result(player1, ai, human1_score, human2_score)  # Accumulate the score
//  print_score(human1_score, human2_score)
//  command = int(input("Type 0 to stop the program, type any another number to keep playing"))
//  if command == 0:
//    break

}
