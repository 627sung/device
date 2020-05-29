-- 1일차 SQL 명령

-- 관리자 로그인
conn system/oracle;

--이 코드는 클래식 방식의 오라클 명령문을 사용하겠다는 뜻
alter session set "_ORACLE_SCRIPT"=true;

-- 현재 사용자 확인
show user;

-- 사용자 생성
create user test identified by test;

-- 사용자 비밀번호 변경
-- 주의 : 비밀번호는 숫자로 시작할 수 없음
alter user test identified by test1234;

-- 권한 부여
-- connect : 연결 권한
-- resource : 자원 관리 권한
-- unlimited tablespace : 테이블 이용 권한(11g에선 필요없음)
grant connect, resource, unlimited tablespace to test;

-- 권한 회수
revoke connect to test;

-- 사용자 삭제
drop user test;



-- kh 로 로그인한 후의 코드

-- 테이블 관리
-- 테이블이란 표의 형태를 가지는 데이터 저장 도구이다

create table checklist(
no number(2),
name varchar2(21)
);

select * from tab;
describe checklist;
desc checklist;

create table product(
serial number(8),
name varchar2(36),
price number(7),
receive date,
expire date
);

select * from product;

--테이블 이름만 적으면 해당하는 모든 칸에 데이터를 넣겠다는 뜻이다
insert into product values(
10000001, '뻥이요', 1200, '2020-05-22', '2021-05-22');
insert into product values(
10000002, '빗자루', 3500, '2020-05-22', null);
--테이블 이름과 함께 항목을 적어준다면 해당하는 항목에만 데이터를 넣겠다는 뜻
insert into product(serial, name, price, receive) values(
10000003, '젓가락', 900, '2020-05-21');


