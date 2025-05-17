class Box{
     double length,width,height;

     
     Box(double l,double w,double h){
     length=l;
     width=w;
     height=h;
     }
      
     double calculateVolume()
      {
      double volume;
      volume = length*width*height;
      return volume;      
       }
      double calculateSA(){
  	double SA;
	SA = 2*(length*width + width*height + height*length);
        return SA;       
      }

    void displayDetails(){
        System.out.println("Box Dimensions:" + length + "x" + width + "x" + height); 
        System.out.println("Volume:"+calculateVolume());
        System.out.println("Surface Area:"+calculateSA());

      }
   }

public class Boxexample{
   public static void main(String[]args){
     
     Box Box1=new Box(1,2,3);
     Box Box2=new Box(3,4,6);

     Box1.displayDetails();
     Box2.displayDetails();
     System.out.println(Box1);
    
     }

  }

