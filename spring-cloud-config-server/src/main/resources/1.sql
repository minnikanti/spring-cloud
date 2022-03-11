create table PROPERTIES
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    application VARCHAR(200),
    profile     VARCHAR(200),
    label       VARCHAR(200),
    `key`         VARCHAR(200),
    value       VARCHAR(200),
    primary key (id)
);
