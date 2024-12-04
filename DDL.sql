-- DDL.sql

use testdb;

/* 데이터베이스에서 사용되는 데이터타입
(MySQL 기준)

1. 문자형 데이터타입 (단위: 바이트)

char 고정길이 255자
var 가변길이 기본 65535
tinytext 255자
text 65535
mediumtext 16,777,215
* longtext 4,294,967,295
json 1기가

2. 숫자형 데이터타입
tinyint 1
smallint 2
mediumint 3
int 4
bigint 8
float 4
double 8

3. 날짜시간형 데이터타입
date YYYY-MM-DD
time HH:MI:SS
datetime YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS

4. 이진형(바이너리) 데이터타입 - 이미지, 오디오, 비디오 등등
(blob은 binary large object의 약자)
tinyblob 255
blob 65535
mediumblob 16,777,215
longblob 4,294,967,295
 */

-- 1. create 데이터베이스 생성
create database testtest
	char set utf8mb4 collate utf8mb4_general_ci

use testtest;
	
create table 학과 (학과번호 char(2), 학과명 varchar(20), 학과장명 varchar(20));