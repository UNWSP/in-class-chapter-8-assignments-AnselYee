package inclass8;

public class integers10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50,60};
		for(int x: numbers)
		{
			System.out.println(x);
		}
		System.out.println("\n");
		int value;
		for(int x=numbers.length-1;x>=0;x--)
		{
			value=numbers[x];
			System.out.println(value);
		}
		System.out.println("\n");
		
		int sum=0;
		int count=0;
		for(int number:numbers)
		{
			sum+=number;
			count++;
			
		}
		System.out.println(sum);
		int average=sum/count;
		System.out.println(average);
	}
		
}
