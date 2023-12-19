Use odbo;

create table if not exists department (
    name varchar(20) primary key,
    passwd varchar(20),
    dept varchar(20),
    signuptime timestamp default current_timestamp
);