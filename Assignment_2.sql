USE datasession;

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