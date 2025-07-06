class Search 
{
    public:
        virtual vector< User > searchUser( string name ) = 0;
        virtual vector< CompanyPage > searchCompany( string name ) = 0;
        virtual vector< Group > searchGroup( string name ) = 0;
        virtual vector< Job > searchJob( string title ) = 0;
};

class SearchCatalog : public Search 
{
    private :
        map< string , vector< User >> users;
        map< string , vector< CompanyPage >> companies;
        map< string , vector< Job >> jobs;
        map< string , vector< Group >> groups;

        public:
            void addNewUser( User user );
            void addNewCompany( CompanyPage company );
            void addNewGroup( Group group );
            void addNewJob( Job job );
            vector< User > searchUser( string name )
            {
                // implement 
            }
            vector< CompanyPage > searchCompany( string name )
            {
                // implement
            }
            vector< Group > searchGroup( string name )
            {
                // implement
            }
            vector< Job > searchJob( string name )
            {
                // implement 
            }

}; 

class Notification 
{
    private:
        int notificationId;
        time_t createdOn;
        string content;

    public:
        bool sendNotification( Account account );
};