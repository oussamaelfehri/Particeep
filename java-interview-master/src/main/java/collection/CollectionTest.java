package collection;

import java.util.List;
import java.util.stream.Collectors;

class CollectionTest {

  public static List<Double> compute1(List<Integer> input) {
    return input.stream()
        .map(x -> Math.pow((x * 2) + 3, 5))
        .collect(Collectors.toList());
  }

  public static List<String> compute2(List<String> input) {
    return input.stream()
        .map(s -> {
          if (s.isEmpty()) return s;
          String capitalized = Character.toUpperCase(s.charAt(0)) + s.substring(1);
          return capitalized + capitalized;
        })
        .collect(Collectors.toList());
  }

}
