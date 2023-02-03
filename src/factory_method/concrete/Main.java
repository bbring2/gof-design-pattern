package factory_method.concrete;

import factory_method.framework.Item;
import factory_method.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();

        //내부 구현체들의 로그 생성이라든지 메서드에 접근되게끔 하면 안됨.

        item.use();

        creator = new MpCreator();
        item = creator.create();

        item.use();
    }
}
