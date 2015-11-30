package folder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.integration.PrimeNumberHelper;

public class TestJunit {

  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {

    assertEquals(true, PrimeNumberHelper.isPositive(12));
  }

} 

