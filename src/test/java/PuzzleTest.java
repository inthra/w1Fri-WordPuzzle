import org.junit.*;
import static org.junit.Assert.*;

public class PuzzleTest {

  @Test
  public void runReplaceVowels_replace_e_WithDash_returnWordPuzzle() {
    Puzzle testPuzzle = new Puzzle();
    assertEquals("L--k", testPuzzle.replaceVowels("Leek"));
  }
  @Test
  public void runReplaceVowels_replaceVowelsWithDash_returnWordPuzzle() {
    Puzzle testPuzzle = new Puzzle();
    assertEquals("C--l-fl-w-r", testPuzzle.replaceVowels("Cauliflower"));
  }
  @Test
  public void runReplaceVowels_replaceUpperCaseVowelsWithDash_returnWordPuzzle() {
    Puzzle testPuzzle = new Puzzle();
    assertEquals("-M-R-LD", testPuzzle.replaceVowels("EMERALD"));
  }
  
}
