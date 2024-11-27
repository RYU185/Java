use testdb;

-- ceiling 올림 (위치를 지정가능)
-- floor 내림
-- round 반올림
-- round 두번째 매개변수를 지정하면 반올림하는 위치를 정할 수 있음
-- truncate 버림, 위치를 지정가능
-- 소수점 위치를 지정하는 숫자는 표현하고 싶은 소수점자리 갯수 E
select ceiling (123.56), 
	floor (123.56),  
	round(123.56), 
	round(123.56,1), -- 소수점 이하 한자리
	truncate(123.56, 1); -- 소수점 이하 한자리
	truncate(123.56, 2); -- 소수점 이하 두자리
;

-- abs 절대값
-- sign 음수는 -1, 양수는 1
select abs(-120), sign(-120),sign(120);

-- power 제곱
-- sqrt (square root) 제곱근
-- rand 랜덤넘버
-- rand 함수의 매개변수는 seed이다.
-- 동일 seed는 동일 랜덤넘버가 나옴
select power (2,3); -- 8 (2^3 2의 3제곱)
select sqrt(16); -- 4
select rand(); -- 0과 1사이의 랜덤 넘버
select rand(100); -- 결과값 항상 동일
select rand(200); 


 
	
