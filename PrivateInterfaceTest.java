interface Greetings {
  
    private void log(String message) {
         System.out.println("LOG:" + message );
}

 default void sayHello() {
      log("Hello");
}
  
 
 default void sayGoodbye() {
      log("Goodbye");
}
  }

class Greeter implements Greetings {

}

public class PrivateInterfaceTest  {
    public static void main(String[] args) {
         Greeter g = new Greeter();
        g.sayHello();
        g.sayGoodbye();

   }
}