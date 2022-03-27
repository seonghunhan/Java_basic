
public class Interfaceclass implements InterfaceA, InterfaceB {

    public Interfaceclass() {
        System.out.println("Interfaceclass-----");
    }

    @Override
    public void funA(){
        System.out.println("-----funA--");
    }

    @Override
    public void funB(){
        System.out.println("----fubB--");
    }
}
