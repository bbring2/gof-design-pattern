package factory_method.concrete;

import factory_method.framework.Item;

public class HpPotion extends Item {

    @Override
    public void use() {
        System.out.println("회복 물약이 생성되었습니다. ");
    }
}
