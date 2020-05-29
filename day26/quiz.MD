# 26일차

## db.update.Test03

Client의 비밀번호를 변경하는 프로그램을 구현(ClientDao를 이용...기능이름은 editPassword)


## db.quiz 패키지

목표 : 계정을 새로 만들어 `회원 관리 시스템`을 구축하는 것

```
계정 : c##kh
비밀번호 : c##kh
```

`member`라는 이름의 테이블을 다음의 형식으로 만드세요.
 
- 아이디 : member_id , 5~20자 영문소문자+숫자 
- 비밀번호 : member_pw , 8~16자 영문대소문자+숫자+특수문자
- 닉네임 : member_nick , 한글을 기준으로 8글자 이내
- 주소(우편번호, 기본주소, 상세주소)
	- 우편번호 : post, 최대 6자리
	- 기본주소 : base_addr, 한글 100자이내
	- 상세주소 : extra_addr, 한글 100자이내
- 생년월일 : member_birth , 날짜
- 전화번호 : member_phone , 휴대폰 번호 형식(-제외)
- 자기소개글 : member_intro , varchar2 최대값(4000)
- 권한 : member_auth , 일반, 관리자, VIP 중 택1
- 가입시각 : member_join , 날짜로 설정(현재시각)
- 최종 로그인 시각 : member_login , 날짜로 설정

테이블 생성 후 `MemberDao` , `MemberDto`를 만들어 다음 기능을 구현

MemberDao
- regist() : 회원가입 메소드
- login() : 로그인 메소드
- findId() : 아이디찾기 메소드 

1. 회원 가입 기능(Test01.java)
	- 사용자에게 필요한 정보(권한, 가입시각, 로그인시각 빼고 전부)를 입력받고 나머지는 자체적으로 구현하여 등록
2. 로그인 기능(Test02.java)
	- 사용자에게 아이디와 비밀번호를 입력받아 로그인이 가능한지 불가능한지 알려주면 된다.
3. 아이디 찾기 기능(Test03.java)
	- 사용자에게 닉네임과 전화번호를 입력받아서 해당하는 아이디를 찾은 뒤 출력(없으면 없다고 출력)











