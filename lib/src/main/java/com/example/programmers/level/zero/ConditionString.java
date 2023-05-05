package com.example.programmers.level.zero;

/**
 * 두 수가 n과 m이라면 ">", "=" : n >= m "<", "=" : n <= m ">", "!" : n > m "<", "!" : n < m
 * 
 * @author insu
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class ConditionString {
  public int solution(String ineq, String eq, int n, int m) {
    String condition = ineq + eq;
    int answer = 0;
    switch (condition) {
      case ">=":
        if (n >= m)
          answer = 1;
        break;
      case "<=":
        if (n <= m)
          answer = 1;
        break;
      case ">!":
        if (n > m)
          answer = 1;
        break;
      case "<!":
        if (n < m)
          answer = 1;
        break;
      default:
        break;
    }

    return answer;
  }
}
