/**
 * packageName : PACKAGE_NAME
 * fileName : A2
 * author : macbook
 * date : 2022/05/11
 * description : DI(의존성 주입) 사용해서 코딩하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         macbook          최초 생성
 */
public class A2 {
    // B 객체 멤버 변수로 등록
    B b;

    // DI : 생성자의 매개 변수로 B라는 객체를 전달하는 형태
    public A2(B b) {
        // 핵심 : B 클래스 기능이 변경되면 아래 코딩은 변경 하지 않아도 된다
        this.b = b; // DI 사용한 코딩
    }
}
