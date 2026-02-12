import java.util.Scanner;
class findmax{
	   public static void max(int a, int b,int c){
	    
	    if(a>b && a>c) {
	    	System.out.print("A is greater");
	    }else if(b>c){
	    	System.out.print("B is greater");
	    }
	    else {
	    	System.out.println("C is greater");
	    }
	   }
	    public static void main(String []args){
	    	Scanner scan=new Scanner(System.in);
		    System.out.println("Enter the 1st number:");
		    int a=scan.nextInt();
		    System.out.println("Enter the 2nd number:");
		    int b=scan.nextInt();
		    System.out.println("Enter the 3rd number:");
		    int c=scan.nextInt();
	    max(a,b,c);
	}
	}
