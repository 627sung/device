package db.test;
import java.lang.reflect.Member;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test02 {
public static void main(String[] args) throws Exception {
	
	//로그인 프로그램 
	
	//준비 :아이디 비밀번호-->회원정보 (MemberDto)
	
	
	MemberDto mdto = new MemberDto();
	mdto.setMember_id("testuser");
	mdto.setMember_pw("test1234");

	
	MemberDao mdao =new MemberDao();
	
	boolean success =mdao.login2(mdto);
	
	if(success) {
		System.out.println("로그인성공");
	}else {
		System.out.println( "로그인실패");
	}

	
	
	
	
	
}
	
	
}
