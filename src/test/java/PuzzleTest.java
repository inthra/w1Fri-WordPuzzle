import org.junit.*;
import static org.junit.Assert.*;

public class PuzzleTest {

  @Test
  public void runReplaceVowels_replaceVowelsWithDash_WordPuzzle() {
    Puzzle testPuzzle = new Puzzle();
    assertEquals("B-li-v-", testPuzzle.replaceVowels("Believe"));
  }
}
