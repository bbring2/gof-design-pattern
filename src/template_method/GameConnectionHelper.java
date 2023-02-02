package template_method;

public abstract class GameConnectionHelper {

    protected abstract String doSecurity(String str);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public String requestConnection(String str) {
        //보안 작업 필요 - 암호화 된 문자열을 복호화 한다.
        String afterSecurity = doSecurity(str);
        //보안 작업 이후 아이디와 암호를 할당한다.

        String id = "id";
        String password = "pw";

        //인증 과정
        authentication(id, password);

        String userName = "";
        //권한 과정
        authorization(userName);

        String info = "";

        return connection(info);
    }
}
