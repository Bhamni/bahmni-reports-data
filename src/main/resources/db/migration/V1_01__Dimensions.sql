CREATE TABLE location
(
    id serial NOT NULL,
    name varchar(160) NOT NULL,
    level varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE gender
(
    id serial NOT NULL,
    label varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE disease
(
    id serial NOT NULL,
    name varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE age
(
    id serial NOT NULL,
    age integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ageGroup
(
    id serial NOT NULL,
    minAge integer NOT NULL,
    maxAge integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE provider
(
    id serial NOT NULL,
    providerType varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE dateDimension
(
    id serial NOT NULL,
    date date NOT NULL,
    year integer NOT NULL,
    month integer NOT NULL,
    week integer NOT NULL,
    day integer NOT NULL,
    PRIMARY KEY (id)
);
