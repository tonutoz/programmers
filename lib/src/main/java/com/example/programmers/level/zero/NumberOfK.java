package com.example.programmers.level.zero;

import java.util.stream.IntStream;

/**
 * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지
 * return 하도록 solution 함수를 완성해주세요.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */
public class NumberOfK {
  public int solution(int i, int j, int k) {
    return (int) IntStream.range(i, j + 1).map((z) -> {
      int count = 0;
      for (String s : String.valueOf(z).split("")) {
        count += s.contains(String.valueOf(k)) ? 1 : 0;
      }
      return count;
    }).sum();
  }
}
