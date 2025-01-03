use testdb;

/*1. 2020년 2사분기의 주문내역을 보이시오 */
select *from 주문
where 주문일 = 2020 and quarter(주문일) = 2;

/*2. 제품번호, 제품명, 재고, 재고구분을 보이시오
재고구분: 재고가 100개 이상이면 '과다재고', 10개이상이면 '적정', 나머지는 '재고부족' */
select 제품번호, 제품명, 재고, 
case when 재고>100 then '과다재고'
when 재고 > 10 then '적정'
else '재고부족'
end as '재고구분'
from 제품;


/*3. 입사한지 40개월이 지난 사원을 보이시오 */
select *from 사원
where timestampdiff(month, 입사일, now()) > 60; 


/*4. 고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼
의 이름은 고객회사명2, 전화번호2로 만드시오
고객회사명2의 조건 : 기존 고객회사명의 앞 2자리를 *로 변환
전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환 
select concat('그림',' 그리기'); -- 그림 그리기 
select replace('2024/11/27', '/', '.');*/
select replace (고객회사명, left(고객회사명,2),'**') as 고객회사명2,
     -- concat('**', substring(고객회사명,3)) as 고객회사명2 로도 가능 
	   replace(substr(전화번호,2),')','-') as 전화번호2
from 고객;


/*5. 주문세부 테이블에서 아래 3개의 컬럼을 조건대로 만드시오
주문금액 : 주문수량 * 단가
할인금액 : 주문수량 * 단가 * 할인율
실주문금액 : 주문금액 - 할인금액 */

select 주문수량*단가 as 주문금액,
주문수량*단가*할인율 as 할인금액, 
(주문수량*단가)-(주문수량 * 단가 * 할인율) as 실주문금액 from 주문세부

-- ``백틱



/*6. 사원테이블에서 전체사원의 이름, 생일, 만나이(as 만나이), 입사일, 입사일수(as 입사일수), 
입사한지 500일후(as 입사500일후)의 날짜를 만드시오 */
select 이름, 
	생일,
	timestampdiff(year,생일,now()) as 만나이, 
	입사일, 
	timestampdiff(day,입사일,now()) as 입사일수,
	adddate(입사일, 500) as 입사500일후
from 사원;




/*7. 주문테이블에서 요청일보다 발송일이 7일 이상 늦은 주문내역 */
select *,
		abs(datediff(발송일, 요청일)) as 지연일수 from 주문
where abs(datediff(발송일, 요청일)) >= 7
order by 지연일수 desc;
-- where에 지연일수를 쓸수없는 이유
-- 쿼리 실행순서를 알아야함
-- 1. from 어느 테이블에서 정보를 가져올지 결정
-- 2. where 어떤 정보를 가져올지 결정 (조건)
-- 3. group by 그룹화
-- 4. select 원하는 컬럼(열)을 추출, 생성 - 별칭 생성(as)
-- 5. having 그룹에 조건을 적용
-- 6. order by 정렬 
-- 7. limit 갯수 제한

-- <서브쿼리에서는 where절에서도 별칭 사용가능>
-- select * from (select datediff(발송일, 요청일)) as 지연일수
--		from 주문)
-- where 지연일수 >= 7

/*8. 고객테이블에서 아래와 같은 컬럼을 만드시오. 단, 도시구분과 마일리지구분
컬럼의 조건은 아래 조건을 따르시오
담당자명, 고객회사명, 도시, 도시구분, 마일리지, 마일리지구분
조건1(도시구분) : 특별시나 광역시는 '대도시', 나머지 도시는 '도시'로 표현
조건2(마일리지구분) : 마일리지가 100,000점 이상이면 'VVIP', 10,000점 
이상이면 'VIP', 나머지는 '일반고객'으로 표현 */

select 담당자명, 고객회사명, 도시,
	if (right(도시,3)='특별시'or right(도시,3)='광역시' ,'대도시','도시') as 도시구분,
	마일리지,
	case when 마일리지 >= 100000 then 'VVIP'
	when 마일리지>=10000 then 'VIP'
	else '일반고객'
	end as '마일리지 구분'
	from 고객;
	


/*9. 주문테이블에서 아래 컬럼을 만드시오
주문번호, 고객번호, 주문일(년월일 모두), 주문년도, 주문분기, 주문월, 주문일(날짜만 표시), 주문요일, 
한글요일
조건1 : 한글요일은 case문을 이용하여 정수값을 '월요일'같은 한글 요일표시로 
표현 */

select 주문번호, 고객번호, 주문일,
		year(주문일) as 주문년도,
		quarter(주문일) as 주문분기,
		month (주문일) as 주문월,
		day (주문일) as 주문일,
		weekday(주문일) as 주문요일,
		case weekday(주문일) when 0 then '월요일'
						   when 1 then '화요일'
						   when 2 then '수요일'
						   when 3 then '목요일'
						   when 4 then '금요일'
						   when 5 then '토요일'
						   when 6 then '일요일'
						   end as 한글요일
		from 주문;
	
