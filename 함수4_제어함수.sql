use testdb;

-- 제어함수

-- 타입변환
-- MySQL의 고정 데이터타입 char(정수), signed(양,음의 정수), unsigned(양의 정수), date, datetime, time, binary(2진데이터)
-- 가변 데이터 타입: varchar, blob(Binary Large Object의 약자. 음악, 영상같은 데이터들을 저장하는데 쓰임) 
-- cast
-- convert
select cast('1' as unsigned), cast(2 as char); -- unsigned: 오직 양수만 (음수값을 절대 쓰지 않는 경우)
select convert('1', unsigned), convert (2,char);

-- if 조건식
-- 자바의 삼항연산식과 형식이 동일
select if(12500*450 > 500000,'초과달성','미달성');

-- case 
-- case when 조건 then 실행형태
-- 조건에 따른 실행을 여러개 설정 가능
-- 마지막에 end는 반드시 사용해야함!! 
select case when 12500*450 > 500000 then '초과달성'
			when 2500*450 > 400000 then '달성'
			else '미달성'
			end as 'case구문';
			;
		
-- ifNull null여부를 체크하는 함수
-- 값이 null이면 두번째 매개변수를 반환
select ifnull(5,'null'), ifnull(null, '값이 없음');

-- nullif
-- nullif(A,B) : A와 B가 동일하면 null 반환, 다르면 A 반환
-- 특정 컬럼을 업데이트 했을 경우 각 데이터별로 업데이트별 여부를 확인하는데 사용
-- 기본 값과 달리 업데이트된 값을 기록하는 용도
select nullif ('mysql','oracle'), nullif('oracle','oracle');
		
		