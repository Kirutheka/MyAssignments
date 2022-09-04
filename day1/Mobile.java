package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		
		System.out.println("U can send Message");
	}
	public void takeSnap() {
		System.out.println("Snapshot available");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new Mobile();
		obj.sendSMS();
		obj.takeSnap();

	}

}
