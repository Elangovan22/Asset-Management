create table AMS_INSTANCE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ varchar(255),
    NAME varchar(255),
    COMPANY varchar(255),
    MODELNAME varchar(255),
    NEEDEDQUANTITY integer,
    TEAMVIEWER integer,
    STATUS varchar(255),
    TOTALQUANTITY integer,
    --
    primary key (ID)
);
