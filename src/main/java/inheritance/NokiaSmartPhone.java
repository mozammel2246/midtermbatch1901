package inheritance;

public class NokiaSmartPhone extends Nokia1100 {
    String nameOfTheClass = "Nokia5510";
    String v = super.s;
    public void addColorFullDisplay(){
        System.out.println("This is a colorfull display");
    }
    public static void playGames(){
        System.out.println("Now I can play games as well");
    }
    public static void main(String[] args) {
        NokiaSmartPhone obj = new NokiaSmartPhone();
        Nokia1100 nokia1100 = new Nokia1100();

        System.out.println(obj.v);

        String myphone = nokia1100.nameOfTheClass;
        System.out.println(myphone);
        nokia1100.sendText();
        nokia1100.contactList();
        nokia1100.makeCall();

        System.out.println(obj.nameOfTheClass);
        obj.addColorFullDisplay();
        playGames();

    }
}
