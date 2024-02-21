/*
 * Class: CMSC203 CRN 30340
 * Program: Lab 1
 * Instructor: Professor Khandan Monshi
 * Summary of Description: Tests students on how to run a driver class 
 * Due Date: 02/20/2024
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //creates Scanner to allow input from user
		String answer = "";
		
		do{
			Movie film = new Movie(); //creates movie object
			
			System.out.println("Enter the title of the movie: "); //prompt user to enter the title of a movie 
			String title = keyboard.nextLine(); //reads in line that the user types
			film.setTitle(title); //set the title in the movie object
			
			System.out.println("Enter the movie's rating: "); //prompt user to enter the movie’s rating
			String rating = keyboard.nextLine(); //read in the line that the user types
			film.setRating(rating); //set the rating in the movie object
			
			System.out.println("Enter the number of tickets sold at Regal theather"); //prompt user to enter the number of tickets sold at a theater
			int ticket = keyboard.nextInt(); //read in integer that the user types
			film.setSoldTickets(ticket); //Set the number of tickets sold in the movie object
			
			System.out.println(film.toString()); //display information using the movie’s toString method
			
			System.out.println("Do you want to enter another? (y or n)"); //ask user if want to enter another movie
			String eatInput = keyboard.nextLine(); //eats input
			answer = keyboard.nextLine(); // reads yes or no input from user 
			
		}while(answer.equalsIgnoreCase("y")); //test if user wants to repeat program
		
		System.out.println("Goodbye"); //displays goodbye message
		
		
		
	}

}
