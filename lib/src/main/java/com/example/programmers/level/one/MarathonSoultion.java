package com.example.programmers.level.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return
 * 하도록 solution 함수를 작성해주세요.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class MarathonSoultion {
  public String solution(String[] participant, String[] completion) {
    LinkedList<String> retriedList = new LinkedList<>(Arrays.asList(participant));
    retriedList.sort(Comparator.naturalOrder());
    Arrays.sort(completion);
    for (String p : completion) {
      if (retriedList.get(0).equals(p)) {
        retriedList.remove(0);
      } else if (retriedList.get(1).equals(p)) {
        retriedList.remove(1);
      }
    }
    return retriedList.get(0);
  }
}
