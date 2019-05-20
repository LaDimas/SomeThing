USE test;

DROP TABLE IF EXISTS part;

CREATE TABLE parts (
id INT(11) NOT NULL AUTO_INCREMENT,
title VARCHAR(255) NOT NULL,
required TINYINT(1) NOT NULL DEFAULT FALSE,
quantity INT(11) NOT NULL,
PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO test.parts (title, required, quantity) VALUES

('Корпус',                           1, 3),
('Блок питания',                     1, 5),
('Материнская плата',                1, 2),
('Процессор',					     1, 7),
('Вентилятор процессора',    		 1, 1),
('Вентилятор для корпуса',           0, 1),
('Кабель SATA',                      1,10),
('HDD', 			                 1, 3),
('SSD',                              0, 5),
('Видеокарта',                       1, 2),
('Переходник кабеля питания',        0,18),
('Сетевой кабель',                   0, 9),
('Звуковая карта',   				 0,11),
('Привод CD/DVD',		             1, 6),
('Привод Blue - Ray',                0, 2),
('USD - адаптер',                    1, 4),
('PCI - адаптер',                    0, 5),
('Wi - Fi - адаптер',                0, 2),
('Ethernet - адаптер',               1, 7),
('Подсветка корпуса',                0, 1),
('ТВ - тюнер',                       0, 3),
('FM - тюнер',                       0, 2),
('Карта видеозахвата',               0, 1),
('Bluetooth - адаптер',              0, 11),
('Картридер',                        0, 6);