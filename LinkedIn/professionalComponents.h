class Job 
{
    private:
        int jobId;
        string jobTitle;
        time_t dateOfPosting;
        string description;
        CompanyPage company;
        string employeeType;
        Address location;
        JobStatus status;
};

class CompanyPage
{
    private:
        int pageId;
        string name;
        string description;
        string type;
        int companySize;
        User createdBy;
        vector< Job > jobs;
    public:
        bool createJobPosting();
        bool deleteJobPosting( Job job );

};

class Group : public subject 
{
    private:
        int groupId;
        string name;
        string description;
        int totalMembers;
        vector< Observer > members;

    public: 
    bool updateDescription();
    
    void attach( Observer & observer )
    {
        // implement 
    }
    void detach( Observer & observer )
    {
        // implement 
    }
    void notify( Observer & observer )
    {
        // implement 
    }
};