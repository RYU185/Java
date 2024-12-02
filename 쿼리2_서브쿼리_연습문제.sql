use testdb;

-- 1. 기획부에 근무하는 사원의 이름과 직위 조회
select 이름, 직위
from 사원
where 사원.부서번호 = (select 부서번호 from 부서 where 부서.부서명 = '기획부');


-- 2. 재고가 50개 미만인 제품의 제품번호, 주문번호, 주문수량 조회
-- 2.1 join query
select 제품.제품번호, 재고, 주문번호, 주문수량
from 주문세부
join 제품
on 주문세부.제품번호 = 제품.제품번호 
where 재고 < 50
order by 재고 desc;


-- 3. 고객의 주문기록이 존재하지 않는 고객의 고객번호, 고객회사명 조회
select 고객.고객번호, 고객회사명
from 고객
left outer join 주문
on 고객.고객번호=주문.고객번호 
where 주문.고객번호 is null;

-- 4. 최근 3개월 내 주문이 있는 사원의 사원번호, 이름, 직위 조회
select 사원.사원번호, 이름, 직위
from 사원
join 주문 on 주문.사원번호 = 사원.사원번호 
join 주문세부 on 주문.주문번호 = 주문세부.주문번호 
where 주문일 < adddate(now(),interval -3 month)
group by 사원번호,이름,직위
order by 사원번호;

-- 5. 고객별 주문수를 계산하여 고객회사명, 주문수 조회
select 고객별주문수, 고객회사명, 주문세부.주문수량 as 주문수
from 고객
join (select  )






-- 6. 제품명, 제품별 총주문수량을 조회