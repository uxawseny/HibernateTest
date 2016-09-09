package entity;

import javax.persistence.*;

/**
 * Student实体类
 */
@Entity
@Table(name = "student", schema = "hibernatetest", catalog = "")
public class StudentEntity {
    private int sid;
    private String sname;
    private String sgender;

    public StudentEntity() {
    }

    public StudentEntity(int sid,String sname, String sgender) {
        this.sid = sid;
        this.sname = sname;
        this.sgender = sgender;
    }

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "sgender")
    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sgender != null ? !sgender.equals(that.sgender) : that.sgender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sgender != null ? sgender.hashCode() : 0);
        return result;
    }
}
