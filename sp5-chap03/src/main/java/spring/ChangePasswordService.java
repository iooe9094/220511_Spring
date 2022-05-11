package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// XXXService : 패스워드를 변경하는 서비스
// Service : 비즈니스(업무) 로직을 처리하는 클래스
// Dao + Model (Member, RegisterMember 클래스) 활용해서 업무 로직 코딩
@Component
public class ChangePasswordService {
    // Dao 멤버 변수로 등록 : Why? CRUD(Insert, Select, Update, Delete) 위해서

    // 스프링에 매개 변수를 이용해서 객체를 전달하여 생성 : DI
    // @Autowired : DI 코딩 부분을 자동으로 생성해 준다
    @Autowired
    private MemberDao memberDao;

    // changePassword 메소드 : 패스워드를 변경하는 서비스
    public void changePassword(String email, String oldPwd, String newPwd) {
        // selectByEmail 메소드 : 이메일로 회원 정보를 검색
        // 회원 정보가 있으면 member 값이 null이 아님
        // 회원 정보가 없으면 member 값이 null이 됨
        Member member = memberDao.selectByEmail(email);
        // member가 null이면 회원 정보가 없는 것
        // 패스워드를 변경할 수 없으므로 에러를 발생시키고 메소드를 빠져나옴
        if(member == null) {
            throw new MemberNotFoundException();
        }

        // 에러가 없으면(member가 null이 아니면) 회원정보가 있으므로
        // 패스워드 변경 서비스 실 (구패스워드 -> 신패스워드 변경)
        member.changePassword(oldPwd, newPwd);

        memberDao.update(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

}
