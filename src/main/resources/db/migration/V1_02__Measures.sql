CREATE TABLE appointment
(
    id serial NOT NULL,
    appointmentTypeId varchar(10) NOT NULL,
    diseaseId varchar(10) NOT NULL,
    appointmentDateId varchar(10) NOT NULL,
    patientGenderId varchar(10) NOT NULL,
    providerId varchar(10) NOT NULL,
    ageId varchar(10) NOT NULL,
    ageGroupId varchar(10) NOT NULL,
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
    patientGenderId varchar(10) NOT NULL,
    ageId varchar(10) NOT NULL,
    ageGroupId varchar(10) NOT NULL,
    locationId varchar(10) NOT NULL,
    diagnosisStatus varchar(160) NOT NULL,
    diagnosisType varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE observation
(
    id serial NOT NULL,
    name varchar(160) NOT NULL,
    value varchar(160) NOT NULL,
    unit varchar(160) NOT NULL,
    comment varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE orderMeasure
(
    id serial NOT NULL,
    name varchar(160) NOT NULL,
    type varchar(160) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE referral
(
    id serial NOT NULL,
    referralType varchar(160) NOT NULL,
    providerId varchar(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE encounter
(
    id serial NOT NULL,
    encounterTypeId varchar(10) NOT NULL,
    diseaseId varchar(10) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE payment
(
    id serial NOT NULL,
    paid varchar(20) NOT NULL,
    amount float(20) NOT NULL,
    discount float(20) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE visit
(
    id serial NOT NULL,
    visitType varchar(20) NOT NULL,
    admissionStatus varchar(20) NOT NULL,
    PRIMARY KEY (id)
);

