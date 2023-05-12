import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double[][] arr={
                {1.2,13.4,53.2,12.4},
                {5.2,13.4,5.2,2.4},
                {12.2,1.4,3.2,1.4}
        };
        Scanner input=new Scanner(System.in);
        int x;
        do{
            System.out.println("input x");
             x=input.nextInt();
             if(x<0 || x>2){
                 System.out.println("x>0 and x<3");
             }
        }while(x<0 || x>2);
        double sum=0;
        for(int i=0;i<arr[x].length;i++){
            sum+=arr[x][i];
        }
        System.out.println("sum = " +sum);
    }
}