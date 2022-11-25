CREATE TABLE skills
(
    skill_id          SERIAL PRIMARY KEY,
    skill_name        varchar(80)   NOT NULL,
    skill_description varchar(1024) NOT NULL,
    skill_rate        integer       NOT NULL
);

CREATE TABLE employees
(
    employee_id    SERIAL PRIMARY KEY,
    first_name    varchar(30)   NOT NULL,
    last_name     varchar(30)   NOT NULL,
    title         varchar(40)   NOT NULL,
    company       varchar(50)   NOT NULL,
    employee_bio   varchar(2000) NOT NULL,
    employee_photo BYTEA   NULL
);

CREATE TABLE skill_employees
(
    skill_id integer NOT NULL REFERENCES skills (skill_id),
    employee_id integer NOT NULL REFERENCES employees (employee_id)
);