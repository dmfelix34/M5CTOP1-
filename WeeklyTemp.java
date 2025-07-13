package Option1;

import java.util.Scanner;

public class WeeklyTemp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter day of week (Sunday-Saturday or week): ");
		String[] numofDays = new String[8];
		int[] dailyTemps = new int[8];
		int i;
		int SumofdailyTemps;
		
		
		numofDays[0]="Sunday";
		numofDays[1]="Monday";
		numofDays[2]="Tuesday";
		numofDays[3]="Wednesday";
		numofDays[4]="Thursday";
		numofDays[5]="Friday";
		numofDays[6]="Saturday";
		numofDays[7]="week";
		
		
		dailyTemps[0]=62;
		dailyTemps[1]=71;
		dailyTemps[2]=81;
		dailyTemps[3]=86;
		dailyTemps[4]=81;
		dailyTemps[5]=77;
		dailyTemps[6]=75;
		
		
		for(i=0;i<dailyTemps.length;++i) {
			SumofdailyTemps=0;
			SumofdailyTemps=dailyTemps[i]+SumofdailyTemps;
			dailyTemps[7]=SumofdailyTemps/(7);
		}
			
		
		String numofDays1=keyboard.nextLine();
		
		
		for(i=0;i<numofDays.length;++i) {
		numofDays1=numofDays[i];
			if(numofDays[0]=="Sunday") {
			System.out.println(numofDays[0] + " = " + dailyTemps[0] + " degrees.");	
			}
			else if (numofDays[1]=="Monday") {
			System.out.println(numofDays[1] + " = " + dailyTemps[1] + " degrees.");
			}
			else if (numofDays[2]=="Tuesday"){ 
				System.out.println(numofDays[2] + " = " + dailyTemps[2] + " degrees.");
			}
			else if (numofDays[3]=="Wednesday"){ 
				System.out.println(numofDays[3] + " = " + dailyTemps[3] + " degrees.");
			}
			else if (numofDays[4]=="Thursday"){ 
				System.out.println(numofDays[4] + " = " + dailyTemps[4] + " degrees.");
			}
			else if (numofDays[5]=="Friday"){ 
				System.out.println(numofDays[5] + " = " + dailyTemps[5] + " degrees.");
			}
			else if (numofDays[6]=="Saturday"){ 
				System.out.println(numofDays[6] + " = " + dailyTemps[6] + " degrees.");
			}
			else if (numofDays[7]=="week"){ 
				System.out.println(numofDays[7] + " = " + dailyTemps[7] + " degrees in average.");	
			}
	}
	}
}
