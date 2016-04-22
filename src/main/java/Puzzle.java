


public class Puzzle {

  public String replaceVowels(String userString) {
    userString = userString.replace('a', '-');
    userString = userString.replace('e', '-');
    userString = userString.replace('i', '-');
    userString = userString.replace('o', '-');
    userString = userString.replace('u', '-');
    userString = userString.replace('A', '-');
    userString = userString.replace('E', '-');
    userString = userString.replace('I', '-');
    userString = userString.replace('O', '-');
    userString = userString.replace('U', '-');

    return userString;
  }
}
