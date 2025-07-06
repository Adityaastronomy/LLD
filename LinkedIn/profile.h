class Experience
{
    private:
        string title;
        string company;
        Address location;
        time_t startDate;
        time_t endDate;
        string desciption;
};

class Education
{
    private:
    string school;
    string degree;
    time_t startDate;
    time_t endDate;
    string descp;

};

class Skill
{
    private:
    string name;
};

class Profile 
{
    private:
        string headline;
        string about;
        string gender;
        vector< signed char > profilePicture;
        vector< signed char > coverPhoto;

        vector< Experience > experiences;
        vector< Education > educations;
        vector< Skill > skills;

        vector< Achievement > achievements;
        vector< Recommendation > recommendation;
        Analytics analytics;

    public:
        bool addExperience( Experience experience );
        bool addEducation( Education education );
        bool addSkill( Skill skill );
        bool addAchievement( Achievement acheivement );

};