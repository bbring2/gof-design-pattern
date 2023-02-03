package factory_method.framework;

public abstract class ItemCreator {

    public Item create() {
        Item item;

        //step 1
        requestItemsInfo();
        //step 2
        item = createItem();
        //step 3
        createItemLog();

        return item;
    }

    //아이템 생성전에 db에서 아이템 정보 요청하기
    abstract protected void requestItemsInfo();
    //아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 db에 아이템 생성
    abstract protected void createItemLog();
    //아이템 생성하는 알고리즘
    abstract protected Item createItem();
}
