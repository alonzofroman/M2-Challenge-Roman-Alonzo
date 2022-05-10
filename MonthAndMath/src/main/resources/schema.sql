create schema if not exists monthAndMath;
use monthAndMath;

create table if not exists months (
name varChar(15) not null,
number int not null
);