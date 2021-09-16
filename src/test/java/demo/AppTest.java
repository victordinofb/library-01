package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
  Saludo saludo = new Saludo();

  @Test
  public void shouldAnswerWithTrue() {
    assertEquals("Hola Dyn.", saludo.saludar("Dyn"));
  }
}
