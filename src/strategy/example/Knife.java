package strategy.example;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼 공격 호출 완료");
    }
}
