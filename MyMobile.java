package week1.day2;

public class MyMobile {
	static int num = 456;
	static long mobilenumber=8072334185l;
	static char name ='R';
	static boolean ismobileswitchedoff=false;
	 public  void makeCall() {
		 System.out.println("makeCall");
	 }
	 public  void sendMsg() {
		 System.out.println("sendMsg"); 
	 }
	 private void payBills() {
		 System.out.println("payBills"); 
	 }
		public static void main(String[] args) {
			System.out.println(num);
			System.out.println(mobilenumber);
			System.out.println(name);
			System.out.println(ismobileswitchedoff);
			MyMobile obj=new MyMobile();
			obj.makeCall();
			obj.sendMsg();
			obj.payBills();
		
			
		}
			
	
	
	

}
