package spring;

/**
 * packageName : spring
 * fileName : RegisterRequest
 * author : macbook
 * date : 2022/05/11
 * description : 회원 등록 요청 처리를 위한 클래스
 *               기능1 : 패스워드가 맞는지 확인 (password == confirmPassword)
 *               기능2 : 정보 저장 및 검색 - getter / setter
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         macbook          최초 생성
 */
public class RegisterRequest {
    private String email; // 회원 이메일
    private String password; // 회원 패스워드
    private String name; // 회원 이름
    private String confirmPassword; // 패스워드 확인 변수

    // 패스워드가 맞으면 true : password.equals(confirmPassword) == true
    // 틀리면 false
    public boolean isPasswordEqualToConfiremPassword() {
        return password.equals(confirmPassword);
    }

    // getter & setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
