/* 주석처리  */


/* sql 스크립트는 사용할 데이터베이스를 명시해주는 것이 좋음 */
use testdb;

select *from 고객;
/* sql명령 끝에 세미콜론 입력한 후 실행시킬 명령줄에 커서를 둔 상태로 ctrl + enter 입력하여 실행 
"*" 표시는 all의 의미임 */
select 고객번호, 담당자명, 고객회사명, 마일리지 from 고객;	

select 고객번호, 담당자명, 고객회사명, 마일리지 as 포인트,
마일리지 * 1.1 as "10% 인상된 마일리지" from 고객;

select 고객번호, 담당자명, 마일리지 from 고객 where 마일리지 >= 100000; -- 마일리지 100000 이상
select 고객번호, 담당자명, 마일리지 from 고객 where 마일리지 <= 50000; -- 마일리지 50000 이하

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = "서울특별시";
-- 자바에서는 ==를 사용하지만 sql에서는 = 연산자를 사용함
-- 서울특별시에 해당하는 정보만 보여줌

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = "서울특별시"
order by 마일리지;
-- 마일리지 오름차순

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = "서울특별시"
order by 마일리지 desc ; -- descending order : 내림차순 정렬

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = "서울특별시"
order by 마일리지 desc 
limit 10; -- 갯수 제한

select 도시 from 고객;
select distinct 도시 from 고객; -- 중복제외 도시 갯수

select 고객.도시, sum(주문수량*단가) as 주문금액합 from 주문세부
join 주문 on 주문세부.주문번호 = 주문.주문번호 
join 고객 on 고객.고객번호 = 주문.고객번호 
group by 고객.도시
order by 도시;

select 도시, count(*) as 주문건수 from 주문
join 고객 on 고객.고객번호 = 주문.고객번호 
where year(주문일)
group by 도시
order by 주문건수 desc;



