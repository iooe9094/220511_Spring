package spring;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// XXXDao 역할 : 데이터베이스(DB)와 연결해서 CRUD(Insert, Select, Update, Delete) 위한 클래스
// DB 역할을 대신하는 자료구조: HashMap, (ArrayList, LinkedList)
// HashMap : 부모 Map (키, 값) 자료 구조
// 배열 vs 맵 차이점 : 배열 arr[0] = "a", 해쉬맵 arr[키] = "a"
@Component
public class MemberDao {
    private static long nextId = 0;
    // 다형성
    private Map<String, Member> map = new HashMap<>();

    // 해쉬맵에 자료가 무엇이 있는지 확인하는 메소드 (Select)
    // 기능 : email을 검색하는 메소드
    public Member selectByEmail(String email) {
        return map.get(email);
    }

    // 해쉬맵에 자료를 생성하는 메소드 (Insert)
    // 회원정보를 해쉬맵에 저장하는 메소드 (id + 1 증가시켜서)
    public void insert(Member member) {
        // id 1 증가시키는 로직 (id 중복 방지)
        member.setId(++nextId);
        // 해쉬맵에 회원정보 저장 (키, 값) =
        map.put(member.getEmail(), member);
    }

    // 해쉬맵에 자료를 수정하는 메소드 (Update)
    public void update(Member member) {
        map.put(member.getEmail(), member);
    }
}
