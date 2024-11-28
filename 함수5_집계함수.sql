use testdb;

-- 집계함수
-- low별로 계산하는 숫자함수와는 다르게 한줄로 집계하여 결과값을 산출함

-- count 데이터 갯수를 세는 함수 (null은 세지않음)
select count(*), 
		count(고객번호), 
		count(도시),
		count(지역)
from 고객;

-- sum 합계
-- avg 평균
-- min 최솟값
-- max 최댓값
select sum(마일리지), truncate(avg(마일리지),0), min(마일리지), max(마일리지)
from 고객;

-- group by 그룹별로 묶어주는 명령어
select 도시, count(*) as 고객수, avg(마일리지) as 평균마일리지
from 고객
group by 도시;

select 담당자직위, 도시, count(*) as 고객수, truncate(avg(마일리지),0) as 평균마일리지
from 고객
group by 담당자직위, 도시
order by 담당자직위, 도시;

-- 고객별 주문수
select 고객번호, count(*)as 주문수
from 주문
group by 고객번호
order by 주문수 desc;

-- having 그룹별 조건
select 도시, count(*) as 고객수, avg(마일리지) as 평균마일리지
from 고객
group by 도시
having 고객수 > 4 -- MySQL;
-- having count(*) >= 4; -- 표준 SQL에서는 이렇게 사용해야함!!

select 도시,고객번호, sum(마일리지) as 총마일리지
from 고객
where 고객번호 like 'T%'
group by 도시, 고객번호
having 총마일리지 >= 1000;

-- 제품별 주문수량 합계 구하기
select 제품번호, sum(주문수량) as 총주문수 
from 주문세부
group by 제품번호
order by 제품번호;

-- 각 제품별 주문수량이 1000개 이상인 제품만 출력
select 제품번호, sum(주문수량) as 총주문수 
from 주문세부
group by 제품번호
having 총주문수 >= 1000
order by 총주문수 desc;

-- 제품테이블에서 '아이스크림' 제품들에 대하여 제품명별로 재고합을 출력하시오
select 제품명, sum(재고) as 재고합 
from 제품
where 제품명 like '%아이스크림%'
group by 제품명;

-- with rollup 그룹별 소계와 전체 총계를 표시
select 도시, count(*) as 고객수, avg(마일리지) as 평균마일리지
from 고객
group by 도시
with rollup;

select 담당자직위, 도시, count(*) as 고객수
from 고객
group by 담당자직위, 도시
with rollup;







