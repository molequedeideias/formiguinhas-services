-- ----------------------------
--
-- ----------------------------
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;
LOCK TABLES `Usuario` WRITE;

BEGIN;

INSERT INTO `Usuario` (id, login,email,nome,password) VALUES ( '1', 'admin', 'nlessa@molequedeideias.net', 'Admin', 'admin');


COMMIT;

UNLOCK TABLES;
SET FOREIGN_KEY_CHECKS = 1;