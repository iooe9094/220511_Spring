package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

// Dao + Service => 웹개발 시 설계를 위한 이름(Naming Rule) 약속
// XXXService 역할 : 비즈니스(업무) 로직이 작성되어 있는 클래스
// XXXDao 활용 + Model(Member, RegisterRequest 클래스) 활용하여 업무 로직 코딩
@Component
public class MemberRegisterService {
    // Dao 멤버 변수로 등록 : Why? CRUD(Insert, Select, Update, Delete) 위해서
    @Autowired
    private MemberDao memberDao;

    // 기본 생성자 : Dao 객체 생성(외부에서 매개변수를 통해 생성 : DI(의존성 주입))
    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    // regist 메소드 : 회원 등록 서비스
    public Long regist(RegisterRequest req) {
        // 이메일(키값)을 가지고 검색하는 메소드를 호출
        // 반환값(return) : Member 객체가 반환
        Member member = memberDao.selectByEmail(req.getEmail());

        // 기존 회원이 있으면 : member의 값이 null이 아님
        if(member !=null) {
            // 에러를 발생시킴
            throw new DuplicateMemberException("dup email" + req.getEmail());
        }

        // member값이 null이면 회원이 없다는 것
        // member 생성자를 호출해서 객체를 생성
        Member newMember = new Member(
                req.getEmail(),req.getPassword(), req.getName(), LocalDateTime.now()
        );

        // 회원 등록 메소드를 호출
        memberDao.insert(newMember);
        return newMember.getId();
    }
}
