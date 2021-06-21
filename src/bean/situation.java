package bean;

public class situation {
    private String sno;

    private String sname;

    private String smajor;

    private Integer schoose;

    private String scompany;

    private String scompanyOwner;

    private String slink;

    private String sjob;

    private Integer sright;

    private Integer stag;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor == null ? null : smajor.trim();
    }

    public Integer getSchoose() {
        return schoose;
    }

    public void setSchoose(Integer schoose) {
        this.schoose = schoose;
    }

    public String getScompany() {
        return scompany;
    }

    public void setScompany(String scompany) {
        this.scompany = scompany == null ? null : scompany.trim();
    }

    public String getScompanyOwner() {
        return scompanyOwner;
    }

    public void setScompanyOwner(String scompanyOwner) {
        this.scompanyOwner = scompanyOwner == null ? null : scompanyOwner.trim();
    }

    public String getSlink() {
        return slink;
    }

    public void setSlink(String slink) {
        this.slink = slink == null ? null : slink.trim();
    }

    public String getSjob() {
        return sjob;
    }

    public void setSjob(String sjob) {
        this.sjob = sjob == null ? null : sjob.trim();
    }

    public Integer getSright() {
        return sright;
    }

    public void setSright(Integer sright) {
        this.sright = sright;
    }

    public Integer getStag() {
        return stag;
    }

    public void setStag(Integer stag) {
        this.stag = stag;
    }
}