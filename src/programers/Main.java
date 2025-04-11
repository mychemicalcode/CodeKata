package programers;

public class Main {
    public static void main(String[] args) {

                int answer = 0;
                int num = 0;
                int originNum = num;
                while (num <= 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    } else if (num == 1) {
                        answer = 0
                    }

                }

                return answer;
            }
        }






    }
}
//23. 콜라츠 추측


//22. 두 정수 사이의 합
//class Solution {
//    public long solution(int a, int b) {
//        long answer = 0;
//        int c = 0;
//        int baseNumber = 0;
//        // 정수 a, b 중 높은 숫자 판별 후 높은 값 BaseNumber에 대입
//        // 높은 수 - 작은 수 = c로 대입
//        if (a - b >= 0) {
//            baseNumber = a;
//            c = a - b;
//        } else if (a - b < 0) {
//            baseNumber = b;
//            c = b - a;
//        } for (int i = 0; i <= c; i++) {
//            answer += baseNumber - c + i;
//            // a = 5, b = 3 , c = 2
//            // 00_ 5-2+0 = 3 /01_ 5 - 2 + 1 = 4 /02_  , 5-2+2 = 5
//            // a = 3, b = 3, c = 0
//            // 00_ 3-0+0 = 3
//        }
//        return answer;
//    }
//}
// 22. 두 정수 사이의 합 다른 사람 답안 01
//
//    public long solution(int a, int b) {
//        return sumAtoB(Math.min(a, b), Math.max(b, a));
//    }
//
//    private long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;
//    }
//}
// 22. 두 정수 사이의 합 다른 사람 답안 02
//class Solution {
//    public long solution(int a, int b) {
//        long answer = 0;
//        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
//            answer += i;
//
//        return answer;
//    }
//}
// 22. 두 정수 사이의 합 다른 사람 답안 03
//class Solution {
//    public long solution(int a, int b) {
//        long answer = 0;
//
//        if (a < b) {
//            for (int i = a; i <= b; i++) {
//                answer += i;
//            }
//        } else {
//            for (int i = b; i <= a; i++) {
//                answer += i;
//            }
//        }
//        return answer;
//    }
//}


//21. 하샤드 수
//class Solution {
//    public boolean solution(int x) {
//        boolean answer = true;
//        int originX = x;
//
//        int n = 0;
//
//        while (x > 0) {
//            n += x % 10;
//            x /= 10;
//        }
//        if (originX % n == 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}

//20. 정수 내림차순으로 배치하기
//import java.util.Arrays;
//import java.util.Collections;
//
//class Solution {
//    public long solution(long n) {
//        // 1. 숫자를 문자열로 변환
//        String str = Long.toString(n);
//
//        // 2. 문자열의 길이를 기준으로 배열 생성
//        Integer[] digits = new Integer[str.length()];
//
//        // 3. 문자열 하나씩 배열에 삽입
//        for (int i = 0; i < digits.length; i++) {
//            digits[i] = Character.getNumericValue(str.charAt(i));
//