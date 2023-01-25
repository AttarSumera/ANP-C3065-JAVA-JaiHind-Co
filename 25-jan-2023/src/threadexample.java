//creating a thread by extending a thread class and overriding its run() method
public class threadexample extends Thread {
public void run() {
	System.out.println("code............");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadexample t= new threadexample(); // creating an object of thread
		t.start(); //calling start() method
		System.out.println("This code is running outside the Thread");
	}

}
