package com.mybatis.pojo;

public class Student {
    /*CREATE TABLE student (
    s_id       INT AUTO_INCREMENT
        PRIMARY KEY,
    s_no       CHAR(12)      NOT NULL,
    s_name     VARCHAR(10)   NOT NULL,
    s_gen      CHAR(2)       NULL,
    s_birth    DATE          NULL,
    s_dept_id  INT DEFAULT 1 NULL,
    s_class_id INT           NULL,
);*/
    private int s_id;
    private String s_no;
    private String s_name;
    private String s_gen;
    private String s_birth;
    private int s_dept_id;
    private int s_class_id;

    public Student() {
    }

    public Student(int s_id, String s_no, String s_name, String s_gen, String s_birth, int s_dept_id, int s_class_id) {
        this.s_id = s_id;
        this.s_no = s_no;
        this.s_name = s_name;
        this.s_gen = s_gen;
        this.s_birth = s_birth;
        this.s_dept_id = s_dept_id;
        this.s_class_id = s_class_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_no() {
        return s_no;
    }

    public void setS_no(String s_no) {
        this.s_no = s_no;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_gen() {
        return s_gen;
    }

    public void setS_gen(String s_gen) {
        this.s_gen = s_gen;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
    }

    public int getS_dept_id() {
        return s_dept_id;
    }

    public void setS_dept_id(int s_dept_id) {
        this.s_dept_id = s_dept_id;
    }

    public int getS_class_id() {
        return s_class_id;
    }

    public void setS_class_id(int s_class_id) {
        this.s_class_id = s_class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_no='" + s_no + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_gen='" + s_gen + '\'' +
                ", s_birth='" + s_birth + '\'' +
                ", s_dept_id=" + s_dept_id +
                ", s_class_id=" + s_class_id +
                '}';
    }
}
