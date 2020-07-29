package testPack;



public class Check{

	public static void main(String[] args) {
		String s = new String(new char[] { 'a', 'b', 'c' }); 
		// "abc" will not be added to String constants pool.
	    System.out.println(System.identityHashCode(s));
	    s = s.intern();// add s to String constants pool
	    System.out.println(System.identityHashCode(s));
	    
	    
	    String s1=new String("Hello");
	    System.out.println(System.identityHashCode(s1));
	    s1=s1.intern();
	    System.out.println(System.identityHashCode(s1));
	}

}
