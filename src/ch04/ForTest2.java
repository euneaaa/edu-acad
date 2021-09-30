package ch04;

public class ForTest2 {
    public static void main(String[] args){
        int star = (int)(Math.random()*9)+2; //2~10

        System.out.println(star);
        for(int i=0;i<star;i++){
            System.out.print("*");

        }

    }
}
