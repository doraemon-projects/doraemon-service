CREATE TABLE IF NOT EXISTS DORM_LOOKUP_CLASSIFY
(
    ID                   BIGINT       NOT NULL COMMENT '主键',
    CREATED_BY           VARCHAR(32)  NOT NULL COMMENT '创建人',
    CREATED_DATE         TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    LAST_MODIFIED_BY     VARCHAR(32)  NOT NULL COMMENT '最后更新人',
    LAST_MODIFIED_DATE   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
    CLASSIFY_CODE        VARCHAR(255) NOT NULL COMMENT '快码分类CODE',
    CLASSIFY_DESC        VARCHAR(255) NULL COMMENT '快码分类描述',
    CLASSIFY_PARENT_CODE VARCHAR(255) NULL COMMENT '父快码分类CODE',
    NAME                 VARCHAR(255) NOT NULL COMMENT '快码分类名称',
    STATUS               INT          NULL,
    PRIMARY KEY (ID)
) COMMENT ='快码分类', ENGINE = INNODB;