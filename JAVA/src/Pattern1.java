
import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Enter the no.");
			Scanner sn=new Scanner(System.in);
			int n=sn.nextInt();
			int i,j,k;
			for(i=0;i<n;i++)
			{
				for(j=n-1;j>i;j--)
				{
					System.out.print(" ");
				}
			    for(k=0;k<=i;k++)
			    {
				System.out.print("*");
				
			    }
			    System.out.println("");
			}
			}
}