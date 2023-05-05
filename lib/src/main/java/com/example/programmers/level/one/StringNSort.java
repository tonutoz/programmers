package com.example.programmers.level.one;

import java.util.Arrays;

/**
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가
 * ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class StringNSort {
  public String[] solution(String[] strings, int n) {
    Arrays.sort(strings, (o1, o2) -> {
      if (o1.charAt(n) == o2.charAt(n)) {
        return o1.compareTo(o2);
      }
      return o1.charAt(n) > o2.charAt(n) ? 50 : -50;
    });
    return strings;
  }
}
