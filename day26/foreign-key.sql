----------------------------------------------------------------
-- 외래키(Foreign key) : 외부와 연결되는 항목에 대한 제약조건
----------------------------------------------------------------
CREATE TABLE student(
student_no NUMBER PRIMARY KEY,
student_name varchar2(21) NOT NULL
);
CREATE TABLE score(
student NUMBER,
subject varchar2(30) NOT NULL,
grade char(2) NOT NULL
);

DELETE student;
INSERT INTO student VALUES(1001, '피카츄');
INSERT INTO score VALUES(1001, '수학의 이해', 'A');
INSERT INTO score values(1001, '컴퓨터 기초', 'A-');
INSERT INTO score values(1002, '수학의 이해', 'A');
SELECT * FROM score;
DELETE student WHERE student_no=1001;
COMMIT;

-- 외래키 부여를 위해서 테이블을 삭제
DROP TABLE student;
DROP TABLE score;

-- 외래키를 설정하여 테이블을 재생성
-- 주의 : 하위 테이블(score)이 상위 테이블(student)을 참조하는 항목을 가지고 있어야 한다
-- student와 score는 1:N 관계이다

-- 학생 테이블은 변화가 없다
CREATE TABLE student(
student_no NUMBER PRIMARY KEY,
student_name varchar2(21) NOT NULL
);

-- 성적 테이블은 학생번호를 저장할 때 반드시 student테이블의 student_no를 보고 넣도록 해야 한다
CREATE TABLE score(
student NOT NULL REFERENCES student(student_no),
-- student CONSTRAINT FK_SCORE_STUDENT REFERENCES student(student_no),
subject varchar2(30) NOT NULL,
grade char(2) NOT NULL
);

-- 외래키가 설정되었기 때문에 학생테이블에 없는 학생번호는 추가할 수 없다
-- 즉, 성적 정보를 저장할 때 학생 칸은 학생테이블에 데이터가 있는지를 먼저 확인한 후 추가를 진행
INSERT INTO student VALUES(1001, '피카츄');
INSERT INTO score VALUES(1001, '수학의 이해', 'A');
INSERT INTO score VALUES(1001, '컴퓨터의 이해', 'B');
INSERT INTO score VALUES(NULL, '컴퓨터 기초', 'B+');

-- 외래키를 설정하면 해결되는 문제도 있지만, 추가로 발생하는 문제도 있다.
SELECT * FROM student;
SELECT * FROM score;

-- 문제점(1) : 하위 항목이 있는 상위 테이블의 데이터는 삭제가 불가능하다
-- 해결책 : 외래키 생성 시 삭제와 관련된 조건을 추가한다!
--		ON DELETE SET NULL 또는 ON DELETE CASCADE
DELETE student WHERE student_no=1001;

-- 테이블에 외래키 조건을 설정하여 재생성
DROP TABLE student;
DROP TABLE score;

-- 학생 테이블은 변화가 없다
CREATE TABLE student(
student_no NUMBER PRIMARY KEY,
student_name varchar2(21) NOT NULL
);

-- 성적 테이블은 
-- 학생이 사라질 때 성적도 사라지게 만드려면 외래키에 ON DELETE CASCADE조건 추가
-- 학생이 사라질 때 성적의 학생번호만 사라지게 만드려면 외래키에 ON DELETE SET NULL조건 추가
CREATE TABLE score(
-- student NOT NULL REFERENCES student(student_no) ON DELETE CASCADE,
student REFERENCES student(student_no) ON DELETE SET NULL,
subject varchar2(30) NOT NULL,
grade char(2) NOT NULL
);

INSERT INTO student VALUES(1001, '피카츄');
INSERT INTO score VALUES(1001, '수학의 이해', 'A');
INSERT INTO score values(1001, '컴퓨터 기초', 'B-');

--학생을 지워본 뒤 과목이 어떻게 변해 있는지 확인
DELETE student WHERE student_no=1001;

SELECT * FROM student;
SELECT * FROM score;

----------------------------------------------------------------
-- ERD 보고 물리 테이블 구축
----------------------------------------------------------------
CREATE TABLE song(
song_no NUMBER PRIMARY KEY,
song_name varchar2(30) NOT NULL,
song_artist varchar2(60) NOT NULL,
song_album varchar2(60) NOT NULL,
song_duration NUMBER NOT NULL
);
CREATE TABLE member(
member_id varchar2(20) PRIMARY KEY,
member_pw varchar2(20) NOT NULL,
member_nick varchar2(30) NOT NULL UNIQUE,
member_rank varchar2(12) NOT NULL CHECK(member_rank IN ('관리자', '일반회원', 'VIP회원', '판매자', '골드회원'))
);
CREATE TABLE download(
song_no REFERENCES song(song_no) ON DELETE SET NULL,
member_id REFERENCES member(member_id) ON DELETE SET NULL,
download_time DATE DEFAULT sysdate NOT NULL
);
-- 이 구문에서 시간은 default 값의 적용을 받는다.
INSERT INTO download(song_no, member_id) values(?, ?);
-- 주의 : null을 추가하면 default 값의 적용을 받지 않는다.
INSERT INTO download values(?, ?, null);




