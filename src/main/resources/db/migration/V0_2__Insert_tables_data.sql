insert into team(name) values
    ('FC Barcelona'),
    ('Real Madrid CF'),
    ('Paris Saint-Germain'),
    ('Manchester City'),
    ('Manchester United'),
    ('Atlético de Madrid')
;

insert into player(name,number,team_id) values
    ('Robert Lewandowski',9,1),
    ('Lionel Messi',30,3),
    ('Luka Modric',10,2),
    ('Bruno Fernandes',8,5),
    ('Erling Haaland',9,4),
    ('Sergio Busquets',5,1),
    ('Karim Benzema',9,2),
    ('Casemiro',18,5),
    ('Kevin De Bruyne',17,4),
    ('Neymar Jr',10,3)
;

insert into sponsor(name) values
    ('Etihad Airways'),
    ('TeamViewer'),
    ('Spotify'),
    ('Qatar Airways'),
    ('Emirates')
;

insert into have_sponsor(team_id,sponsor_id) values
    (1,3),
    (2,5),
    (3,4),
    (4,1),
    (5,2)
;

insert into match(home_team_id,away_team_id,datetime,stadium) values
    (1,3,'2023-01-12T20:25:24.00Z','Camp Nou'),
    (4,5,'2023-01-15T20:25:24.00Z','Etihad Stadium'),
    (3,2,'2023-02-18T20:25:24.00Z','Parc Des Princes')
;