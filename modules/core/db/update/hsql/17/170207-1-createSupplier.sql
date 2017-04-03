create table ASSETMANAGEMENT_SUPPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SUPPLIER varchar(255),
    DISTRICT varchar(255),
    STATE varchar(255),
    --
    primary key (ID)
);
