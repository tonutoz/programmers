package coding.test.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class CodingTest {

  // 대소문자 바꿔서 출력하기
  @Test
  void chaingeUpperAndLower() {
    String input = "aBcDeFg";
    StringBuffer sb = new StringBuffer();
    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)) {
        sb.append(Character.toLowerCase(c));
      } else {
        sb.append(Character.toUpperCase(c));
      }
    }
    System.out.println(sb.toString());

  }

  // 문자열 겹쳐 쓰기
  @Test
  void combineString() {
    String myString = "He11oWor1d";
    String overwriteString = "lloWorl";
    int s = 2;
    String answer = "";
    String subString = myString.substring(s, overwriteString.length() + s);
    answer = myString.replace(subString, overwriteString);

    System.out.println(answer);

  }

  // 원소들의 곱과 합
  @Test
  void solution() {
    int[] input = {3, 4, 5, 2, 1};
    int sum = Arrays.stream(input).sum();
    sum = sum * sum;
    int multiply = Arrays.stream(input).reduce(1, (a, b) -> a * b);

    System.out.println(multiply < sum ? 1 : 0);

  }

  // 문자 지우기
  @Test
  void removeString() {
    try {
      String myString = "apporoograpemmemprs";
      int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

      // 지워지지않는 인덱스를 구함...
      int[] notRemovedIndex = IntStream.range(0, myString.length()).filter((i) -> {
        for (int a : indices) {
          if (i == Integer.valueOf(a))
            return false;
        }
        return true;
      }).sorted().toArray();

      StringBuffer sb = new StringBuffer();
      for (int i : notRemovedIndex) {
        sb.append(myString.charAt(i));
      }

      System.out.println(sb.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
