package factory_method.concrete;

import factory_method.framework.Item;

import java.util.Date;

public class MpPotion extends Item {

    @Override
    public void use() {
        System.out.println("마력 물약이 생성되었습니다");
    }
}
