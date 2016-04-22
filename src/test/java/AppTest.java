import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Initiate Word Puzzle");
  }

  @Test
  public void Puzzle() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("Believe you can and you're halfway there.");
    submit(".btn");
    assertThat(pageSource()).contains("B-l--v- y-- c-n -nd y--'r- h-lfw-y th-r-.");
  }
}
