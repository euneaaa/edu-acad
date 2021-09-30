package ch04;

public class ForTest {
    public static void main(String[] args){
        int dan = (int)(Math.random()*8)+2; //2~9

        for(int i = 1;i<10;i++){
            System.out.printf("%d X %d = %d\n",dan,i,(dan*i));
        }

    }
}
