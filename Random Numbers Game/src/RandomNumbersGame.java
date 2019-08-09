import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbersGame {

		
	static Scanner scanner = new Scanner(System.in);
		
	static SecureRandom randomNumbers = new SecureRandom();
		
		
	public static void main(String[] args) 
	{

		//Create an infinite loop, so that the game never ends. Thus, ONLY the user of the program can terminate this program manually by pressing the terminate button in the IDE.
		for(int counter = 1; counter != 0; counter++) {
			
		int spinCount = 1; //With every new game, each player starts with a spin count of 1
			 
		int total = 0; //This variable will be used to store the total of the user (per game play)

				
			//This iteration statement loops per twice per player
			while (spinCount != 2) 
			{
				//This is the first spin per player
				int numberReturnedFirst =spin();
					
				//calculate the total per game play
				total = numberReturnedFirst + total;
					
					
				//****
				//This selection statement is if the player hit 100 on the first spin
				if(numberReturnedFirst ==100){
						
					//If this is the circumstance than tell the user that he/she won
					System.out.printf("You win!%n");
				}
					
					
				//****
				//This is selection statement is if the players first spin was below 100. 
				if(numberReturnedFirst < 100)
				{
					//Tell the user to spin again if the total so far is less than 100
					//Thus this is the second spin of the user 
					System.out.printf("Spin again%n");
					int numberReturnedSecond= spin();
						
					//the second spin value will be added to the first spin value 
					total = numberReturnedSecond + total;
						
						
						
					if(total < 100){
						//If this is the circumstance then tell the user that he/she lost and must wait for the next player to play
						System.out.printf("Your total is %d. Wait for the next player.%n", total);
					}
						
					if(total == 100) {
						//If this is the circumstance, thus, the second spin hit the total 100 then tell the user that he/she won
						System.out.printf("You win!%n");
					}
						
					if(total > 100){
						//If this is the circumstance tell the user of the program that he/she lost 
						System.out.printf("Your total is %d. You lose!%n", total);
					}
				}
					
			    //Increment the spinCount
			    spinCount++;	
		      }
	
		}
			
		    
		}
		
		
		
	public static int spin() 
	{
		//Display this output to the user of the program
		System.out.print("Hit enter to spin");
			
		//Call the Scanner variable to accept the user input from him/her pressing "enter" key
		//Through the user pressing enter (hence the line of code in the bottom). He or she is acknowledging to spin to produce a random #
		scanner.nextLine();
			
		//Because the User pressed enter. This line of code will produce a random number from 5 - 100
		int number = 5 + 5 * randomNumbers.nextInt(20);
			
		//Tell the user of the program the random number that was produced
		System.out.printf("You get %d%n", number);
	
		//Return the number produced back to the calling code
		//Which will decide what to do with the value
		//use it or not (programmer's choice)
		return number;
	} 

} 