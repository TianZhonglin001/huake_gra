package bean;

public class toudang {
    private Integer sno;

    private String resumeno;

    private String jobno;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getResumeno() {
        return resumeno;
    }

    public void setResumeno(String resumeno) {
        this.resumeno = resumeno == null ? null : resumeno.trim();
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }
}