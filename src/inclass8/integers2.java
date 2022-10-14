package inclass8;

public class integers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] powers= {0,1,2,3,4};
		for(int i: powers)
		{
			powers[i]=(int) Math.pow(2, i+1);
			System.out.println(powers[i]);
		}
		System.out.println("\n");
		int value;
		for(int i=powers.length-1;i>=0;i--)
		{
			powers[i]=(int) Math.pow(2, i+1);
			System.out.println(powers[i]);
		}
		System.out.println("\n");
	}

}
