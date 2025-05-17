class Box{
     double length,width,height;

     
     Box(double length,double width,double height){
     this .length=length;
    this. width=width;
     this .height=height;
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

public class thisExample{
   public static void main(String[]args){
     
     Box Box1=new Box(1,2,3);
     Box1.displayDetails();
   

         
     }

  }

