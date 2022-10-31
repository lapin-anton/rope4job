create table site (
    id serial primary key,
    name text,
    url text
);

create table city (
    id serial primary key,
    name text
);

create table company (
    id serial primary key,
    name text
);

create table vacancy (
    id serial primary key,
    site_id integer,
    title text,
    company_id integer,
    city_id integer,
    salary text,
    description text,
    skills text,
    url text unique,
    foreign key (site_id) references site(id),
    foreign key (company_id) references company(id),
    foreign key (city_id) references city(id)
);