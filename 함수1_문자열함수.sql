use testdb;

-- 함수1_문자열함수
-- char_length 문자의 갯수
select char_length('hello'); -- 5 
select length ('hello'); -- 5
select char_length('안녕'),length ('안녕'); -- 2, 6 (utf8은 한글 1글자 당 3바이트에 담는다. 3+3) 

-- concat 문자열 연결
-- concat_ws 문자열을 구분자와 함께 연결 (ws = with seperator)
select concat('그림',' 그리기'); -- 그림 그리기
select concat_ws('-','2024','11','27'); -- 2024-11-27

-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 문자열의 몇번째부터 몇개
select left ('SQL 공부',3), 
right ('SQL 공부',2),
substr('SQL 공부', 3,4),
substr('SQL 공부', 5);
-- 인덱스가 아님. 그냥 몇번째인지 세면 됨
	
-- substring_index
-- 구분자를 만날때까지 문자열을 잘라낸다. 인덱스는 몇번째 구분자를 만날대까지 자를지 결정
-- 만약 인덱스가 음수값이면 오른쪽에서 자름
select substring_index('서울시 동작구 흑석동',' ',1); -- 서울시
select substring_index('서울시 동작구 흑석동',' ',2); -- 서울시 동작구
select substring_index('서울시 동작구 흑석동',' ',-1); -- 흑석동
select substring_index('서울시 동작구 흑석동',' ',-2); -- 동작구 흑석동
-- 동작구만 자르고싶다면?
-- '서울시 동작구'만 자른 다음 음수 인덱스를 사용하여 오른쪽에서 자름
select substring_index(substring_index('서울시 동작구 흑석동',' ',2),' ',-1);

-- ltrim (왼쪽 공백 제거) 
-- rtrim (오른쪽 공백 제거)
-- trim  (양쪽 공백 제거)
select ltrim('     sql'), rtrim('sql       '),trim('     s q l    ');

-- lpad (채우기, 문자열 기준 왼쪽에 정해진 길이 내에서 주어진 문자로 채움)
-- rpad (채우기, 문자열 기준 오른쪽에 정해진 길이 내에서 주어진 문자로 채움)
select lpad('sql', 10, '#'), rpad('sql',5,'*');

-- field ( 문자열의 위치 찾기 )
-- field ( 찾는 문자열, 문자열1, 문자열2, 문자열3, 문자열4, ...)
-- find_in_set (문자열 리스트에서 지정한 문자열을 찾음)
-- find_in_set (찾는 문자열, 문자열 리스트)
select field('java','sql', 'java', 'javascript');  -- 2
select find_in_set('java', 'sql,java,javascript'); -- 2

-- locate 기준문자열에서 부분분자열의 위치를 찾음
-- locate(부분문자열, 기준문자열)
select locate('world', 'hello world'); -- 7 (7번째부터 시작)
select locate('hi', 'hello world'); -- 0 (없음, SQL은 0번째라는 개념이 없기때문)

-- elt 지정한 위치에 있는 문자열을 반환
-- elt (문자열 번호, 문자열)
select elt(2, 'sql','java','javascript'); -- java

-- repeat 지정한 문자열을 반복
select repeat('*',5); -- *****

-- replace 문자열의 일부를 다른 문자열로 대체
-- replace (대상 문자열, 바꿀 문자열, 바뀔 문자열)
select replace('010 1234 5678', ' ','-');
select replace('2024/11/27', '/', '.');

-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); 