package Exception;

public class Assignment_Exception {
	public void show() {
		try {
			int i = 50/0;
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("invalid division");
		}
	}
	//string prsed to a numeric value
	public void StringParsed() {
	try {
	String a = "rohit";
	int  n = Integer.parseInt(a);
	 System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Format mismatch");}
	}
	//accessing a invalid calculation
	public void Calculator(){
		try {
			int a =50/0+96+45/0;
		}
		catch(Exception e) {
			System.out.println(e);}
		System.out.println("calculation invalid");		
		}
	//accessing in invalid index in array:print "array index is invalid"
public void index() {
	try {
		int arr[]= new int [5];
		arr[7]=10;
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.println("array index is invalid");
	}
}
//main metohd
public static void main(String[] args) {
	System.out.println("Exception handling is completed");
	Assignment_Exception ae = new Assignment_Exception();
	ae.show();
	ae.StringParsed();
	ae.Calculator();
	ae.index();
	
}

		
	}

