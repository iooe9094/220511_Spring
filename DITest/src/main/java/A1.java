/**
 * packageName : PACKAGE_NAME
 * fileName : A1
 * author : macbook
 * date : 2022/05/11
 * description : 기존 코딩 방법을 위한 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         macbook          최초 생성
 */
public class A1 {
    // B 클래스 멤버 변수를 등록
    B b;

    // A1 기본 생성자
    // A1라는 생성자 안에서 B라는 객체를 생성
    // 의존성 매우 높음 (밀접한 관계, A와 B는 같이 생성)
    public A1() {
        // B클래스 객체 생성
        b = new B();
    }
}
