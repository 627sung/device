# 25일차

## db.select.Test08.java

`product` 계정의 `product` 테이블에서 다음 내용을 조회하여 출력

```
2020년에 생산된 제품의 가격 합계와 평균을 구하여 출력
```

## db.insert.Test08.java

`product` 계정에 있는 `product` 테이블에 상품을 등록하는 프로그램을 구현하려고 합니다.

단, DB와 관련된 작업들은 전부 다 `ProductDao`라는 클래스를 만들어서 진행하려고 합니다.

사용자에게 필요한 정보를 입력받고 `ProductDao`에 `regist`라는 이름의 메소드를 만드시고 등록이 처리되도록 구현

## db.select.Test11.java

`ProductDao`에 `getCount`라는 메소드를 만드시고 해당 기능을 이용하여 상품 개수를 구한 뒤 출력

## db.insert.Test09.java

미리 만들어둔 `Client` 테이블에 접근할 수 있도록 다음 Java Beans를 생성하세요

- ClientDto
- ClientDao

main에서 사용자에게 필요한 정보를 입력받아 `ClientDao`의 `regist` 메소드를 통해 등록을 수행

단, 등록 시 전달되는 데이터는 `ClientDto` 형태로 구성하세요



## db.select.Test13

`client` 테이블의 데이터를 번호순으로 조회하는 기능을 `getList`라는 이름으로 만들고 이를 이용하여 목록을 출력하세요

(가능하다면 정렬 방식을 지정해줄 수 있도록 응용해보세요)

## db.select.Test14

`client` 테이블의 데이터를 검색하는 기능을 `search`라는 이름으로 만들고 
사용자에게 검색어를 입력받아 **아이디**가 유사한 데이터들을 조회하도록 만든 뒤
이를 이용하여 검색 결과를 출력하세요 

(가능하다면 항목도 같이 입력받아서 처리하도록 해보세요. 
ex) client_id , 'h'를 입력하면 아이디에 h가 포함된 회원 조회 + 해당 항목으로 정렬까지)


























