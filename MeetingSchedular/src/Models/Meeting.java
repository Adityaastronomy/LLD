package Models;

import java.util.List;

public class Meeting {
    private int id;
    private MeetingRoom room;
    private Interval interval;
    private String subject;
    private List< User > invitees;
    private String senderName;
    private User sender;

    public void addInMeeting( List< User > attendees)
    {

    }
    public void removeFromMeeting( User user)
    {

    }
}
