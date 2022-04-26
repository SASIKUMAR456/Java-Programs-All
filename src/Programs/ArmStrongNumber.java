package Programs;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
        int number = 371, temp, remainder, result = 0;

        temp = number;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3); //result = result+Math.pow(remainder,3);
            temp /= 10;
            
            System.out.println(+result);
        }

        if(result == number) 
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

		
		
	}

}
