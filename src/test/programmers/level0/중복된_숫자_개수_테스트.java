package programmers.level0;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class 중복된_숫자_개수_테스트 {

  /**
   * [1, 1, 2, 3, 4, 5]	1	2 [0, 2, 3, 4]	1	0
   */

  @Test
  public void firstExample() {
    int[] arr = {1, 1, 2, 3, 4, 5};
    int n = 1;
    int answer = 2;

    assertEquals(answer, level0.중복된_숫자_개수.solution(arr, n));
  }

  @Test
  public void secondExample() {
    int[] arr = {0, 2, 3, 4};
    int n = 1;
    int answer = 0;

    assertEquals(answer, level0.중복된_숫자_개수.solution(arr, n));
  }
}