package level0;

/**
 * 문제 설명 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 * <p>
 * 제한사항 1 ≤ array의 길이 ≤ 100 0 ≤ array의 원소 ≤ 1,000 0 ≤ n ≤ 1,000
 */

public class 중복된_숫자_개수 {

  public static int solution(int[] arr, int n) {
    int answer = 0;

    for (int number : arr) {
      if (number == n) {
        answer++;
      }
    }

    return answer;
  }

}