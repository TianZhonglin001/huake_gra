package bean;

public class job {
    private Integer jid;

    private String jsno;

    private Integer jeno;

    private String jresume;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJsno() {
        return jsno;
    }

    public void setJsno(String jsno) {
        this.jsno = jsno == null ? null : jsno.trim();
    }

    public Integer getJeno() {
        return jeno;
    }

    public void setJeno(Integer jeno) {
        this.jeno = jeno;
    }

    public String getJresume() {
        return jresume;
    }

    public void setJresume(String jresume) {
        this.jresume = jresume == null ? null : jresume.trim();
    }
}