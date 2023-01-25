//creating a thread by implementing Runnable interface
public class threadexample2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadexample2 t= new threadexample2(); // creating instance of ThreadExample2 class
		Thread thread=new Thread(t);  // creating instance of Thread class(in built class)
		thread.start(); // instance of Thread class is used to call the start() method	
		System.out.println("This code is running outside the Thread");
	}
	public void run()
	{
		System.out.println("This code is running inside the Thread");
	}
	}


