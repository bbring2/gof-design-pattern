package singleton;

public class SystemSpeaker {

    static private SystemSpeaker instance; //딱 하나만 가능하게끔.

    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if(instance == null) {
            instance = new SystemSpeaker(); //객체 초기화 는 겟 인스턴스 메서드안에서 해주어야한다.
            System.out.println("새로운 인스턴스 생성 완료");
        } else {
            System.out.println("이미 있는 인스턴스 생성 완료");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
