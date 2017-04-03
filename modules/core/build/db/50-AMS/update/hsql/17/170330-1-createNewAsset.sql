create table AMS_NEW_ASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_ID varchar(36),
    ASSETID integer not null,
    COMPANY varchar(255) not null,
    MODELNAME varchar(255) not null,
    QUANTITY integer not null,
    AVAILABLEQUANTITY integer not null,
    COST integer,
    PURCHASEDATE date,
    --
    primary key (ID)
);
