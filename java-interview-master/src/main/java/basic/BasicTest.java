package basic;

import io.vavr.control.Option;

public class BasicTest {

  public static Option<Integer> power(Integer i, Integer n) {
    try {
      if (i < 0 || n < 0) return Option.none();  
      int result = 1;
      for (int j = 0; j < n; j++) {
        result *= i;
      }
      return Option.of(result);
    } catch (Exception e) {
      return Option.none();  
    }
  }
}