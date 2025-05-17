class MyThread implements Runnable {
 String name ;
 Thread t;
 MyThread(String threadname) {
 name = threadname;
 t=new Thread(this, "Demo Thread");
   System.out.println("name: "+t);
 t.start();
}

public void run(){
 try{
    for(int i=5;i>0;i--){
        System.out.println("name : " + i);
        Thread.sleep(500);
	}
  }
catch(InterruptedException e ) {
     System.out.println("Child Interrupted");
  }
   System.out.println("Exiting child thread.");
   }
}

class MultiThreadDemo{
  public static void main(String args[]){
  new MyThread("One");
  new MyThread("Two");
  new MyThread("Three");
  try{
	Thread.sleep(10000);
  }
   catch(InterruptedException e){
   System.out.println("Main Thread interrupted.");
}
System.out.println("Main thread exiting.");
	}
}