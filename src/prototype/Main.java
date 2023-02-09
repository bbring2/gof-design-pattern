package prototype;

import prototype.deep_shwallow.Age;
import prototype.deep_shwallow.Cat;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(1995, 28));

        Cat bibi = navi.copy(); //low-level copy > 주소값을 가져감
        bibi.setName("bibi");
        bibi.getAge().setYear(1999);
        bibi.getAge().setValue(5);

        System.out.println(navi.getName());
        System.out.println(bibi.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(bibi.getAge().getYear());

        //primitive 타입은 깊은복사를 지원해주지 않음.
    }
}
