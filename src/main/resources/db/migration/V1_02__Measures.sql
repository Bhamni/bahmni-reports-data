CREATE TABLE appointment
(
    id serial NOT NULL,
    appointmentTypeId int NOT NULL references appointmentType(id),
    diseaseId int NOT NULL references disease(id),
    appointmentDateId int NOT NULL references dateDimension(id),
    patientGenderId int NOT NULL references gender(id),
    providerId int NOT NULL references provider(id),
    ageId int NOT NULL references age(id),
    ageGroupId int NOT NULL references ageGroup(id),
    PRIMARY KEY (id)
);

CREATE TABLE patient
(
    id serial NOT NULL,
    firstName varchar(160) NOT NULL,
    lastName varchar(160) NOT NULL,
    ageId int NOT NULL references age(id),
    genderId int NOT NULL references gender(id),
    locationId int NOT NULL references location(id),
    PRIMARY KEY (id)
);

CREATE TABLE diagnosis
(
    id serial NOT NULL,
    patientId int NOT NULL references patient(id),
    diseaseId int NOT NULL references disease(id),
    patientGenderId int NOT NULL references gender(id),
    ageId int NOT NULL references age(id),
    ageGroupId int NOT NULL references ageGroup(id),
    locationId int NOT NULL references location(id),
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
    locationId int NOT NULL references location(id),
    observationDateId int NOT NULL references dateDimension(id),
    PRIMARY KEY (id)
);

CREATE TABLE orderMeasure
(
    id serial NOT NULL,
    type varchar(160) NOT NULL,
    instructions varchar(160) NOT NULL,
    orderer varchar(160) NOT NULL,
    startDateId int NOT NULL references dateDimension(id),
    autoExpireDateId int NOT NULL references dateDimension(id),
    PRIMARY KEY (id)
);

CREATE TABLE referral
(
    id serial NOT NULL,
    referralType varchar(160) NOT NULL,
    providerId int NOT NULL references provider(id),
    PRIMARY KEY (id)
);

CREATE TABLE encounter
(
    id serial NOT NULL,
    encounterTypeId int NOT NULL references encounterType(id),
    diseaseId int NOT NULL references disease(id),
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

