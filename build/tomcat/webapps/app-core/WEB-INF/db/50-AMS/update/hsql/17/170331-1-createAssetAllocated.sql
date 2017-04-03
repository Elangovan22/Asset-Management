create table AMS_ASSET_ALLOCATED (
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
    ASSETID integer,
    COMPANY varchar(255),
    MODELNAME varchar(255),
    QUANTIY integer,
    NAME varchar(255),
    --
    primary key (ID)
);
