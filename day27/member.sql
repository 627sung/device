
CREATE TABLE MEMBER(
member_id varchar2(20) PRIMARY key,
member_pw varchar2(16) NOT null,
member_nick varchar2(24)NOT NULL unique,
post char(6),
base_addr varchar2(300),
extra_addr varchar2(300),
member_birth DATE NOT null,
member_phone char(11) NOT null,
member_intro varchar2(4000),
member_auth varchar2(9) NOT NULL CHECK(member_auth in('일반','관리자','VIP') ),
member_join DATE DEFAULT sysdate NOT null, 
member_login DATE   
);

SELECT * FROM MEMBER;




