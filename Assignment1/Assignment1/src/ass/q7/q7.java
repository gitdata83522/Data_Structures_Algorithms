package ass.q7;

public class q7 {
	

		public static void main(String[] args)
		{
			int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
			int flag;
			
			for (int i = 0; i < arr.length; i++)
			{
				flag=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					  flag=1;
					  break;
					}
				}
				
				if(flag==0)
				{
					System.out.println("first non-duplicate element is : "+arr[i]);
					break;
				}
			}

		}

	}

