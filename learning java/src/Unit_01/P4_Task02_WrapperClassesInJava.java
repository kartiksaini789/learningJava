package Unit_01;

/*
 * The wrapper class in java provides the mechanism to convert primitive into object.
 * why?
 * because we want to use predefined method of those objects
 * -boolean data type->boolean obj;-->obj.toString();
 * 
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// converting int into Integer 
		int a=20;
		
		String s ="" + a + "";
		
		Integer i= Integer.valueOf(a);//converting int into integer explicitly
		Integer j= a;//autoboxing now compiler will write Integer.valueof(a) internal
		
		System.out.println(a+" " + i + " " + j);
		
		System.out.println(i.toString());
		
		//a.toString can not be done due to a isn't an object
		
		//autoboxing: converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//unboxing: converting objects to primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
		

	}

}