package com.example.programmers.level.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고
 * 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class NoSameNumber {
  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    list.add(arr[0]);
    for (int i = 1; i <= arr.length; i++) {
      int val = arr[i - 1];
      if (i != 1 && val != arr[i - 2]) {
        list.add(Integer.valueOf(val));
      }
    }


    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
