import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    UserStory us = new UserStory("breeds.txt", "age.txt");

    // Use toString() method to print out all cats
    System.out.println(us);

  }
}
