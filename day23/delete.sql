------------------------------------------------------------------
-- 삭제(Delete) : 존재하는 데이터를 제거하는 것
------------------------------------------------------------------
SELECT * FROM PRODUCT p;

-- [1] 유통기한이 지난 상품의 정보를 삭제
DELETE product WHERE expire < sysdate;

-- [2] 상품번호가 5번인 상품을 삭제
DELETE product WHERE NO = 5;