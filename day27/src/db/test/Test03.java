package db.test;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		
		
		//준비 :아이디 비밀번호-->회원정보 (MemberDto)
		
		
		MemberDto mdto = new MemberDto();
	
		mdto.setMember_nick("테스트맨");
		mdto.setMember_birth("1999-12-31");
		
		MemberDao mdao = new MemberDao();
		String id =mdao.findId(mdto);

		
		
		if(id == null ) {
			System.out.println( "찾으시는 정보에 해당하는 아이디가 없어요");
		}else {
			System.out.println("찾는 아이디는 "+id+" 입니다");
		}
		
	}
	
	
	
}
