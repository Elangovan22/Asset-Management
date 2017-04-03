<<<<<<< HEAD
-- begin AMS_NEW_ASSET
create table AMS_NEW_ASSET (
=======
-- begin ASSETMANAGEMENT_NEW__ASSET
create table ASSETMANAGEMENT_NEW__ASSET (
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
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
=======
    ASSET_ID varchar(255) not null,
    ASSET_NAME_ID varchar(36) not null,
    COMPANY varchar(255),
    STATUS integer not null,
    MODEL_NO varchar(255),
    SERIAL_NO varchar(255),
    PURCHASE_DATE date,
    COST varchar(255),
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_NEW__ASSET
-- begin ASSETMANAGEMENT_REQUEST
create table ASSETMANAGEMENT_REQUEST (
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
    STATE varchar(255),
    PLACE varchar(255),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end AMS_SUPLIER
-- begin AMS_INSTANCE
create table AMS_INSTANCE (
=======
    ASSET_NAME_ID varchar(36) not null,
    USER_NAME_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_REQUEST
-- begin ASSETMANAGEMENT_STATUS
create table ASSETMANAGEMENT_STATUS (
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
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
=======
    ASSET_DETAIL_ID varchar(36) not null,
    STATUS integer not null,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_STATUS
-- begin ASSETMANAGEMENT_SUPPLIER
create table ASSETMANAGEMENT_SUPPLIER (
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
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
=======
    SUPPLIER__NAME varchar(255) not null,
    CITY varchar(255) not null,
    STATE varchar(255) not null,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_SUPPLIER
-- begin ASSETMANAGEMENT_NEW__ASSET_SUPPLIER_LINK
create table ASSETMANAGEMENT_NEW__ASSET_SUPPLIER_LINK (
    NEW__ASSET_ID varchar(36) not null,
    SUPPLIER_ID varchar(36) not null,
    primary key (NEW__ASSET_ID, SUPPLIER_ID)
)^
-- end ASSETMANAGEMENT_NEW__ASSET_SUPPLIER_LINK
-- begin ASSETMANAGEMENT_ASSET
create table ASSETMANAGEMENT_ASSET (
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
<<<<<<< HEAD
    USER_ varchar(255),
    ASSETID integer,
    COMPANY varchar(255),
    MODELNAME varchar(255),
    QUANTITY integer,
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end AMS_ASSET_ALLOCATED
=======
    ASSET_NAME varchar(255),
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_ASSET
>>>>>>> 16716aadcd30f689e4d1c39cb5ad9f92924a1cd3
