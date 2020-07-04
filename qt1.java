//1) initialize a single dimension array and sort it in ascending order.
public class qt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yug[]= {10,30,45,9,2,45,23};
		
		for(int i=0;i<yug.length;i++) {
			System.out.println("Before Sort : "+yug[i]);
		}
		
	//Selection Sort
		for(int i=0;i<yug.length-1;i++) {
			int min=i;
			int temp=0;
			for(int j=1;j<yug.length;j++) {
				if(yug[i]>yug[j]) {
					min=j;
				}
				if(min != i) {
					temp=yug[min];
					yug[min]=yug[i];
					yug[i]=temp;
				}
				
			}
		}
		
		for(int i=0;i<yug.length;i++) {
			System.out.println(yug[i]);
		}
	}

}
