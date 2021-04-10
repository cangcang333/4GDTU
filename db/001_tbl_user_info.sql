
-- Create table tbl_user_info
CREATE TABLE tbl_user_info (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(16) NOT NULL,
  phone_number varchar(16),
  address varchar(32),
  reserved varchar(64),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF-8