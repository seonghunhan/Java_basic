public class ObjectClass {

    public int x;  // 전역변수
    public int y;

    public ObjectClass(String s, int[] iArr){

        System.out.println("-------ObjectClass()---");

        System.out.println("s----->"+s);
        System.out.println("iArr----->"+iArr);
    }

    public ObjectClass(int x, int y){

        this.x = x;    //여기서 this를 붙이고 x를 하면 위에서 선언된 전역변수를 가르킨다
        this.y = y;    //오른쪽 x는 여기 클래스에서 잠깐 사용하는 지역변수


    }

    public void getInfo() {

        System.out.println("x --->" + x);
        System.out.println("y --->" + y);
    }

}
