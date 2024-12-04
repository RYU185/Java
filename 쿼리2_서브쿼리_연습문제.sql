use testdb;

-- 1. 기획부에 근무하는 사원의 이름과 직위 조회
select 이름, 직위
from 사원
where 사원.부서번호 = (select 부서번호 from 부서 where 부서.부서명 = '기획부');

-- 1-1 join query 변환
select 이름, 직위
from 사원
join 부서 on 사원.부서번호 = 부서.부서번호 
where 부서명 = '기획부'



-- 2. 재고가 50개 미만인 제품의 제품번호, 주문번호, 주문수량 조회

select 제품번호, 주문번호, 주문수량
from 주문세부
where 제품번호 in (select 제품번호 from 제품 where 재고 <50);

-- 2.1 join query 변환

select 제품.제품번호, 재고, 주문번호, 주문수량
from 주문세부
join 제품
on 주문세부.제품번호 = 제품.제품번호 
where 재고 < 50
order by 재고 desc;



-- 3. 고객의 주문기록이 존재하지 않는 고객의 고객번호, 고객회사명 조회

select 고객번호, 고객회사명
from 고객
where 고객번호 not in(select 고객번호 from 주문);

-- 3-1 join query 변환
select 고객.고객번호, 고객회사명
from 고객
left outer join 주문
on 고객.고객번호=주문.고객번호 
where 주문.고객번호 is null;



-- 4. 2022년 2월 1일 기준 최근 3개월 내 주문이 있는 사원의 사원번호, 이름, 직위 조회

select 사원번호, 이름, 직위
from 사원
where 사원번호 in (select 사원번호 
				from 주문 
				where 주문일 >= adddate('2022-02-01',interval -3 month));

-- 4-1 join query 변환
select 사원.사원번호, 이름, 직위
from 사원
join 주문 on 주문.사원번호 = 사원.사원번호 
join 주문세부 on 주문.주문번호 = 주문세부.주문번호 
where 주문일 < adddate('2022-02-01',interval -3 month)
group by 사원번호,이름,직위
order by 사원번호;




-- 5. 고객별 주문수를 계산하여 고객회사명, 주문수 조회
select 고객회사명, (
		select count(*)from 주문
		where 고객.고객번호 = 주문.고객번호
		) as 주문수
from 고객
order by 고객회사명;

-- 5-1 join query 변환
select 고객회사명, count(*) as 주문수 
from 고객
join 주문 on 주문.고객번호 = 고객.고객번호
group by 고객회사명
order by 고객회사명;


-- 6. 제품명, 제품별 총주문수량을 조회
select 제품명, (select sum(주문수량)
			from 주문세부 
			where 제품.제품번호=주문세부.제품번호) 
			as '제품별 총주문수량'
from 제품
order by 제품명;

-- 6-1 join query 변환
select 제품명, sum(주문수량) as '제품별 총주문수량'
from 제품 join 주문세부
on 제품.제품번호 = 주문세부.제품번호
group by 제품명
order by 제품명;


-- 7. 제품테이블에 있는 제품 중 단가(주문세부)가 가장 높은 제품명
select 제품명, (select max(단가)
			from 주문세부
			where 제품.제품번호 = 주문세부.제품번호 )
			as 단가
from 제품
order by 단가 desc
limit 1;


-- 7-1 join query 변환
select 제품명, max(주문세부.단가) as 단가
from 제품
join 주문세부 on 제품.제품번호 = 주문세부.제품번호 
group by 제품명
order by max(주문세부.단가) desc
limit 1;


-- 8. 제품 테이블에 있는 제품 중 (제품)단가가 가장 높은 제품의 주문수량합
select 제품번호, (select sum(주문수량) 
			from 주문세부 
			where 제품.제품번호 = 주문세부.제품번호 ) 
			as 주문수량합
from 제품
where 단가 = (select max(단가) from 제품);

-- 8-1 join query 변환 (서브쿼리 사용X)
with 총주문수량 as 
	(select 제품번호
	from 제품
	where 단가 =(select max(단가) from 제품)
select 총주문수량.제품번호,
		sum(주문세부.주문수량) as 주문수량합 
from 총주문수량 
join 주문세부 on 총주문수량.제품번호 = 주문세부.제품번호
group by 총주문수량.제품번호;
-- 왜 오류인지 모르겠습니다...

-- 9. '아이스크림' 제품의 주문수량합
select 제품명, (select sum(주문수량)
			from 주문세부 
			where 제품.제품번호 = 주문세부.제품번호 )
			as 주문수량합
from 제품
where 제품명 like '%아이스크림%';

-- 9-1 join query 변환
select 제품명, sum(주문세부.주문수량) as 주문수량합
from 제품
join 주문세부 on 제품.제품번호 = 주문세부.제품번호 
where 제품명 like '%아이스크림%'
group by 제품명
order by 제품명;


-- 10. '서울특별시' 고객들에 대한 주문년도별 주문건수
select year(주문일) as 주문년도, count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객 where 도시 = '서울특별시')
group by year(주문일);

-- 10-1 join query 변환
select year(주문일) as 주문연도, count(*) as 주문건수
from 주문
join 고객 on 고객.고객번호 = 주문.고객번호 
where 도시 = '서울특별시'
group by year(주문일)
order by year(주문일);

-- 위 쿼리들을 모두 일반 조인쿼리로 바꾸시오














