/**
 * packageName : PACKAGE_NAME
 * fileName : ExeTimeCalculator
 * author : macbook
 * date : 2022/05/11
 * description : 팩토리얼 측정할 때 시간 (나노시간 측정), 공통 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         macbook          최초 생성
 */
public class ExeTimeCalculator implements Calculator{
    private Calculator delegate; // 인터페이스

    // 생성자의 매개변수를 통해 전달
    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {

        // 1) 시작 나노시간 측정
        long start = System.nanoTime(); // 나노시간 측정
        // 팩토리얼 실행
        long result = delegate.factorial(num);
        // 2) 실행 후 시간 : 나노시간 측정
        long end = System.nanoTime();

        // 실행시간 출력
        System.out.println("(공통함수)factorial 실행 시간 :" + (end - start));
        return 0;
    }
}
