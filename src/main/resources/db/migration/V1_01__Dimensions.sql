CREATE TABLE location
(
    id int(11) NOT NULL auto_increment,
    name varchar(160) NOT NULL,
    level varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE gender
(
    id int(11) NOT NULL auto_increment,
    label varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE disease
(
    id int(11) NOT NULL auto_increment,
    name varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE age
(
    id int(11) NOT NULL auto_increment,
    age integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ageGroup
(
    id int(11) NOT NULL auto_increment,
    minAge integer NOT NULL,
    maxAge integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE provider
(
    id int(11) NOT NULL auto_increment,
    providerType varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE dateDimension
(
    id int(11) NOT NULL auto_increment,
    date date NOT NULL,
    year integer NOT NULL,
    month integer NOT NULL,
    week integer NOT NULL,
    day integer NOT NULL,
    PRIMARY KEY (id)
);
