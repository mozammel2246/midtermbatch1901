package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {

    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */

    String nameOfTheClass = "PreNokia1100";
    public void sendText(){
        System.out.println("This will send my text");
    }
    public abstract void makeCall();
    public void contactList(){
        System.out.println("This will show contact list");
    }
    public abstract void addColorFullDisplay();



}
