INSERT INTO users (username, password, enabled)
VALUES ('admin', '$2a$04$cKGyXDw9fOEHZb9AY2FYR.phImsMppaYyFjYUSs6U1lVckjDl.Qae', TRUE);
INSERT INTO users (username, password, enabled)
VALUES ('user', '$2a$04$1aeXt9z35iKOq4pu6rW7/OJrxiq5QrbcgS66.ojwyyagCTu6tDiau', TRUE);

INSERT INTO `groups` (id, group_name)
VALUES (1, 'TODO_ADMIN_GROUP');
INSERT INTO `groups` (id, group_name)
VALUES (2, 'TODO_USER_GROUP');

INSERT INTO group_authorities (group_id, authority)
VALUES (1, 'TODO_ADD');
INSERT INTO group_authorities (group_id, authority)
VALUES (1, 'TODO_VIEW');

INSERT INTO group_authorities (group_id, authority)
VALUES (2, 'TODO_VIEW');

INSERT INTO group_members (id, username, group_id)
VALUES (1,'admin', 1);
INSERT INTO group_members (id, username, group_id)
VALUES (2,'user', 2);

INSERT INTO oauth_client_details (client_id,
                                  client_secret,
                                  resource_ids,
                                  scope,
                                  authorized_grant_types,
                                  access_token_validity,
                                  refresh_token_validity)
VALUES ('appclient',
        '$2a$04$jxtVfaaA3nvCJ1znV/zOZ.WCALlLL/gHdcYUAv6ilSHbGF1I2JXz.',
        'todoService',
        'read,write',
        'authorization_code,check_token,refresh_token,password',
        1000000,
        1000000);

commit;