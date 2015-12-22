import java.util.Scanner;

public class InputPyramid {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Would you like a Normal(N), Reversed(R), or Centered(C) pyramid?: ");
		String x = "";
		while(!(x.equals("N") || x.equals("R") || x.equals("C"))){
			if(!x.equals("")){System.out.print("Please enter a valid input: ");}
			x = scn.nextLine();
		}
		System.out.println("Thank you.");
		System.out.println("Please enter the number of rows: ");
		int n = 0;
		while(n<=0) {
			if(n<0){System.out.print("Please enter a positive integer: ");}
			n = scn.nextInt();
		}
		System.out.println("Thank you.");
		String pyr = "";
		if(x.equals("N")) pyr="Normal";
		if(x.equals("R")) pyr="Reversed";
		if(x.equals("C")) pyr="Centered";
		
		System.out.println("\nHere is your "+pyr+" "+n+"-row pyramid. Enjoy!");
		
		//Creates a "Normal" pyramid.
		if(x.equals("N")){
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		//Creates a "Reverse" pyramid.
		if(x.equals("R")){
			for(int i=0;i<n;i++){
				for(int j=0;j<n-i;j++){
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++){
					System.out.print("*");
				}
				System.out.println();
			}			
		}
		//Creates a "Centered" pyramid.
		if(x.equals("C")){
			int y = n;
			if(y%2==1){y=y-1;}
			int z = y/2;
			for(int i=0;i<y;i++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int i=0;i<y;i++){
				System.out.print(" ");
			}
			System.out.println();
			//End of pyramid top.
			for(int i=1;i<(n*2)-1;i=i+2){
				y--;
				for(int j=0;j<y;j++){
					System.out.print(" ");
				}
				for(int k=0;k<i+2;k++){
					System.out.print("*");
				}
				for(int j=0;j<y;j++){
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		System.out.println("\nGoodbye!");
		scn.nextLine();
		System.exit(0);		
	}
}
