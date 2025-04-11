//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
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
//        }
//
//        // 4. 배열 내림차순 정렬
//        Arrays.sort(digits, Collections.reverseOrder());
//
//        // 5. 정렬된 숫자를 문자열로 변환한 후 숫자로 변환
//        String sortedStr = Arrays.stream(digits)
//                .map(String::valueOf)
//                .reduce("", (a, b) -> a + b);
//
//        return Long.parseLong(sortedStr);
//    }
//}
//
//19. 정수 제곱근 판별
//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//        long x = (long)Math.sqrt(n);
//
//        if (x*x == n) {
//            answer = ((x+1)*(x+1));
//        } else {
//            answer = -1;
//        }
//        return answer;
//    }
//}


//18. 문자열을 정수로 바꾸기
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        answer = Integer.parseInt(s);
//
//        return answer;
//    }
//}

// 17. 자연수 뒤집어 배열로 만들기
//class Solution {
//    public int[] solution(long n) {
//        // 1. 숫자를 문자열로 변환
//        String str = Long.toString(n);
//
//        // 2. 문자열의 길이를 기준으로 배열 생성
//        int[] answer = new int[str.length()];
//
//        // 3. 문자열의 끝에서부터 한 글자씩 숫자로 변환하여 배열에 저장
//        for (int i = 0; i < str.length(); i++) {
//            answer[i] = str.charAt(str.length() - 1 - i) - '0'; // 문자 -> 숫자 변환
//        }
//
//        return answer; // 결과 배열 리턴
//    }
//}

// 16.
//class Solution {
//    public long[] solution(long x, int n) {
//        long[] answer = new long [n];
//        for (int i = 0; i <= answer.length-1; i++) {
//            answer[i] = x * (i+1);
//        }
//        return answer;
//    }
//}
// 15. 나머지가 1이 되는 수 찾기
//class Solution {
//    public int solution(int n) {
//        for (int x = 2; x < n; x++) { // x는 2부터 시작, 가장 작은 자연수를 찾아야 하므로 1 제외
//            if (n % x == 1) { // 나머지가 1인 경우
//                return x; // 조건을 만족하는 첫 번째 값을 바로 반환
//            }
//        }
//        return -1; // 이 줄은 사실상 실행되지 않음 (문제에서 답이 항상 존재한다고 했으므로)
//    }
//}

// 14.약수의 합
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0)
//                answer += i;
//        }
//        return answer;
//    }
//}

// 13. 자릿수 더하기
//import java.util.*;
//
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//          나머지를 answer 삽입
//        while (n > 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//
//        return answer;
//    }
//}

//package nbcCodeKata;
//
//public class PracCodeKata {
//    public double solution(int[] arr) {
//        double answer = 0;
//
//        //배열의 모든 요소를 더함
//        for (int num : arr) {
//            answer += num; // 배열의 각 숫자를 더하기
//        }
//
//        // 배열의 평균을 계산
//        answer /= arr.length; // 합계를 배열의 길이로 나눠 평균 계산
//
//        return answer; // 평균값 반환
//    }
//
//        public static void main(String[] args) {
//            //Solution cLass의 객체 생성
//            PracCodeKata sol = new PracCodeKata();
//
//            int[] exampleArr = {1,2,3,4,5};
//
//            double result = sol.solution(exampleArr);
//            System.out.println("result = " + result);
//
//        }
//}
/*
11. 짝수와 홀수
Even과 Odd가 문법과 관련된 내용이 있을 줄 알고 서칭했으나 아무 의미 없는 문구였다.
인터넷에 보니 삼항 사용방법이 있어서 현업에서 삼항 연산자를 사용해봤다.

class Solution {
    public String solution(int num) {

        String answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
}
 */

/* 10. 배열의 평균값
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

        for(int result : numbers) {
            sum += result;
        }
        return (double) sum / numbers.length;
    }
}
 */



//public class PracCodeKata {
//    public static void main(String[] args) {
//
//        int sum = calculate();
//        System.out.println("짝수 정수들의 값 = " + sum);
//    }
//
//    public static int calculate(){
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int a = sc.nextInt();
//
//        for (int i = a; i > 0; i--) {
//            if (i % 2 == 0) {
//                sum += i;
//                System.out.println("연산 점검 i 값 = " + i);
//
//            }
//        }
//        return sum;
//    }
//}


//        int customers = 5;
//
//        for (int i = 1; i <= customers; i++) {
//            System.out.println(i + "번째 손님, 안녕하세요!");
//        }


//        for (int n = 10; n > 0; --n) {
//            if (n%2==0){
//
//                System.out.println("n%2==0" + n + "번째 반복문");
//            }
//            System.out.println("전체" + n + "번째 반복문");
//        }
// 증감연산자 사용
// -후위연산 이용
// %2 =0
// n 후위연산, %2 =0일 때 값 추출
// 해당 값 더하기


//각도기
// class Solution {
//    public int solution(int angle) {
//        int answer = 0;
//
//        if (angle  > 0 && angle < 90) {
//            answer = 1;
//
//        } else if (angle == 90) {
//            answer = 2;
//
//        } else if (angle > 90 && angle < 180) {
//            answer = 3;
//
//        } else if (angle == 180) {
//            answer = 4;
//
//        }
//
//        return answer;
//    }
//}

// 7 나눗셈
//class Solution {
//    public double solution(double num1, double num2) {
//
//        double answer = 0;
//        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
//            answer = (int) ((num1 / num2) * 1000);
//        }
//        return answer;
//    }
//}

// 두 수의 나눗셈 class Solution {
//    public double solution(double num1, double num2) {
//
//        double answer = 0;
//        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
//            answer = (int) ((num1 / num2) * 1000);
//        }
//        return answer;
//    }
//}
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
//            answer = num1 + num2;
//        }
//        return answer;
//    }
//}



//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
//            answer = num1 - num2;
//        }
//        return answer;
//    }
//}
//
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
//            answer = num1 * num2;
//        }
//        return answer;
//    }
//}
//
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
//            answer = num1 / num2;
//        }
//        return answer;
//    }
//}
//
//class Solution {
//    public int solution(int age) {
//        int answer = 0;
//
//        if (age > 0 && age <= 120) {
//            answer = 2022 - age + 1;
//        }
//        return answer;
//    }
//}
//
//
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 >= 0 && num1 <= 10000
//                && num2 >= 0 && num2 <= 10000) {
//
//            if (num1 == num2) {
//                answer = 1;
//            } else {
//                answer = -1;
//            }
//        }
//        return answer;
//    }
//}
    }
}