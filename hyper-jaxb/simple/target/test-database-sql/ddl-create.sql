create table simplecase.GROUP_ (HJID bigserial not null, primary key (HJID));
create table simplecase.PERSON_TYPE (HJID bigserial not null, PERSON_GROUP__HJID bigint, NAME_ varchar(255), TITLE varchar(255), primary key (HJID));
alter table if exists simplecase.PERSON_TYPE add constraint FK3aieb340ekahh62ibta5bdu9n foreign key (PERSON_GROUP__HJID) references simplecase.GROUP_;
