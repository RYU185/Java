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

/* 다중컬럼 서브쿼리
서브쿼리가 여러 개의 컬럼을 select할때 그 컬럼들을 필터링의 조건으로 두개 이상을 사용하는 문법
*/
-- 각 도시마다 최고 마일리지를 보유한 고객의 정보
select 도시, 담당자명, 고객회사명, 마일리지
from 고객
where (도시,마일리지) in (select 도시, max(마일리지) from 고객 group by 도시);
-- 서브쿼리가 select한 도시와 max(마일리지) 두개 컬럼에 모두 일치하는 조건을 조회해야 함
-- 그러므로 한개의 컬럼으로 두 조건을 만족할 수 없으므로 다중컬럼을 사용해야 함 = (도시,마일리지)
-- 예를 들어, 서울특별시에 있으면서 마일리지가 128,790인 회사를 select하기 위해 다중컬럼을 사용한 것임

-- 다중컬럼 서브쿼리대신 from절의 서브쿼리를 이용하면 해결 가능함
select 고객.도시, 담당자명, 고객회사명, 마일리지
from 고객
join ( select 도시, max(마일리지) as 최고마일리지 from 고객 group by 도시) as 최고마일리지정보
on 고객.도시 = 최고마일리지정보.도시
and 고객.마일리지 = 최고마일리지정보.최고마일리지;








