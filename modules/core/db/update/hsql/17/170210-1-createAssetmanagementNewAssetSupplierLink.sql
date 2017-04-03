create table ASSETMANAGEMENT_NEW__ASSET_SUPPLIER_LINK (
    NEW__ASSET_ID varchar(36) not null,
    SUPPLIER_ID varchar(36) not null,
    primary key (NEW__ASSET_ID, SUPPLIER_ID)
);
