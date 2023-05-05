package com.example.programmers.level.zero;

import java.util.stream.IntStream;

/**
 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을
 * return 하는 solution 함수를 작성해 주세요.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

public class EvenOddCheck {
  public int solution(int n) {
    int answer = 0;

    if (n % 2 == 0) {
      answer = (int) IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
    } else {
      answer = (int) IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).sum();
    }

    return answer;
  }
}
