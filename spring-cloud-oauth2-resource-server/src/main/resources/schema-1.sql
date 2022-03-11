drop table if exists users;
create table users
(
    username varchar(256) not null primary key,
    password varchar(256) not null,
    enabled boolean not null
);

drop table if exists `groups`;
create table `groups`
(
    id bigint primary key,
    group_name varchar(50) not null
);

drop table if exists group_authorities;
create table group_authorities
(
    group_id  bigint      not null,
    authority varchar(50) not null,
    constraint fk_group_authorities_group foreign key (group_id) references `groups` (id)
);

drop table if exists group_members;
create table group_members
(
    id       bigint primary key,
    username varchar(50) not null,
    group_id bigint      not null,
    constraint fk_group_members_group foreign key (group_id) references `groups` (id)
);

drop table if exists oauth_client_details;
create table oauth_client_details
(
    client_id               varchar(256) primary key,
    resource_ids            varchar(256),
    client_secret           varchar(256),
    scope                   varchar(256),
    authorized_grant_types  varchar(256),
    web_server_redirect_uri varchar(256),
    authorities             varchar(256),
    access_token_validity   integer,
    refresh_token_validity  integer,
    additional_information  varchar(4096),
    autoapprove             varchar(256)
);

drop table if exists oauth_access_token;
create table oauth_access_token
(
    token_id          VARCHAR(256),
    token BLOB,
    authentication_id VARCHAR(256) PRIMARY KEY,
    user_name         VARCHAR(256),
    client_id         VARCHAR(256),
    authentication BLOB,
    refresh_token     VARCHAR(256)
);

drop table if exists oauth_refresh_token;
create table oauth_refresh_token
(
    token_id VARCHAR(256),
    token BLOB,
    authentication BLOB
);