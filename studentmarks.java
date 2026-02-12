import java.util.Scanner;
class studentmarks{
	static int mark1,mark2,mark3;
	static double avg;
	public static void setMarks(int m1,int m2,int m3) {
		 mark1=m1;
		 mark2=m2;
		 mark3=m3;
	}
	public static void  calculateAverage() {
	 avg=(mark1+mark2+mark3)/3.0;
	}
	public static void  printResult() {
		System.out.println("mark1: "+mark1);
		System.out.println("mark2: "+mark2);
		System.out.println("mark3: "+mark3);
		System.out.println("average: "+avg);
	}
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
			System.out.print("Enter the marks:");
			int m1=scan.nextInt();
			int m2=scan.nextInt();
			int m3=scan.nextInt();
			setMarks(m1,m2,m3);
			 calculateAverage();
		     printResult();
	}
	}
