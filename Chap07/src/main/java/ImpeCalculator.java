/**
 * packageName : PACKAGE_NAME
 * fileName : ImpeCalculator
 * author : macbook
 * date : 2022/05/11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         macbook          최초 생성
 */
public class ImpeCalculator implements Calculator{

    @Override
    public long factorial(long num) {
        // 팩토리얼 결과를 저장할 변수
        // 팩토리얼 : 지정된 숫자만큼 계속 곱셈을 하는 것

        // 1. 개발자 팩토리얼 계산에 필요한 실행 시간을 측정하고자 함
        // 2. 실행 전 미리 시간 계산 : a
        // 3. 실행 종료 후 시간을 측정 : b
        // 4. b - a = 실행 시간

//         2) 실행 전 시간 측정
//        long start = System.currentTimeMillis(); // 밀리세컨즈 계산

        // 팩토리얼 결과를 저장할 변수
        long result = 1;

        // 단축키(fori) - fori 하면 반복문 자동으로 세팅
        // 매개변수 num까지 반복해서 곱셈
        for (int i = 1; i <= num; i++) {
            // 누적 곱
            result *= i;
        }

        // 3) 실행 후 종료 시간 측정
//        long end = System.currentTimeMillis(); // 밀리초(ms)

//        System.out.println("ImpeCalculator: 팩토리얼 계산 실행 시간 :" + (end-start));
        // 결과 result 반환
        return result;
    }
}
