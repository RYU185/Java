use testdb;


-- 멀티행(=복수행) 서브쿼리: 결과가 여러 행으로 나오는 쿼리
-- 쿼리의 결과가 여러개이므로 '=' 연산자로 처리가 불가능. 여러 비교연산자가 필요함
-- in, all, any, exists, some 등을 사용

-- #1. IN
-- 부산광역시 고객이 주문한 주문건수
select count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객 where 도시 = '부산광역시');

-- #2. ANY
-- 서브쿼리의 결과값과 비교할 때 그 어느하나라도 만족하는 값
-- 부산광역시 전체고객의 마일리지보다 마일리지가 큰 고객의 정보
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > any (select 마일리지 from 고객 where 도시= '부산광역시');

select 마일리지 from 고객 where 도시 = '부산광역시';


-- #3. ALL
-- 각 지역의 어느 평균 마일리지보다도 마일리지가 큰 고객의 정보
-- 서브쿼리의 결과값 중 가장 큰 최댓값 
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > all (select avg(마일리지) from 고객 group by 지역);


-- #4. EXISTS
select 고객번호, 고객회사명
from 고객
where exists (select*from 주문 where 고객.고객번호 = 주문.고객번호)

-- in 연산자를 사용하여 동일한 결과 얻을수 있음
select 고객번호, 고객회사명
from 고객
where 고객번호 in (select 고객번호 from 주문);
-- distinct가 없어도 동일한 결과가 나오지만 중복비교를 하게되므로 사용하는 것이 좋음

-- some
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > some (select 마일리지 from 고객 where 도시= '부산광역시');










