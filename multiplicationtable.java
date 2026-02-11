import java.util.*;
class multiplicationtable{
   public static void mul(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=scan.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(i+" x "+num+" = "+i*num);
    }
   }
    public static void main(String []args){
    mul();
}
}