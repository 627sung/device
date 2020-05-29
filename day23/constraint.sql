---------------------------------------------------------------
-- 테이블 제약조건 : 자바의 은닉화처럼 저장될 데이터의 조건을 설정하는 것
---------------------------------------------------------------

-- product 테이블에 이상 데이터를 추가
INSERT INTO product values(NULL, NULL, NULL, NULL, NULL, null);
INSERT INTO product values(20, '새우깡', '과자', 1700, '2020-03-05', NULL);
INSERT INTO product values(20, '새우깡', '과자', 1700, '2020-03-05', NULL);
INSERT INTO product values(25, '피자빵', '스낵', 1700, '2020-03-05', NULL);
INSERT INTO product values(30, '새우깡', '과자', -2000, '2020-03-05', NULL);

SELECT * FROM product;

-- 기존 테이블을 삭제하고 조건을 부여하여 새로이 생성
-- NOT NULL : NULL은 추가가 불가능하다(필수항목)
-- UNIQUE : 중복 데이터의 추가가 불가능하다(식별자)
-- CHECK : 내가 원하는 값만 추가되도록 범위를 설정
DROP TABLE product;
CREATE TABLE product(
no NUMBER NOT NULL UNIQUE,
name varchar2(60) NOT NULL,
type varchar2(15) NOT NULL CHECK(type IN ('아이스크림', '사탕', '과자', '주류')),
price NUMBER CHECK(price >= 0),
made DATE NOT NULL,
expire DATE
);


