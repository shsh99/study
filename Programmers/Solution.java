package Programmers;

import java.util.Scanner;

class Solution {

    // TODO : 8페이지 11) 가까운 수
//    public int solution(int[] array, int n) {
//        int min_diff = Integer.MAX_VALUE;
//        int min_value = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            int value = array[i];
//            int diff = Math.abs(value - n);
//            if (diff < min_diff) {
//                min_diff = diff;
//                min_value = value;
//            }
//        }
//
//        return min_value;
//    }

    // TODO: 8페이지 12) 삼각형의 완성조건
//    public int solution(int[] sides) {
//
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = b + c;
//        for (int i = 0; i < sides.length; i++) {
//            if (sides[i] > a) {
//                a = sides[i];
//            }
//
//            b += sides[i];
//        }
//
//        for (int i = 0; i < sides.length; i++) {
//            if (i != sides.length - 1) {
//                c += sides[i];
//            }
//        }
//
//        if (a < d ) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }

    // TODO : 8페이지 13) 중복된 문자 제거
//  public String solution(String my_string) {
//        String answer = "";
//
//        for (int i = 0; i < my_string.length(); i++) {
//            char currentChar = my_string.charAt(i);
//
//            if (answer.indexOf(currentChar) == -1) {
//                answer += currentChar;
//            }
//        }
//
//        return answer;
//    }

    // TODO : 8페이지 14) k의 개수
//    public int solution(int i, int j, int k) {
//        int count = 0;
//        int answer = 0;
//
//        for (int a = i; a <= j; a++) {
//            int b = a;
//
//            while (b > 0) {
//                int c = b % 10;
//                if (c == k) {
//                    count++;
//                }
//                b /= 10;
//            }
//        }
//        answer = count;
//        return answer;
//    }

    // TODO : 8페이지 15) A로 B 만들기
//    public int solution(String before, String after) {
//
//        if (before.length() != after.length()) {
//            return 0;
//        }
//        for (int i = 0; i < before.length(); i++) {
//            char a = before.charAt(i);
//            int b = 0;
//            int c = 0;
//            for (int j = 0; j < before.length(); j++) {
//                if (before.charAt(j) == a) {
//                    b++;
//                }
//            }
//            for (int j = 0; j < after.length(); j++) {
//                if (after.charAt(j) == a) {
//                    c++;
//                }
//            }
//            if (b != c) {
//                return 0;
//            }
//        }
//        return 1;
//    }

    // TODO : 8페이지 16) 이진수 더하기

//    public String solution(String bin1, String bin2) {
//        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
//    }
// 다른 방법

//    public String solution(String bin1, String bin2) {
//      String answer = "";
//
//      int a = Integer.parseInt(bin1,2);
//      int b = Integer.parseInt(bin2,2);
//      answer = Integer.toBinaryString(a+b);
//      return answer;
//}
    // TODO : 8페이지 17) 치킨 쿠폰
//    final int BONUS_NUM = 10;
//    public int solution(int chicken) {
//        int answer = 0;
//
//        while (chicken >= BONUS_NUM) {
//            int newChick = chicken / BONUS_NUM;
//            int restChick = chicken % BONUS_NUM;
//            chicken = newChick + restChick;
//
//            answer += newChick;
//        }
//
//        return answer;
//    }

    // TODO : 8페이지 18) 로그인 성공?


}


//    public String solution(String str1, String str2) {
//
//            String answer = "";
//
//        for(int i = 0; i < str1.length(); i++){
//            answer+= str1.charAt(i);
//            answer+= str2.charAt(i);
//        }

//        방어적 코드로 짜기
//        int val = str1.length();
//        int val2 = str2.length();
//        int min = Math.min(val, val2);
//            for (int i = 0; i < min; i++) {
//                answer += str1.charAt(i);
//                answer += str2.charAt(i);
//            }
//
//            if (val > val2) {
//                answer += str1.substring(min);
//            } else if (val2 > val) {
//                answer += str2.substring(min);
//            }

//            return answer; }



