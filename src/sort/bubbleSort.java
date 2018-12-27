package sort;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={45,34,32,67,13,78};
		int temp;
		for(int i=0;i<5;i++)
			for(int j=0;j<5-i;j++)
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		System.out.println(a[5]);
	}

}
