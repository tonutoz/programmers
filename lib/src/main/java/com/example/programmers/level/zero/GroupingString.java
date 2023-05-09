package com.example.programmers.level.zero;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution
 * 함수를 완성해 주세요.
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/181855
 */
public class GroupingString {
  public int solution(String[] strArr) {

    Map<Integer, Long> frequencyMap = Arrays.stream(strArr).mapToInt(String::length).boxed()
        .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));

    int top =
        frequencyMap.keySet().stream().sorted(Comparator.comparing(frequencyMap::get).reversed())
            .limit(1).collect(Collectors.toList()).get(0);


    return frequencyMap.get(top).intValue();
  }
}
