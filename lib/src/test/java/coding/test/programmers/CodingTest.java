package coding.test.programmers;

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

}
