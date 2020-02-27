USE datasession;

-- ANSWER 1 --------------------------------------------------

CREATE TABLE user_roles(
    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    role VARCHAR(20) NOT NULL,
    teamSize INTEGER NOT NULL
);

DELIMITER $$
CREATE PROCEDURE insertData()
BEGIN 
INSERT INTO user_roles(role, teamSize)
VALUES('employee',1), ('member',1),('learner',1),('member',1),('employee',1);
END;
$$
DELIMITER ;

DROP PROCEDURE insertData;

DELIMITER $$
CREATE PROCEDURE insertData()
BEGIN 
DECLARE pkvalue INT;
SELECT MAX(id) INTO pkvalue FROM user_roles;
INSERT INTO user_roles
VALUES(pkvalue+1,'admin',1), (pkvalue+2,'employee',1),(pkvalue+3,'learner',1);
END;
$$
DELIMITER ;

-- ANSWER 2 --------------------------------------------------

DROP PROCEDURE insertData;

DELIMITER $$
CREATE PROCEDURE insertData(IN pkvalue INT)
BEGIN 
INSERT INTO user_roles
VALUES(pkvalue+1,'admin',1), (pkvalue+2,'employee',1),(pkvalue+3,'learner',1);
END;
$$
DELIMITER ;

CALL insertData(8);

-- ANSWER 3 --------------------------------------------------

DELIMITER $$
CREATE PROCEDURE conditionalSP(IN in_role VARCHAR(10), OUT roles VARCHAR(40))
BEGIN 
CASE in_role
    WHEN 'admin' THEN
        SET roles = 'This is admin';
    WHEN 'learner' THEN
        SET roles = 'This is learner';
    WHEN 'employee' THEN
        SET roles = 'This is employee';
    ELSE
        SET roles = 'This is other';
END CASE;
END;
$$
DELIMITER ;

CALL conditionalSP('learner', @role_comment);
SELECT @role_comment;


-- ANSWER 4 --------------------------------------------------

CREATE TABLE student(
    student_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    marks INTEGER NOT NULL,
    grade VARCHAR(100)
);

DELIMITER $$
CREATE PROCEDURE loadData()
BEGIN
INSERT INTO student(marks)
VALUES(89),(15),(55),(80),(95);
END;
$$
DELIMITER ;

CALL loadData();

DELIMITER $$
CREATE PROCEDURE grader()
BEGIN
DECLARE temp1 INT;
DECLARE temp2 INT;
DECLARE done INT DEFAULT FALSE;
DECLARE looper CURSOR FOR SELECT student_id, marks FROM student;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
OPEN looper;

loop_label: LOOP
FETCH looper INTO temp1,temp2;
IF done THEN LEAVE loop_label;
END IF;
IF temp2 > 90 THEN
    UPDATE student SET grade = 'A' WHERE student_id = temp1;
ELSEIF temp2 > 70 THEN
    UPDATE student SET grade = 'B' WHERE student_id = temp1;
ELSEIF temp2 > 40 THEN
    UPDATE student SET grade = 'C' WHERE student_id = temp1;
ELSE
    UPDATE student SET grade = 'D' WHERE student_id = temp1;
END IF;
END LOOP;
CLOSE looper;
END;
$$
DELIMITER ;

