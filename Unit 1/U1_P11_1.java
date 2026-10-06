//11.1 write a java program of 1D array take manually values.
public class U1_P11_1
{
	public static void main(String args[])
	
	{
        int scores[][]= new int[3][3];
		scores[0][0]=30;
		scores[0][1]=20;
		scores[0][2]=60;
		scores[1][0]=40;
		scores[1][1]=50;
		scores[1][2]=55;
		scores[2][0]=35;
		scores[2][1]=25;
		scores[2][2]=52;
		
		System.out.println("Manually assigned array elements:");
		for(int i=0;i<scores.length;i++)
		{
			for(int j=0;i<scores[i].length;j++)
			{
	           System.out.println(scores[i][j]+"");
			}
			System.out.println();
		}
	}
}
	