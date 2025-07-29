create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(500) not null unique,
    fecha_creacion datetime not null,
    status char(50) not null,
    autor varchar(100) not null,

    primary key(id)
);