import java.util.Random;

public class randomTest {
    public static void main(String[] args){
        for(int j=0;j<20;j++){
        int i = random7();
        System.out.println(i);
        }
    }
    private static int random7(){
        while(true){
        int k = (random3()-1)*3;
        int kk = k+random3();
        if(kk>7){
         continue;
        }
        return kk;
        }
    }

    private static int random3(){
        Random random = new Random();
        int j = random.nextInt(3)+1;
        return j;
    }
}
