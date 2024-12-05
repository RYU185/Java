-- 제약조건.sql

/* 데이터베이스에는 무결점의 데이터가 필수이다. (=무결성의 원칙)
테이블에 아무런 제약사항을 두지않으면 적합하지 않은 데이터가 저장되고
무결성의 원칙에 위배된다
반드시 제약조건을 설정해야함*/



create database test2
	char set utf8mb4 collate utf8mb4_general_ci;
	
use test2;

/* 제약조건의 종류
primary key : PK, 기본키
not null : 반드시 값이 필수
unique : 유일한 값 보장
check : 설정된 조건에 맞는 값만 저장
default : 값을 안넣으면 자동으로 기본값을 저장
foreign key : FK, 외래키
auto_increment: 숫자형 값의 자동증가
*/

/* primary key와 unique의 차이점
 * pk는 테이블의 각 행을 고유하게 식별하는 컬럼
 * 테이블당 오직 한개만 가능함
 * 자동으로 unique와 not null 속성을 가짐
 * 인덱스를 자동생성

 * unique: 테이블에서 고유한 값 보장
 * null 속성 가능
 * 인덱스를 자동생성하지 않음
 * 테이블 내에서 여러 개의 unique컬럼을 가질 수 있음* 
 */


create table 학과
(학과번호 char(2) primary key, 
학과명 varchar(20) not null,
학과장명 varchar(20));

insert into 학과 values('AA', '컴퓨터공학과','김교수');
insert into 학과 values('AA', '컴퓨터공학과','김교수'); -- AA는 primary Key라서 중복될수 없다
insert into 학과 values('BB', null ,'박교수'); -- 학과명은 not null의 제약조건이 있기때문에 null을 둘 수 없다
insert into 학과 values('CC', '디지털융합과',null); 

create table 학생
(학번 char(5) primary key,
이름 varchar(20) not null,
생일 date not null,
연락처 varchar(20) unique,
성별 char(1) not null check(성별 in ('남','여')),
등록일 date default(curdate()));


insert into 학생 (학번, 이름, 생일, 연락처, 성별) 
values ('S0001','Steve','2000-01-01','010-2444-3333','남');
insert into 학생 (학번, 이름, 생일, 연락처, 성별) 
values ('S0002','Tom','2000-01-02','010-2222-3344','남');

create table 과목
(과목번호 char(5) primary key,
과목명 char(20) not null,
학점 int not null check(학점 between 1 and 5),
구분 varchar(20) not 	null check (구분 in ('전공','교양','일반')));

create table 영화
(영화번호 char(5) primary key,
제목 varchar(100) not null,
장르 varchar(20) check (장르 in ('코미디','드라마','다큐멘터리','SF','액션','기타')),
배우 varchar(100) not null,
감독 varchar(100) not null,
개봉일 date,
등록일 date default(curdate()));

insert into 영화
values('MV003','DEMON','SF','TOM','TOM','1873-09-12',CURDATE());

insert into 영화
values('MV002','Diablo','액션','SAM','SAM','1999-09-09',curdate());

create table 평점
(번호 int auto_increment primary key,
평가자닉네임 varchar(100) not null,
영화번호 char(5) not null,
평점 int not null check(평점 between 1 and 5),
평가 varchar(2000) not null,
등록일 date default(curdate()),
constraint fk_영화번호 foreign key (영화번호) references 영화(영화번호));

insert into 평점 (평가자닉네임, 영화번호, 평점, 평가)
values('Grrrr', 'MV002',5,'good');

insert into 평점 (평가자닉네임, 영화번호, 평점, 평가)
values('Grrrr', 'MV001',5,'good'); -- 에러 발생, MV001이라는 영화번호가 없음

insert into 평점 (평가자닉네임, 영화번호, 평점, 평가)
values('Grrrr', 'MV003',5,'Bad');


