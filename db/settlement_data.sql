CREATE TABLE settlement_data (
  point_name varchar(10) NOT NULL COMMENT '测点名称',
  time varchar(30) DEFAULT NULL COMMENT '采集时间',
  settling_value varchar(20) DEFAULT NULL COMMENT '位移',
  PRIMARY KEY (point_name))
  ENGINE=InnoDB DEFAULT CHARSET=utf8