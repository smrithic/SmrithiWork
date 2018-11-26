package decisionMaking;


public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double counter = 0;
		double highestfactors = 0;
		double highest = 0;
		
		for (int j = 1; j < 1000; j++) {
		counter = 0;
			
			for (double i = j; i > 0 ; i--)
			{
				
				if (j % i == 0) 
				{
					counter++;
				}
			}
			
			if (counter >= highestfactors)
			{
				highestfactors = counter;
				highest = j;
			}
			//System.out.println("The number of factors in "+j+" is "+counter);
		}
		System.out.println("The highest factor is " + highest);
	}
}
