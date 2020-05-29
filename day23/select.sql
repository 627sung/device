SELECT * FROM product;

--이름을 조회
SELECT name FROM product;

--이름과 가격을 조회
SELECT name, price FROM product;

--전체 항목을 조회
SELECT NO, name, TYPE, price, made, expire FROM product;
SELECT * FROM product;

--제조일과 유통기한의 차이를 구하여 출력
SELECT name, expire - made FROM product;

-----------------------------------------------------------------
--조건 : 데이터를 필터링 하기 위한 논리식(숫자, 문자열, 논리)
-----------------------------------------------------------------

-- 숫자
-- [1] 가격이 2000원 이상인 상품을 조회
SELECT * FROM product;
SELECT * FROM product WHERE price >= 2000;

-- [2] 가격이 1000원 이상 2000원 이하인 상품을 조회
-- 조건이 여러 개 일 때 자바처럼 && , || 를 사용할 수 없고 and나 or을 이용해야 한다.
-- 구간을 조회하는 경우(?부터 ?까지)에는 between 이라는 연산을 지원해준다.
SELECT * FROM product WHERE price >= 1000 AND price <= 2000;
SELECT * FROM product WHERE price BETWEEN 1000 AND 2000;

-- [3] 가격이 1000원인 상품을 조회
-- 오라클 SQL 명령에서는 같다를 의미하는 기호가 = 이다.
SELECT * FROM product WHERE price = 1000;

-- [4] 가격이 1000원이 아닌 상품을 조회
SELECT * FROM product WHERE price != 1000;
SELECT * FROM product WHERE price <> 1000;

-- 문자(char, varchar2)
-- [1] 맛동산 상품 정보 조회
-- 주의 : 오라클은 데이터만 저장하기 때문에 자바처럼 참조형 같은것을 구분하지 않고 모두 = 로 비교
SELECT * FROM product WHERE name = '맛동산';

-- [2] 맛으로 시작하는 상품 정보 조회(자바에서의 startsWith)
-- 주의 : LIKE 를 사용하면 %를 이용하여 미지의 글자를 표현할 수 있다(대신 성능저하가 온다)
SELECT * FROM product WHERE name LIKE '맛%';

-- [3] 이름에 '이' 라는 글자가 들어간 상품을 조회
SELECT * FROM product WHERE name LIKE '%이%';

-- [4] 이름이 '슬'로 끝나는 상품을 조회
SELECT * FROM product WHERE name LIKE '%슬';

-- 주의 : 
-- like를 쓸 때 앞에 %가 오는 경우는 가급적 피해야 한다.
-- 오라클은 자체적으로 성능향상을 위해 index(색인)을 사용할 수 있는데..
-- 앞에 %가 있으면 index의 적용이 불가하므로 성능이 기하급수적으로 느려진다
-- 즉, '참%'는 써도 되지만 '%슬' 이나 '%이%'는 가급적 피해야 한다는 것!

-- 대체하여 사용할 수 있는 명령으로 instr() 이 있다.
-- instr(항목, 검색어) : 해당 단어가 몇번째 위치에 있는지를 찾아 숫자로 반환하는 명령(시작이 1)
SELECT name, instr(name, '이') FROM product;

-- 존재하는 항목만 검색하고 싶다면 0보다 큰 값을 위치로 가지는 데이터를 찾도록 하는것이 바람직!
SELECT * FROM product WHERE instr(name, '이') > 0;
-- SELECT * FROM product WHERE name LIKE '%이%';

-- 날짜(date) 조건
-- 주의 : 날짜는 계산이 된다(계산 결과는 "일 단위"로 나온다)
-- 주의 : 오라클에서는 현재 시각을 "sysdate" 라는 내장객체에 보관한다

-- [1] 유통기한이 60일 이내인 상품을 조회
--SELECT expire - made FROM product;
SELECT * FROM product WHERE expire - made <= 60;

-- [2] 제조일자가 2019년인 상품을 조회
-- 날짜 구간 : 2019-01-01 부터 2019-12-31
-- to_date() 명령을 사용하면 문자열을 형식에 맞는 날짜값으로 변경할 수 있다.
-- to_date(값, 형식) : 주어진 문자열값을 형식에 맞게 날짜로 변환
SELECT * FROM product 
WHERE 
	made >= to_date('2019-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
	AND made <= to_date('2019-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS');

SELECT * FROM product 
WHERE made 
	BETWEEN to_date('2019-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
	AND to_date('2019-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS');

-- [3] 유통기한이 현재로부터 30일 이내로 남은 상품을 조회
-- 데이터베이스에서 "현재"라고 하면 대신 사용할 수 있는 키워드로 "sysdate"가 있다.
SELECT * FROM product WHERE expire - sysdate > 0 AND expire - sysdate <= 30;
SELECT * FROM product WHERE expire - sysdate BETWEEN 0 AND 30;

-- [4] 2번 문제를 다른 명령을 이용하여 접근할 수 있다.
-- extract() : 날짜에서 원하는 값을 추출하는 명령
-- 사용법 : extract(원하는항목 from 컬럼)
-- 가능한 컬럼 : YEAR, MONTH, DAY, 등

SELECT made FROM product;
SELECT extract(YEAR FROM made) FROM product;
SELECT * FROM product WHERE extract(YEAR FROM made) = 2019;

-- 정렬 : 필터링된 데이터를 원하는 방식으로 나열
-- 주의 : 반드시 조건과 같은 필터링 명령보다는 뒤에 나와야 한다.
-- 어짜피 정렬은 오름차순(ascending...줄여서 asc) 아니면 내림차순(descending...줄여서 desc)

-- [1] 모든 데이터를 가격이 비싼 순서로 정렬
SELECT * FROM product;
SELECT * FROM product ORDER BY price DESC;

-- [2] 모든 데이터를 최근에 제조한 것부터 정렬하여 조회
-- 항목 : 제조일(made) , 정렬방식 : 내림차순
SELECT * FROM product ORDER BY made DESC;

-- [3] 모든 데이터를 유통기한이 짧은 것부터 정렬하여 조회
-- 항목 : expire - made , 정렬방식 : 오름차순
-- 팁 : ASC는 안써도 됨(DESC는 반드시 써야함)
SELECT * FROM product ORDER BY expire - made ASC;
SELECT * FROM product ORDER BY expire - made;

-- [4] 모든 데이터를 유형별로 정렬
-- 주의 : 중복이 된다면 이후의 정렬 방식도 알려줘야 한다.
SELECT * FROM product ORDER BY TYPE ASC;
SELECT * FROM product ORDER BY TYPE ASC, NO ASC;

-- [5] 제품명을 가나다순으로 정렬
-- 항목 : 제품명(name) , 정렬방식 : 오름차순(ASC)
SELECT * FROM product ORDER BY name ASC;
SELECT * FROM product ORDER BY name;

-- [6] 2020년에 제조된 제품을 제조일이 빠른 순서로 조회
SELECT * FROM product 
WHERE EXTRACT(YEAR FROM made) = 2020
ORDER BY made, no;

----------------------------------------------------------
-- 통계 기능 : 제공된 명령(함수)를 이용하여 계산하도록 되어 있다.
-- [주의] 결과는 반드시 한 개가 나온다(그룹 함수)
----------------------------------------------------------

-- [1] 등록된 상품 개수를 출력 : count(항목)
-- [2] 가장 비싼 상품의 가격 : max(항목)
-- [3] 가장 저렴한 상품의 가격 : min(항목)
-- [4] 모든 상품 가격의 합계 : sum(항목)
-- [5] 상품 1개 가격의 평균 : avg(항목)

-- 데이터가 보존되는 함수 : 원하는 항목을 붙여서 출력이 가능하다
-- SELECT name, extract(YEAR FROM made) FROM product;

-- 그룹 함수는 결과가 묶여서 하나로 나오기 때문에 테이블의 항목을 붙여서 출력할 수 없다.
-- SELECT count(no) FROM product;
SELECT count(*) FROM product;
SELECT max(price) FROM product;
SELECT min(price) FROM product;
SELECT sum(price) FROM product;
SELECT avg(price) FROM product;

-- 응용
-- [1] 유통기한이 180일 이내인 제품의 개수를 구하여 출력
SELECT * FROM product WHERE expire - made <= 180;
SELECT count(*) FROM product WHERE expire - made <= 180;

-- [2] 판매가가 제품 평균 이상인 제품 목록을 출력
-- 안되지만 배운 것을 활용하여 만든 가장 현실적인 구문(조건절에는 그룹 함수를 쓸 수 없다)
SELECT avg(price) FROM product;
SELECT * FROM product WHERE price >= 1510;

-- 안되는 이유 : 그룹 함수는 전체에 대한 계산을 수행하는데 조건절에 있으면 데이터 개수만큼 실행된다
-- -> 실행 회수가 비정상적으로 늘어나서 성능에 치명적인 영향을 주기 때문에 금지되었음
-- 해결책은 "서브 쿼리"라는 것을 이용하여 명령을 순차적으로 실행하게 만드는 것이다.
SELECT * FROM product WHERE price >= avg(price);

-- 서브 쿼리 사용
SELECT * FROM product WHERE price >= (SELECT avg(price) FROM product);

-- 서브 쿼리 응용 : 가장 비싼 상품의 정보를 조회하여 출력
-- SELECT * FROM product WHERE price = max(price);

-- [1] 우선 가장 비싼 상품의 금액을 구한다
-- [2] 1번에서 구한 값에 해당하는 상품의 정보를 조회한다
SELECT max(price) FROM product;
SELECT * FROM product WHERE price = 3000;

SELECT * FROM product WHERE price = (
	SELECT max(price) FROM product
);



