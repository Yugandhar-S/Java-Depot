import java.util.ArrayList;

class MyNum{
	int num;

	public MyNum(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyNum num=" +this.getClass().getName()+ num;
	}

	@Override
	public int hashCode() {
	
		return num;
	}
	
	
	public boolean equals(Object ref) {
		return num==((MyNum)ref).num;
	}
	

}

public class Main {
	
	public String toString() {
		return "This is Main Class";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(100);
		
		MyNum m9=m1;
		System.out.println(m1);
		System.out.println(m2);
		
		if(m1.equals(m2)) {
			System.out.println("m1 and m2 are Equal");
		}
		else {
			System.out.println("m1 and m2 are not Equal");
		}
		
		if(m1.equals(m9)) {
			System.out.println("m1 and m9 are Equal");
		}
		else {
			System.out.println("m1 and m9 are not Equal");
		}
		
		if(m1==m2) {
			System.out.println("m1 and m2 are ==");
		}
		else {
			System.out.println("m1 and m2 are not ==");
		}
		
		int m3[]= {2,3,4,6,8};
		
		//String s= obj.toString();
		
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.getClass());
		
		String s1="Hello";
		System.out.println(s1.toUpperCase());
		
		String s2="Lower to Upper";
		System.out.println(s2.toLowerCase());
				
		
		
		String s=new String("Yug");
		System.out.println(s);
		
		Integer I=new Integer(27);
		System.out.println(I);
		
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		
		System.out.println(l);
		
		Main m= new Main();
		System.out.println(m);
		
	}

}
