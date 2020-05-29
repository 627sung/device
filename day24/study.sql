-- student 테이블 생성
CREATE TABLE student(
student_no NUMBER NOT NULL UNIQUE,
student_name varchar2(21) NOT NULL,
student_score NUMBER CHECK(student_score BETWEEN 0 AND 100),
student_create DATE NOT NULL
);
CREATE SEQUENCE student_seq nocache;

INSERT INTO student values(student_seq.nextval, '홍길동', 50, sysdate);
-- INSERT INTO student values(student_seq.nextval, 홍길동, 50, sysdate);

SELECT * FROM student;

INSERT INTO student values(student_seq.nextval, ''||(select student_name from student where student_no=1)||'', 
100, 
sysdate);

----------------------------------------------------------------
-- hotel 생성
----------------------------------------------------------------
-- 번호 : number , 이름 : varchar2 , 지역 : varchar2 , 평점 : number(2, 1) - 전체 2자리 소수점 1자리

-- PRIMARY KEY : 대표항목(기본키)이라는 뜻을 가지며, NOT NULL + UNIQUE + 속도향상까지 적용
CREATE TABLE hotel(
--hotel_code NUMBER NOT NULL UNIQUE,
hotel_code NUMBER PRIMARY KEY,
hotel_name varchar2(60) NOT NULL,
hotel_region varchar2(15) NOT NULL,
hotel_rate number(2,1) NOT NULL
);
CREATE SEQUENCE hotel_seq nocache;

INSERT INTO hotel values(hotel_seq.nextval, '네스트 호텔', '서울', 4.2);
INSERT INTO hotel values(hotel_seq.nextval, '쉐라톤 서울 디큐브시티', '서울', 4.3);
INSERT INTO hotel values(hotel_seq.nextval, '오라카이 송도파크 호텔', '송도', 4.1);

SELECT * FROM hotel;

-------------------------------------------------------------------
-- client 테이블 및 시퀀스 생성
-------------------------------------------------------------------
CREATE TABLE client(
client_no NUMBER PRIMARY KEY,
client_id varchar2(20) NOT NULL UNIQUE,
--client_id varchar2(20) NOT NULL UNIQUE CHECK(LENGTH(client_id) BETWEEN 5 AND 20),
--client_id varchar2(20) NOT NULL UNIQUE CHECK(regexp_like(client_id, '^[a-zA-Z0-9]{5,20}$')),
client_pw varchar2(16) NOT NULL,
client_auth varchar2(12) NOT NULL CHECK(client_auth IN ('운영자', '일반회원', '특별회원')),
client_join DATE NOT NULL,
client_point NUMBER NOT NULL CHECK(client_point >= 0)
);
CREATE SEQUENCE client_seq nocache;

SELECT * FROM client;


