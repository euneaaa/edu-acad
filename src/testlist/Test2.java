package testlist;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        System.out.println("mon : "+ mon);
        switch(mon){
            case 12 : case 1: case 2:
                System.out.println("겨울");
                break;
            case 3 : case 4: case 5:
                System.out.println("봄");
                break;
            case 6 : case 7: case 8:
                System.out.println("여름");
                break;
            case 9 : case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("알 수 없음");
                break;
        }
    }
}
