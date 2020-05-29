------------------------------------------------------------
-- 수정(Update) : 존재하는 데이터를 변경하는 것. 왠만하면 조건을 사용할 것을 권장
------------------------------------------------------------
SELECT * FROM product;

-- [1] 상품의 가격을 10000원으로 변경(전부다) - 실제로 쓰기 어려움(조건이 있어야 함)
UPDATE product SET price=10000;

-- [2] 5월달에 만든 상품의 가격을 5000원으로 변경
UPDATE product SET price=5000 WHERE EXTRACT(MONTH FROM made) = 5;

-- [3] 유통기한이 지난 상품의 가격을 0원으로 수정 
UPDATE product SET price = 0 WHERE expire < sysdate;

-- [4] 유통기한이 30일 이내로 남은 상품의 가격을 2000원 할인
-- UPDATE product SET price -= 2000;--안됨(자바스타일)
UPDATE product SET price = price - 2000 WHERE expire - sysdate BETWEEN 1 AND 30;
UPDATE product SET price = price - 2000 WHERE expire - sysdate >= 1 AND expire - sysdate <= 30;

-- [5] 작년에 제조한 상품들의 가격을 10% 할인
-- to_date() 와 between 사용 또는 extract() 사용

-- UPDATE product SET price *= 0.9;--안됨(자바스타일)
UPDATE product SET price = price * 90 / 100;

UPDATE product SET price = price * 0.9 WHERE EXTRACT(YEAR FROM made) = 2019;

UPDATE product SET price = price * 0.9 
WHERE made BETWEEN 
	to_date('20190101000000', 'YYYYMMDDHH24MISS') 
	AND to_date('20191231235959', 'YYYYMMDDHH24MISS');