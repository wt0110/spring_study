CREATE TABLE IF NOT EXISTS `rank`(
    `momoid` CHAR(100) PRIMARY KEY,
    `name` CHAR(100),
    `photo` TEXT,
    `gotoStr` TEXT,  
    `roomid` CHAR(100),
    `ifFollow` BOOLEAN,
    `ifLive` BOOLEAN,
    `rank` INT,
    `score` INT,
    `rewardText` TEXT
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO rank(momoid, name, photo, gotoStr, ifFollow, ifLive, rank,score, rewardText) VALUES('420495510', '好', 'jpg', '查看资料', False, False, 1, 298566710,'奖金5000元')