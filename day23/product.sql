--테이블 생성

CREATE TABLE product(
no number,
name varchar2(60),
type varchar2(15),
price number,
made date,
expire date
);
CREATE SEQUENCE product_seq nocache;

INSERT INTO product values(product_seq.nextval, 
'스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
INSERT INTO product values(product_seq.nextval, 
'마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
INSERT INTO product values(product_seq.nextval, 
'초코파이', '과자', 3000, '2020-02-01', '2020-10-20');
INSERT INTO product values(product_seq.nextval, 
'맛동산', '과자', 2200, '2020-01-05', '2020-04-05');
INSERT INTO product values(product_seq.nextval, 
'참이슬', '주류', 1000, '2020-01-01', '2020-07-01');
INSERT INTO product values(product_seq.nextval, 
'처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
INSERT INTO product values(product_seq.nextval, 
'바나나킥', '과자', 1500, '2020-05-03', '2020-06-01');
INSERT INTO product values(product_seq.nextval, 
'빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
INSERT INTO product values(product_seq.nextval, 
'멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
INSERT INTO product values(product_seq.nextval, 
'오레오', '과자', 2100, '2019-06-01', '2020-06-01');

SELECT * FROM product;
