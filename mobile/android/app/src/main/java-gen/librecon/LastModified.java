package librecon;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LAST_MODIFIED.
 */
public class LastModified {

    private Long id;
    private String assistants;
    private String expositors;
    private String schedules;
    private String meetings;
    private String txokos;
    private String sponsors;

    public LastModified() {
    }

    public LastModified(Long id) {
        this.id = id;
    }

    public LastModified(Long id, String assistants, String expositors, String schedules, String meetings, String txokos, String sponsors) {
        this.id = id;
        this.assistants = assistants;
        this.expositors = expositors;
        this.schedules = schedules;
        this.meetings = meetings;
        this.txokos = txokos;
        this.sponsors = sponsors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssistants() {
        return assistants;
    }

    public void setAssistants(String assistants) {
        this.assistants = assistants;
    }

    public String getExpositors() {
        return expositors;
    }

    public void setExpositors(String expositors) {
        this.expositors = expositors;
    }

    public String getSchedules() {
        return schedules;
    }

    public void setSchedules(String schedules) {
        this.schedules = schedules;
    }

    public String getMeetings() {
        return meetings;
    }

    public void setMeetings(String meetings) {
        this.meetings = meetings;
    }

    public String getTxokos() {
        return txokos;
    }

    public void setTxokos(String txokos) {
        this.txokos = txokos;
    }

    public String getSponsors() {
        return sponsors;
    }

    public void setSponsors(String sponsors) {
        this.sponsors = sponsors;
    }

}
