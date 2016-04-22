


public class Puzzle {

  public String replaceVowels(String userString) {
    char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    for (char vowels : vowelArray) {
      userString = userString.replace(vowels, '-');
    }
    return userString;
  }

  public String reveal_E(String userString) {
    char[] vowelArray = {'a', 'i', 'o', 'u', 'A', 'I', 'O', 'U'};

    for (char vowels : vowelArray) {
      userString = userString.replace(vowels, '-');
    }
    return userString;
  }
}
