package codeUp.N1041_1050;

import java.util.Scanner;

public class CodeUp_1043 {
    // 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
    // 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a % b);
    }
}
