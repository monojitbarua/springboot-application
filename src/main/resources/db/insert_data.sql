INSERT INTO skills (skill_id,skill_name,skill_rate,skill_description)
VALUES (1,'Java',20,''),
       (2,'Go',19,''),
       (3,'Python',30,''),
       (4,'Kafka',50,''),
       (5,'Kubernetes',20,''),
       (6,'Cloud',80,''),
       (7,'Angular',66,''),
       (8,'React',88,''),
       (9,'Full Stack',99,''),
       (10,'AI',100,'');

INSERT INTO employees (employee_id,first_name,last_name,title,company,employee_bio,employee_photo)
VALUES (1,'Nilay','Bose','Senior Developer','MicroOcean Software','Test', null),
       (2,'Monojit','Barua','Solutions Architect','Fabrikam Industries','Test', null),
       (3,'Prasant','Rao','Enerprise Architect','Carved Rock Online','Test', null),
       (4,'Saurabh','Prakash','Chief Technology Officer','NorthernSoft Systems','Test', null);

INSERT INTO skill_employees (skill_id,employee_id)
VALUES (2,1),
       (1,2),
       (5,3),
       (8,4);
