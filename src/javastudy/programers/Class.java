package javastudy.programers;

import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(45));

    }

    static class Solution {
        public int solution(int n){
            int answer = 0;
            String result = "";
            while (n>0){
                result = (n%3) + result;
                n = n/3;
            }
            String[] arr = result.split("");
            String[] arr2 = new String[arr.length];
            for(int i = 0; i<arr.length; i++){
                arr2[i]= arr[arr.length-1-i];
            }
            String str = String.join("",arr2);
            answer = Integer.parseInt(str,3);
            return answer;
        }
    }
}

