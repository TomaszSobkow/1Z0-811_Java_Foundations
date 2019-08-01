import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic13{

public static void main(String[] args){
	JFT13Ex4();
	}


	public static void JFT13Ex4(){
		String stringTAX;
		float taxPayable;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Employee Name please: ");
			String employeeName = input.nextLine();
		System.out.print("Enter Employee PPS NO: ");
			String ppsNo = input.nextLine();
		System.out.print("Enter Employee Department: ");
			String department = input.nextLine();
		System.out.print("Basic hours worked: ");
			float hoursWorked = input.nextFloat();
		System.out.print("Enter Overtime Hours Worked: ");
			float overTimeHours = input.nextFloat();
			
		//calculations
		float hourlyRate = 29.39f;
		float overTimeRate = hourlyRate * 1.5f;	
		float hourlyTOTAL = ( hourlyRate* hoursWorked);
		float overtimeTOTAL = ( overTimeRate * overTimeHours);	
		float incomeTOTAL = ( hourlyTOTAL + overtimeTOTAL);
		
			if(incomeTOTAL <= 2000 ){
				taxPayable = 0.20F;
				stringTAX = "20%";
			}
			else{
				taxPayable = 0.35F;
				stringTAX = "35%";
			}
		
		float tax = incomeTOTAL * taxPayable;
		
		System.out.println("*********************** Salary Report **************************"+
			"\n\n======================= Employee Details ======================="+
			"\n\tEmployee Name:   \t"   + employeeName+
			"\n\tEmployee PPS No: \t"   + ppsNo+
			"\n\tEmployee Depertment:\t"+ department+
			"\n\n========================== Hours Worked =========================="+
			"\n\tNo. of basic hours worked: \t" + hoursWorked +
			"\n\tThe hourly rate of basic pay is at: "  + hourlyRate + " €"+
			"\n\tBasic Salary: "   + String.format("%.2f",hourlyTOTAL)+ " €"+
			"\n\tNo. of overtime hours worked: "        + overTimeHours+
			"\n\tThe hourly rate of overtime pay is at time amd half."+
			"\n\tOvertime salary: "+String.format("%.2f",overtimeTOTAL)+ " €"+
			"\n\n========================== Take home salary ======================"+
			"\n\tGross PAY: "+String.format("%.2f", (hourlyTOTAL + overtimeTOTAL))+" €"+
			"\n\tIncome TAX Payable at: " + stringTAX + " is: " + String.format("%.2f",tax) + " €"+
			"\n\tNet Pay: "+String.format("%.2f",(hourlyTOTAL + overtimeTOTAL) - tax) + " €"+
			"\n====================================================================");
	}
	
	
	public static void JFT13Ex3(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal no: ");
		double inputNo = input.nextDouble();
		System.out.printf("Using decimal format object %f",inputNo);
		System.out.printf("\nUsing decimal format object %.2f",(inputNo));
		
	}
	
	
	
	public static void JFT13Ex1(){
		float num1 = 10.05f;
		float num2 = 20.34f;
		
		System.out.println("Max no. is: "+ Math.max(num1, num2));
		System.out.println("Min No. is: "+ Math.min(num1, num2));	
	}
	
	public static void JFT13Ex2(){
		Random random = new Random();
		
		int randomNumber = random.nextInt(10);
		System.out.println(randomNumber);
		
	}
}