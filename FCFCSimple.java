//Thanks for Professor.Owen let me do this again. 
//FCFS is first come and first serve, so there is no anything switch or anything complacate. 
//I created three processes for this project. And it statrs time is 10. 
//Then later find out total awaiting average time
//I will create Short Time First methods for compare which average awaiting time is short 


import java.util.Scanner;

public class FCFCSimple {
	public static void main(String[] args){
		Scanner k= new Scanner(System.in);
		System.out.println("How many processes: ");
		int process=k.nextInt();
		System.out.println("Enter each process burst time: ");
		int[] burstTime=new int[process];
		int start=10;//They arrive the same time, but the order will be P1, P2,P3
		
		System.out.println("Enter process 1 burst time: ");
		int b1=k.nextInt();

		System.out.println("Enter process 2 burst time: ");
		int b2=k.nextInt();
		
		System.out.println("Enter process 3 burst time: ");
		int b3=k.nextInt();
		
		
		
		//FSFC function 
		int total1=start;
		int total2=start+b1;
		int total3=start+b1+b2;
		
		System.out.println("Process 1 total waiting time is "+ total1);
		System.out.println("Process 2 total waiting time is "+ total2);
		System.out.println("Process 1 total waiting time is "+ total3);
		
		double AverageTime = (double)(total1+total2+total3)/3 - start;
				
		System.out.println("Average Waiting Time for FCFC  "+AverageTime);
		

		
	}
	
		

}
