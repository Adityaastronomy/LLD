package Models;

import java.util.List;

public class MeetingSchedulingSystem {
    private MeetingSchedular schedular;
    private List<MeetingRoom > meetingRooms;
    private List< User > users;
    private MeetingSchedulingSystem()
    {

    }
    private static MeetingSchedulingSystem instance = null ;

    public void addRoom()
    {

    }
    public void removeRoom()
    {

    }
    public void scheduleMeeting( List< User > users , Interval interval )
    {
        schedular.scheduleMeeting(users, interval ); 
    }
    public void cancelMeeting(User user , Interval interval )
    {
        schedular.cancelMeeting(users, interval );
    }

    // singleton
    public static MeetingSchedulingSystem getInstance()
    {
        if( instance == null )
        {
            instance = new MeetingSchedulingSystem();
        }
        return instance;
    }
}   
