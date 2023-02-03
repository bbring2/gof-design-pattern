package factory_method.concrete;

import factory_method.framework.Item;
import factory_method.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("db에서 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 물약을 새로 생성했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
