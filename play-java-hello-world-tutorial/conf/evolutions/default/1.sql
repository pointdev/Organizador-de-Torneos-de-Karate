
# --- !Ups
#Participacion(codigo_participacion, kumite, kata, armas, rompimiento)

create table  participacion(
  codigo_participacion           varchar(10) not null,
  kumite                         varchar(10),
  kata                         varchar(10),
  armas                        varchar(10),
  rompimiento					varchar(10),
  constraint pk_par primary key (codigo_participacion)
);

#integer auto_increment para uto incrementar
# --- !Downs

drop table if exists participacion;

