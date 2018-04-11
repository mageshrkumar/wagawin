create table person (
   person_id BIGINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   age  integer,
   PRIMARY KEY (person_id)
);
 
 
create table house (
   house_id BIGINT NOT NULL,
   address VARCHAR(100) NOT NULL,
   zip_code  VARCHAR(30) NOT NULL,
   house_type  VARCHAR(30) NOT NULL,
   PRIMARY KEY (house_id),
   CONSTRAINT person_house FOREIGN KEY (house_id) REFERENCES person ( person_id) ON DELETE CASCADE 
);

create table child (
   child_id BIGINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   age  integer,
   sex varchar(1) NOT null,
   person_id bigint not null,
   PRIMARY KEY (child_id),
   FOREIGN KEY (person_id) REFERENCES Person(person_id)
);

ALTER TABLE child CHANGE `person_id` `parent_id` bigint not null;

ALTER TABLE child ADD hair_color varchar(50);

ALTER TABLE child ADD bicycle_color varchar(50);


create table meal (
    meal_id bigint not null auto_increment,
    name varchar(100) not null,
    invented date not null,
    child_id bigint not null,
    primary key (meal_id),
    foreign key(child_id) references child(child_id)
)