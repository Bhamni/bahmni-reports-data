CREATE TABLE appointment
(
    id serial NOT NULL,
    appointmentType varchar(160) NOT NULL,
    diseaseId varchar(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE patient
(
    id serial NOT NULL,
    firstName varchar(160) NOT NULL,
    lastName varchar(160) NOT NULL,
    ageId varchar(10) NOT NULL,
    genderId varchar(10) NOT NULL,
    locationId varchar(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE diagnosis
(
    id serial NOT NULL,
    patientId varchar(160) NOT NULL,
    diseaseId varchar(160) NOT NULL,
    ageGroupId varchar(10) NOT NULL,
    locationId varchar(10) NOT NULL,
    diagnosisStatus varchar(160) NOT NULL,
    diagnosisType varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

