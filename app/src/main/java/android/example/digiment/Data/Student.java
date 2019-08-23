package android.example.digiment.Data;

public class Student {

    private String name,branch,rollno,libid,sec,mobno,mail,dob,fname,mname,addr;

    public Student() {
    }

    public Student(String name, String branch, String rollno, String libid, String sec, String mobno, String mail, String dob, String fname, String mname,String addr) {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
        this.libid = libid;
        this.sec = sec;
        this.mobno = mobno;
        this.mail = mail;
        this.dob = dob;
        this.fname = fname;
        this.mname = mname;
        this.addr=addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getLibid() {
        return libid;
    }

    public void setLibid(String libid) {
        this.libid = libid;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
