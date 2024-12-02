use testdb;
-- 날짜함수

-- now 현재 날짜와 시간
-- sysdate 현재 시스템의 날짜와 시간 (now와 대부분 동일)
-- curdate 현재 날짜
-- curtime 현재 시간
select now(), sysdate(), curdate(), curtime();
-- 날짜 계산을 시스템에게 맡김

-- year(년), quarter(분기), month(월), day(일), hour(시), minute(분), second(초)
select year(now()), quarter(now()), month(now()), day(now()), hour(now()),minute(now()), second(now());

-- datediff 날짜 간의 차이 ()
-- timestampdiff(year, month, day) 두 날짜의 시간을 기준시간으로 변환하여 계산하고 다시 날짜로 변환
select datediff('2024-12-25', now()); -- 28
select abs(datediff(now(), '2024-12-25')); 
select timestampdiff(year, now(),'2025-12-25');
select timestampdiff(month, now(),'2025-12-25');
select timestampdiff(day, now(),'2025-12-25');

-- adddate 특정날짜에 기간을 더하다
-- subdate 특정날짜에 기간을 빼다
select adddate(now(),50), subdate(now(),50); 
select adddate(now(),-50); -- =subdate와 같은 의미

-- adddate/subdate에 interval를 함께 사용하면 더하거나 빼는 기간을 정할 수 있음
select adddate(now(),interval 50 year);
select adddate(now(),interval -3 month);
select adddate(now(),interval 50 day);
select adddate(now(),interval 50 hour); 




