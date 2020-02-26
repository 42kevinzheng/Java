
public class gg {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<5;i++)
		{
			System.out.println(a[i]);
			System.out.println(a[i*2]);
		}
		
		System.out.println();
		System.out.println();
			int[] b = {1,2,3,4,5,6,7,8,9,10};
			splitPrint(b);
		}
		public static void splitPrint(int[] a)
		{
			System.out.println(a[a.length-1]);
			int halfSize = a.length/2;
			if(halfSize > 0)
			{
				int[] newArr = new int[a.length/2];
				for(int i=0;i<newArr.length;i++)
				{
					newArr[i] = a[i];
				}
				splitPrint(newArr);
			}
	}

}
