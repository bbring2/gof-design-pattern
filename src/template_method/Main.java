package template_method;

public class Main {
    public static void main(String[] args) {
        GameConnectionHelper helper = new GameConnectionHelperImpl();
        helper.requestConnection("id와 pw의 접속 정보 입력하기");
    }
}
