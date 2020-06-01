package db.test;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
		
		MemberDto mdto = new 	MemberDto();
		
		mdto.setMember_id("testuser");
		mdto.setMember_pw("test1234");
		mdto.setMember_nick("테스트맨");
		 mdto.setMember_birth("1999-12-31");
		 mdto.setMember_phone("01042341234");
		
		
			MemberDao mdao = new MemberDao();
			mdao.regist(mdto);
			System.out.println("가입완료 ㅊㅊㅊㅊ");
		
	}
}
