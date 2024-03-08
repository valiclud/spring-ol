CREATE TABLE IF NOT EXISTS original_text (
                                 ID IDENTITY,
                                 author varchar(255) NOT NULL,
                                 title varchar(255) NOT NULL,
                                 text longtext NOT NULL,
                                 text_img longblob  NULL,
                                 century int NOT NULL,
                                 insert_date date NOT NULL,
                                 hits int NOT NULL,
                                 place_id int(11),
                                 old_language_id int(11)
)

CREATE TABLE IF NOT EXISTS  translated_text (
                                   ID IDENTITY,
                                   author varchar(255),
                                   title varchar(255),
                                   text longtext,
                                   language varchar(255),
                                   insert_date date,
                                   revision int,
                                   original_text_id int(11)
)
CREATE TABLE IF NOT EXISTS place (
                         ID IDENTITY,
                         old_place varchar(255) NOT NULL,
                         country varchar(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS old_language (
                                ID IDENTITY,
                                language varchar(255) NOT NULL,
                                period varchar(255) NOT NULL
)
CREATE TABLE IF NOT EXISTS pagination (
                              ID IDENTITY,
                              controller_name varchar(255) NOT NULL,
                              results int(11) NOT NULL
)

CREATE TABLE IF NOT EXISTS author (
                          ID IDENTITY,
                          email varchar(255) NOT NULL,
                          password varchar(255) NOT NULL

)

alter table translated_text
    add foreign key (original_text_id) references original_text(id);
alter table original_text
    add foreign key (old_language_id) references old_language(id);
alter table original_text
    add foreign key (place_id) references place(id);
