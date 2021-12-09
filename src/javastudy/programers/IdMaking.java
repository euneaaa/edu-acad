package javastudy.programers;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IdMaking {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
    }

    static class Solution {
        public String solution(String new_id) {
            String id = new_id;
            String answer = id.toLowerCase(Locale.ROOT);
            String[] arId = answer.split("");
            String as1 = "";
            for(int i = 0 ; i<arId.length; i++){
                if(Pattern.matches("^[0-9a-z]*$",arId[i])==true
                        ||Pattern.matches("[-_.]*$",arId[i])==true){
                    as1 += arId[i];}
            }
            as1 = as1.replaceAll("\\x2E{2,}",".");
            as1 = as1.replaceAll("^\\x2E","");
            if(as1.equals("")){
                as1 = "a";
            }
            as1 = as1.replaceAll({})
            return as1;
        }
    }
}

