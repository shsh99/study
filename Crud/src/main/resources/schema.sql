create table user
(
    id               int primary key auto_increment,
    username         varchar(30) unique         not null,
    password         varchar(255)               not null,
    name             varchar(30)                not null,
    email            varchar(30) unique         not null,
    random_name      varchar(30) default null,
    role             varchar(30) default 'none' not null,
    aware_role       boolean     default false  not null,
    prev_contributor boolean     default false  not null,
    prev_receiver    boolean     default false  not null,
    is_admin         boolean     default false  not null
);
create table `match`
(
    id        int primary key auto_increment,
    title     varchar(255)               not null,
    match_ymd date         default now() not null,
    round     int                        not null,
    `status`  varchar(100) default false not null,
    result    boolean      default null
);

create table user_match
(
    id             int primary key auto_increment,
    user_id        int                   not null,
    match_id       int                   not null,
    is_contributor boolean default false not null,
    is_receiver    boolean default false not null,
    constraint foreign key (user_id) references user (id),
    constraint foreign key (match_id) references `match` (id)
);

create table action
(
    id             int primary key auto_increment,
    type           varchar(100)  not null,
    match_id       int           not null,
    task           text          not null,
    recommendation int default 0 not null,
    constraint foreign key (match_id) references `match` (id)
);

create table comment
(
    id       int primary key auto_increment,
    user_id  int                    not null,
    match_id int                    not null,
    writer   varchar(30)            not null,
    content  text                   not null,
    write_at datetime default now() not null,
    edited   boolean  default false not null,
    constraint foreign key (user_id) references user (id),
    constraint foreign key (match_id) references `match` (id)
);