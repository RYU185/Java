use testdb;

-- 쿼리1_JOIN QUERY
/* join이란, 2개 이상의 테이블을 연결하여 데이터를 검색하는 방법
<Join의 종류>
cross join 크로스조인
inner join 이너조인
outer join 아우터조인
self join 셀프조인
*/

-- cross join
-- 한쪽 테이블의 각 행마다 다른쪽 테이블의 모든 행이 한번씩 매칭되는 join
-- 양쪽의 데이터의 경우의 수를 모두 매칭시킨다.
-- m * n개의 경우의 수가 발생하므로 속도의 저하가 발생할 수 있다.
-- 따라서 where절로의 필터링이 권장됨
select 이름, 부서.부서번호 , 부서명
from 사원 cross join 부서
-- 부서번호 컬럼은 사원테이블, 부서테이블 양쪽에 모두 존재하므로 명시적으로 테이블이름.컬럼명의 형태가 필요하다
where 이름 = '배재용';

-- inner join 
-- 교집합. 각 테이블에서 조건에 일치하는 데이터만 join
-- on이라는 문법요소로 join의 기준(=공통된 컬럼)을 지정해야함. 조건에 만족하지 않는 데이터는 배제함.
-- 명시적으로 inner join으로 사용하나 단순히 join만 입력해도 inner join으로 판단함.
-- 
select 사원번호, 이름, 직위, 부서.부서번호, 부서명
from 사원 inner join 부서
on 사원.부서번호 = 부서.부서번호 -- 사원테이블의 FK, 부서테이블의 PK
where 이름 = '이소미';

-- 고객회사들이 주문한 주문건수를 많은 순서대로 출력
-- 요청) 고객번호, 담당자명, 고객회사명, 주문건수
select 고객.고객번호, 담당자명, 고객회사명, count(*)as 주문건수
from 고객 join 주문
on 고객.고객번호 = 주문.고객번호 
group by 고객번호, 담당자명, 고객회사명
order by 주문건수 desc;
-- pk primary key 데이터(하나의 row)를 대표하는 유일무이한 키워드
-- foriegn key 외래key

-- 요청) 주문번호, 제품명, 주문수량, 단가
select 주문번호, 제품명, 주문수량, 주문세부.단가
from 주문세부 join 제품
on 주문세부.제품번호 = 제품.제품번호 
order by 주문번호;

-- 요청) 고객번호, 담당자명, 고객회사명, 주문금액합
-- 3개의 테이블간의 join이 필요함
-- 먼저 고객테이블과 주문테이블간의 고객번호를 기준으로 join 후, 주문세부테이블과 주문번호를 기준으로 join 수행.
select 고객.고객번호, 담당자명, 고객회사명, sum(주문수량*단가)as 주문금액합
from 고객 join 주문
on 고객.고객번호 = 주문.고객번호
join 주문세부
on 주문.주문번호 = 주문세부.주문번호 
group by 고객.고객번호, 담당자명, 고객회사명
order by 주문금액합 desc;

-- inner join / on 절을 명시적으로 선언하는 형태의 쿼리를 ANSI 스타일이라고 부른다
-- ANSI (American National Standards Institute) 미국국가표준협회
-- ANSI표준과 다른 방식으로 쿼리문을 작성하는 스타일을 non-ANSI 스타일로 부름

-- non ANSI 스타일
-- join / on 대신 from, where에서 이용하는 방법
-- ANSI 스타일이 가독성면에서 더 훌륭하므로 ANSI 스타일을 일반적으로 추천함
select 고객.고객번호, 담당자명, 고객회사명, sum(주문수량*단가)as 주문금액합
from 고객, 주문, 주문세부
where 고객.고객번호 = 주문.고객번호 and 주문.주문번호 = 주문세부.주문번호 
group by 고객.고객번호, 담당자명, 고객회사명
order by 주문금액합 desc;

/* join 쿼리에는 두가지 종류가 존재한다
join조건에 사용되는 연산자에 따라 구분
Equi Join : = 등호
Non-Equi Join : <, <=, >, >=, <> 등호 이외의 연산자 (등호를 사용할 수 없는 테이블간의 관계에 사용)
위의 ANSI스타일이 Equi join
*/


-- Non-Equi Join
-- '굿모닝서울'의 마일리지 등급을 조회
select 고객번호, 고객회사명, 담당자명, 마일리지, 등급명
from 고객 join 마일리지등급
on 고객.마일리지 >= 마일리지등급.하한마일리지 
and 고객.마일리지 <= 마일리지등급.상한마일리지

-- 주문세부 테이블의 단가가 제품 테이블의 단가보다 큰 주문을 조회 
select 주문번호, 제품명, 주문세부.단가 as 주문단가, 제품.단가 as 제품단가
from 주문세부 join 제품
on 주문세부.단가 > 제품.단가;




