package week1.day1;

public class Mobilephone {
    private void makeCall() {
		// TODO Auto-generated method stub
     System.out.println("Make a call");
      String mobileModel="Realme narzo";
      float mobileWeight=125.75f;
	}
    private void sendMsg() {
		// TODO Auto-generated method stub
       boolean fullCharged=true;
       int mobileCost=12000;
       System.out.println("Send a Message");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobilephone obj=new Mobilephone();
     obj.makeCall();
     obj.sendMsg();
	}

}
