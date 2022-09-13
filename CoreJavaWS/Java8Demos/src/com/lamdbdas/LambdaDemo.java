package com.lamdbdas;

public class LambdaDemo {

	public static void main(String[] args) {
		// anonymous inner class
		INotification obj = new INotificationImp();
		obj.sendMessage();
		obj = new INotification() {
			
			@Override
			public void sendMessage() {
				System.out.println("from anpnymous inner class");
			}
		};
		obj.sendMessage();
		/**
		 * output return type
		 * input => parmaeters
		 * body
		 * (input) => {body ; return}
		 * (input) -> {body ; return}
		 */
		obj=  () -> {
			System.out.println("lamdas syntax");
		};
		obj=  () -> System.out.println("lamdas syntax");
		obj.sendMessage();
//		Addition addobj = (int a, int b) -> {
//			return a+b;
//		};
		Addition addobj = ( int a, int b) -> a+b;
		System.out.println(addobj.add(20, 34));
		EvenOdd eo = a -> a%2==0;
	}
}
class AddImp implements Addition{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int sub(int d, int y) {
		// TODO Auto-generated method stub
		return Math.abs(d-y);
	}
}
class INotificationImp implements INotification{

	@Override
	public void sendMessage() {
		System.out.println("from the class");
		// BL
	}
	
}

