import java.util.Scanner;
class count{
	   public static void max(int a){
		    int count=0;
	    for(int i=0;i<=a;i++) {
	    	count++;
	    	System.out.println(i);
	    }
	   
	    System.out.println("The count is:"+count);
	   }
	    public static void main(String []args){
	    	Scanner scan=new Scanner(System.in);
		    System.out.println("Enter the number:");
		    int a=scan.nextInt();
	    max(a);
	}
	}
