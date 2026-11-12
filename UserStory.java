public class UserStory {

  private String[] breeds;
  private int[] age;
  private Cat[] cats;

  /*
   * No-argument constructor
   * Uses the original data files
   */
  public UserStory() {
    this("breeds.txt", "age.txt");
  }

  /*
   * Reads the breed and age files
   * Precondition: Both files have matching data
   */
  public UserStory(String breedsFile, String ageFile) {
    this.breeds = FileReader.toStringArray(breedsFile);
    this.age = FileReader.toIntArray(ageFile);

    // Creates an array of cats
    cats = new Cat[breeds.length];

    for (int i = 0; i < breeds.length; i++) {
      cats[i] = new Cat(breeds[i], age[i]);
    }
  }

  /*
   * Counts cats with a specific breed
   * Returns the number of matching cats
   */
  public int countBreed(String targetBreed) {
    int count = 0;

    // Checks each cat's breed
    for (int i = 0; i < cats.length; i++) {
      if (cats[i].getBreed().equals(targetBreed)) {
        count++;
      }
    }

    return count;
  }

  /*
   * Finds breeds of cats with a certain age
   * Returns a new array of matching breeds
   */
  public String[] findBreedsByAge(int targetAge) {
    int count = 0;

    // Counts cats with the matching age
    for (int i = 0; i < cats.length; i++) {
      if (cats[i].getAge() == targetAge) {
        count++;
      }
    }

    // Creates a new array
    String[] matchingBreeds = new String[count];
    int index = 0;

    // Adds matching breeds to the array
    for (int i = 0; i < cats.length; i++) {
      if (cats[i].getAge() == targetAge) {
        matchingBreeds[index] = cats[i].getBreed();
        index++;
      }
    }

    return matchingBreeds;
  }

  /*
   * Returns the breed and age of every cat
   * Postcondition: Returns a String with cat data
   */
  public String toString() {
    String result = "Example Cat:\n";

    for (int i = 0; i < breeds.length; i++) {
      result += "Breed: " + breeds[i] + " - Age: " + age[i];
      result += "\n"; // new line
    }

    return result;
  }
}
