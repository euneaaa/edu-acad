package ch04;

public class ForTest3 {
    public static void main(String[] args){

        for(int i=2; i<10; i++){
            if(i>2){
                System.out.println("-----");}
            for(int z=1; z<10; z++){
                System.out.printf("%d X %d = %d\n",i,z,i*z);
            }
        }


    }
}
