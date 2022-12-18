create table team(
    id serial primary key,
    name varchar
);

create table player(
    id serial primary key,
    name varchar not null,
    number int,
    team_id int
        constraint player_team_id references team(id)
);

create table sponsor(
    id serial primary key,
    name varchar not null,
    team_id int
        constraint sponsor_team_id references team(id)
);

create table match(
  home_team_id int
    constraint home_team_id_fk references team(id),
  away_team_id int
    constraint away_team_id_fk references team(id),
  datetime date not null,
  stadium varchar
);