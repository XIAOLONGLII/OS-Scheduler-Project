import java.util.Scanner;

public class SJFSImple {
	
	
	public static void main(String[] args){
		Scanner k= new Scanner(System.in);
		System.out.println("How many processes: ");
		int process=k.nextInt();
		System.out.println("Enter each process burst time: ");
		int[] burstTime=new int[process];
		int start=10;//They all start here, however they will have different order when they implement 
		
		System.out.println("Enter process 1 burst time: ");
		int b1=k.nextInt();

		System.out.println("Enter process 2 burst time: ");
		int b2=k.nextInt();
		
		System.out.println("Enter process 3 burst time: ");
		int b3=k.nextInt();
		
		
		//SJF function 
		if(b1<b2&&b1<b3){
			System.out.println("This will start from b1 which starts "+(start));
			if(b2<b3){
				System.out.println("The next will be b2 which starts "+(start+b1));
				System.out.println("The last will be b3 which starts "+(start+b1+b2));
				System.out.println("The total waiting time  is "+(start+2*b1+b2));
				System.out.println("The average waiting is "+((double)(start+2*b1+b2)/3-start));
				
			}else{
				System.out.println("The next will be b3 which starts "+(start+b1));
				System.out.println("The last will be b2 which starts "+(start+b1+b3));
				System.out.println("The average waiting is "+((double)(start+2*b1+b3)/3-start));
			}
		}
		else if(b2<b1&&b2<b1){
			System.out.println("This will start from b2 which starts "+(start));
			if(b1<b3){
				System.out.println("The next will be b1 which starts "+(start+b2));
				System.out.println("The last will be b3 which starts "+(start+b1+b2));
				System.out.println("The average waiting is "+((double)(start+2*b2+b1)/3-start));
			}else{
				System.out.println("The next will be b3 which starts "+(start+b2));
				System.out.println("The last will be b1 which starts "+(start+b3+b2));
				System.out.println("The average waiting is "+((double)(start+2*b2+b3)/3-start));
			}
		}else if (b3<b1&&b3<b2){
			System.out.println("This will start from b3 which starts "+(start));
			if(b1<b2){
				System.out.println("The next will be b1 which starts "+(start+b3));
				System.out.println("The last will be b2 which starts "+(start+b1+b3));
				System.out.println("The average waiting is "+((double)(start+2*b3+b1)/3-start));
			}else{
				System.out.println("The next will be b2 which starts "+(start+b3));
				System.out.println("The last will be b1 which starts "+(start+b3+b2));
				System.out.println("The average waiting is "+((double)(start+2*b3+b2+b1)/3-start));
			}
			
			
		}
		
		
		
		
		
		
		

		
	}
	

}
