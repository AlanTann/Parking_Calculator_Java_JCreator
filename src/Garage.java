import java.util.Scanner;
 
public class Garage {
    
    public void startCharging(){
    	
    	Scanner input = new Scanner( System.in );
    	
    	double totalReceipt = 0.0;
    	double fee;
    	double hours;
    	
    	System.out.print("Enter number of hours (a negative to quit): ");
    	
    	hours = input.nextDouble();
    	
    	while( hours >= 0.0)
    	{
    		fee = calculateCharges(hours);
    		
    		totalReceipt = totalReceipt + fee;
    		
    		System.out.printf("Current charge: %.2f, Total receipts: %.2f\n", fee, totalReceipt);
    		
    		System.out.printf("Enter number of hours (a negative to quit): ");
    		
    		hours = input.nextDouble();
    		
    	}
    }
    public double calculateCharges(double hours){
    	double fee;
    	
    	if(hours <= 3){
    		fee = 2.00;
    	}else{
    		fee = 2.00 + ((hours - 3)*0.50);
    	}
    	
    	if(fee > 10){
    		fee = 10.00;
    	}
    	
    	return fee;
    	
    }
}
