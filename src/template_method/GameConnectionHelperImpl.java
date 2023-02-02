package template_method;

public class GameConnectionHelperImpl extends GameConnectionHelper {
    @Override
    protected String doSecurity(String str) {
        System.out.println("---디코드 작업---");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("---사용자 인증과정---");
        return false;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("---사용자 권한체크---");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("---연결을 시작합니다---");
        return null;
    }
}
