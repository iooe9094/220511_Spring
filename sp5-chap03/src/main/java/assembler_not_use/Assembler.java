package assembler_not_use;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

/**
 * packageName : assembler
 * fileName : Assembler
 * author : init
 * date : 2022/05/11
 * description : 정의된 클래스를 생성해서 조립하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         init          최초 생성
 */
public class Assembler {
    //    객체 생성을 위한 멤버 변수 정의
    private MemberDao memberDao; // CRUD Dao 클래스
    private MemberRegisterService reqSvc; // 회원등록 Service 클래스
    private ChangePasswordService pwdSvc; // 패스워드 변경 password 클래스

    //    기본생성자
    //    다른 클래스들을 모두 생성함하고 조립함
    public Assembler() {
//        외부에서 memberDao 객체를 생성
        memberDao = new MemberDao();
//        매개변수 있는 생성자 ( 다른 클래스 객체를 전달 ) : 생성자 DI
        reqSvc = new MemberRegisterService(memberDao);
//        매개변수가 있는 setter ( 다른 클래스 객체를 전달 ) : setter DI
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao); // setter DI
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getMemberRegisterService() {
        return reqSvc;
    }

    public ChangePasswordService getChangePasswordService() {
        return pwdSvc;
    }
}
