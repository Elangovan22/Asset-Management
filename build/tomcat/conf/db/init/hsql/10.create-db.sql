-- begin AMS_NEW_ASSET
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
    STATUS integer not null,
    --
    primary key (ID)
)^
-- end AMS_NEW_ASSET
-- begin AMS_ASSET
create table AMS_ASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end AMS_ASSET
-- begin AMS_SUPLIER
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
)^
-- end AMS_SUPLIER
-- begin AMS_INSTANCE
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
    TOTALQUANTITY integer,
    NEEDEDQUANTITY integer,
    TEAMVIEWER integer,
    ASSETID integer,
    --
    primary key (ID)
)^
-- end AMS_INSTANCE
-- begin AMS_REQUEST_ASSET
create table AMS_REQUEST_ASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end AMS_REQUEST_ASSET
-- begin AMS_RESPONCE__REQUEST
create table AMS_RESPONCE__REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end AMS_RESPONCE__REQUEST
-- begin AMS_NEW_ASSET_SUPLIER_LINK
create table AMS_NEW_ASSET_SUPLIER_LINK (
    NEW_ASSET_ID varchar(36) not null,
    SUPLIER_ID varchar(36) not null,
    primary key (NEW_ASSET_ID, SUPLIER_ID)
)^
-- end AMS_NEW_ASSET_SUPLIER_LINK
-- begin AMS_ASSET_ALLOCATED
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
)^
-- end AMS_ASSET_ALLOCATED
