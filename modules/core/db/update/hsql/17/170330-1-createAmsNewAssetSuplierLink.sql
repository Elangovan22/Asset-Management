create table AMS_NEW_ASSET_SUPLIER_LINK (
    NEW_ASSET_ID varchar(36) not null,
    SUPLIER_ID varchar(36) not null,
    primary key (NEW_ASSET_ID, SUPLIER_ID)
);
