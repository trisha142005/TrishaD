class Box{
     double length,width,height;
     
     Box(double l,double w,double h){
     length=l;
     width=w;
     height=h;
     }
      
     double calculateVolume(){
       return length*width*height;
      }
    
    void displayDetails(){
        System.out.println("Box Dimensions:" + length + "x" + width + "x" + height);
        System.out.println("Volume:"+calculateVolume());
      }
   }
public class Lab1{
   public static void main(String[]args){
     
     Box Box1=new Box(1,2,3);
     Box Box2=new Box(3,4,6);

     Box1.displayDetails();
     Box2.displayDetails();

     System.out.println("Box 1 Volume="+ Box1.calculateVolume());
     System.out.println("Box 2 Volume="+ Box2.calculateVolume());
    
     }

  }