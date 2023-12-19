USE odbo;

create table if not exists testboard (
    id varchar(20) primary key,
    writetext varchar(50),
    signuptime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

desc testboard;