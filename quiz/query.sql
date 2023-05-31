use quiz;

CREATE TABLE quiz (
  quiz_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  question INT,
  answer VARCHAR(100) NOT NULL,
  type VARCHAR(50) NOT NULL,
  reward INT(50) NOT NULL,
  created_by VARCHAR(100),
  updated_at TIMESTAMP DEFAULT NOW()
  );
  
select * from quiz;

insert into quiz values (1,"What's the name of the group of cells that will become a baby?","embryo","short",600,"jin",now());
insert into quiz values (2,"Which animal lives longest?","2","multiple",400,"jin",now());
insert into quiz values (3,"What is the longest river that flows through Egypt?","nile","short",700,"jin",now());
  
ALTER TABLE quiz MODIFY question VARCHAR(100);