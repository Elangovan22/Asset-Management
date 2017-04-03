create table AMS_SUPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATE varchar(255),
    PLACE varchar(255),
    NAME varchar(255),
    --
    primary key (ID)
);
