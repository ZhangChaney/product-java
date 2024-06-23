create table product
(
    product_id   int auto_increment
        primary key,
    product_name varchar(32)                not null comment '商品名称',
    amount       int           default 0    null comment '商品数量',
    price        decimal(6, 2) default 0.00 not null comment '商品价格',
    type         varchar(16)                null comment '商品分类'
)
    comment '商品数据表';

create table user
(
    userid   int auto_increment comment '用户id'
        primary key,
    username varchar(64) not null comment '用户名',
    password varchar(64) not null comment '用户密码',
    phone    varchar(11) null comment '用户手机号',
    email    varchar(64) not null comment '电子邮箱',
    constraint user_pk
        unique (username)
)
    row_format = DYNAMIC;

