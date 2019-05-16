package inheritance;

public class Nokia1100 extends PreNokia1100 {


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
    String nameOfTheClass = "Nokia1100";
   String s = super.nameOfTheClass;

   public Nokia1100(){

   }

   int x;
   public Nokia1100(int x){
      this.x = x;
   }
   public void addPhotoGallery(){
      System.out.println("This will add photoes in photo gallery");
   }
   public void addColorFullDisplay(){}
   public void makeCall(){
      System.out.println("This will make call");
   }

}
