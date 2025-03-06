-- create문 2개, insert문 16개
create table book_tbl_06(
    book_no number primary key
   ,book_name varchar2(50) not null
   ,book_coverimg varchar2(20)
   ,book_date date
   ,book_price number
   ,book_publisher varchar2(50)
   ,book_info varchar2(2000)
   );

insert into book_tbl_06
values(100, '리눅스', '100.jpg', '15/09/02', 24000, '나룩스', '운영체제, DB기초, 네트워크기초, 개발환경구축');
insert into book_tbl_06
values(101, '자바', '101.jpg', '16/01/10', 20000, '이자바', '프로그래밍 언어');
insert into book_tbl_06
values(102, '자바웹프로그래밍', '102.jpg', '16/10/30', 25000, '김프로', '개발환경/서버프로그램/배치프로그램');
insert into book_tbl_06
values(103, '오픈소스활용하기', '103.jpg', '17/09/01', 30000, '박오픈', '형상관리, 빌드, 배포');
insert into book_tbl_06
values(104, 'HTML', '104.jpg', '18/04/04', 10000, '홍길동', 'HTML/CSS/JAVASCRIPT/JQUERY');

SELECT *
FROM book_tbl_06;
commit;

create table rent_tbl_06(
    rent_no number primary key
   ,book_no number not null
   ,rent_price number not null
   ,rent_date date
   ,rent_status char(1) default 0 not null
   );

insert into rent_tbl_06
values(10001, 100, 2400, '18/07/02', 1);
insert into rent_tbl_06
values(10002, 101, 2000, '18/07/04', 1);
insert into rent_tbl_06
values(10003, 100, 2400, '18/08/02', 1);
insert into rent_tbl_06
values(10004, 100, 2400, '18/08/12', 1);
insert into rent_tbl_06
values(10005, 102, 2500, '18/08/13', 1);
insert into rent_tbl_06
values(10006, 103, 3000, '18/08/13', 1);
insert into rent_tbl_06
values(10007, 103, 3000, '18/08/20', 0);
insert into rent_tbl_06
values(10008, 100, 2400, '18/09/03', 1);
insert into rent_tbl_06
values(10009, 100, 2400, '18/09/08', 1);
insert into rent_tbl_06
values(10010, 100, 2400, '18/09/14', 0);
insert into rent_tbl_06
values(10011, 102, 2500, '18/09/14', 0);

commit;

select book_no
      ,book_name
      ,book_coverimg
      ,book_date
      ,book_price
      ,book_publisher
      ,book_info
from book_tbl_06
order by book_no;

select rent_no
      ,book_no
      ,rent_price
      ,rent_date
      ,rent_status
from rent_tbl_06
order by rent_no;


