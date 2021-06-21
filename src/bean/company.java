package bean;

public class company {
    private Integer eno;

    private String ename;

    private Integer type;

    private String abstrut;

    private String jobname;

    private String jobstrut;

    private Integer salary;

    private String email;

    private Integer linkphone;

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAbstrut() {
        return abstrut;
    }

    public void setAbstrut(String abstrut) {
        this.abstrut = abstrut == null ? null : abstrut.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobstrut() {
        return jobstrut;
    }

    public void setJobstrut(String jobstrut) {
        this.jobstrut = jobstrut == null ? null : jobstrut.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(Integer linkphone) {
        this.linkphone = linkphone;
    }
}