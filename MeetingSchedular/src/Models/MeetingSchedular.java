package Models;

import java.util.List;

public class MeetingSchedular {
    private Calendar calendar;
    private List< MeetingRoom > rooms;
    private User organiser;
    private static MeetingSchedular instance = null ;
    private MeetingSchedular()
    {

    }
    

    public boolean scheduleMeeting( List< User > users , Interval interval )
    {
        return true;
    }
    public boolean bookRoom( MeetingRoom room , int numberOfPerson , Interval interval )
    {
        return true;
    }
    public boolean cancelMeeting( List< User > users , Interval interval)
    {   
        return true;
    }
    public boolean releaseRoom( MeetingRoom room , Interval interval)
    {
        return true;
    }
    // Singleton
    public static MeetingSchedular getInstance()
    {
        if( instance ==  null )
        {
            instance = new MeetingSchedular();
        }
        return instance;
    }
}
