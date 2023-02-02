
public class Insert {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("StringBuffer");
		StringBuffer s1=s.append("is a peer class of String" );
		StringBuffer s2=s1.append("that provides much of");
		StringBuffer s3=s2.append("the functionality of Strings");
		System.out.println(s3);
		StringBuffer s4=new StringBuffer("it is used to at the specifiedindex position");
		s4.insert(14,"inside text");
		System.out.println(s4);
		StringBuffer s5=new StringBuffer("this method returns the reversed objects on which it was called");
		s5.reverse();
		System.out.println(s5);

	}

}
