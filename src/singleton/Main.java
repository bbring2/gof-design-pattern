package singleton;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        //5,5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(34234);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        System.out.println(speaker1.toString());
        System.out.println(speaker2.toString());

        //동일한 인스턴스임을 확인함.
    }
}
