INSERT INTO `role` VALUES (1,'ADMIN');
delete from user_choice_match;
delete from ipl_matches;

/*insert into matches  values (1,10,1,2 ,1, 'MI vs CSK','2010-01-01');*/
/*insert into matches  values (2,10,1,2 ,1, 'KXIP vs DD','2010-01-01');*/
delete from ipl_teams;

insert into ipl_teams values (1,'Chennai Super Kings');
insert into ipl_teams values(2,'Mumbai Indians');
insert into ipl_teams values(3,'Delhi Daredevils');
insert into ipl_teams values(4,'Kolkata Knight Riders');
insert into ipl_teams values(5,'Royal Challengers Bangalore');
insert into ipl_teams values(6,'Rajasthan Royals');
insert into ipl_teams values(7,'Kings XI Punjab');
insert into ipl_teams values(8,'Sunrisers Hyderabad');


  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (1,'2018-04-7',2,1,'Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (2,'2018-04-8',3,7,'Delhi','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (3,'2018-04-8',4,5,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (4,'2018-04-9',8,6,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (5,'2018-04-10',1,4,'Chennai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (6,'2018-04-11',6,3,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (7,'2018-04-12',8,2,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (8,'2018-04-13',5,7,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (9,'2018-04-14',2,3,'Mumbai','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (10,'2018-04-14',4,8,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (11,'2018-04-15',5,6,'Bangalore','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (12,'2018-04-15',7,1,'Indore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (13,'2018-04-16',4,3,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (14,'2018-04-17',2,5,'Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (15,'2018-04-18',6,4,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (16,'2018-04-19',7,8,'Indore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (17,'2018-04-20',1,6,'Chennai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (18,'2018-04-21',4,7,'Kolkata','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (19,'2018-04-21',3,5,'Delhi','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (20,'2018-04-22',8,1,'Hyderabad','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (21,'2018-04-22',6,2,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (22,'2018-04-22',6,2,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (23,'2018-04-23',7,3,'Indore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (24,'2018-04-24',2,8,'Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (25,'2018-04-25',5,1,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (26,'2018-04-26',8,7,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (27,'2018-04-27',3,4,'Delhi','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (28,'2018-04-28',1,2,'Chennai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (29,'2018-04-29',6,8,'Jaipur','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (30,'2018-04-29',5,4,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (31,'2018-04-30',1,3,'Chennai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (32,'2018-05-1',5,2,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (33,'2018-05-2',3,6,'Delhi','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (34,'2018-05-3',4,1,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (35,'2018-05-4',7,2,'Mohali','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (36,'2018-05-5',1,5,'Chennai','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (37,'2018-05-5',8,3,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (38,'2018-05-6',2,4,'Mumbai','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (39,'2018-05-6',7,6,'Mohali','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (40,'2018-05-7',8,5,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (41,'2018-05-8',6,7,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (42,'2018-05-9',4,2,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (43,'2018-05-10',3,8,'Delhi','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (44,'2018-05-11',6,1,'Jaipur','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (45,'2018-05-12',7,4,'Mohali','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (46,'2018-05-12',5,3,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (47,'2018-05-13',1,8,'Chennai','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (48,'2018-05-13',2,6,'Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (49,'2018-05-14',7,5,'Mohali','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (50,'2018-05-15',4,6,'Kolkata','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (51,'2018-05-16',2,7,'Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (52,'2018-05-17',5,8,'Bangalore','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (53,'2018-05-18',3,1,'Delhi','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (54,'2018-05-19',6,5,'Jaipur','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (55,'2018-05-19',8,4,'Hyderabad','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (56,'2018-05-20',3,2,'Delhi','4:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (57,'2018-05-20',1,7,'Chennai','8:00 PM',10);
 /* insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (58,'2018-05-22','Qualifier 1','Qualifier 1','Mumbai','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (59,'2018-05-23','Eliminator','Eliminator','TBC','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (60,'2018-05-25','Qualifier 2','Qualifier 2','TBC','8:00 PM',10);
  insert into ipl_matches(id,date,team1id,team2id,venue,time,price)  values (61,'2018-05-27','Final','Final','Mumbai','8:00 PM',10);
*/

