class Person
{
    private:
        string email;
        Address address;
        string name;
        string phone;
        Account account;

//    person class can be abstract
}

class Admin : public Person
{
    public : 
        bool adduser( User user );
        bool unblockUser( User  user );
        bool disablePage( CompanyPage page );
        bool enablePage( CompanyPage page );
        bool deleteGroup( Group group );
};

class User : public Person , public Observer
{
    private:
        int userId;
        time_t dateOfJoining;
        Profile profile;

        vector< User > followsUsers;
        vector< CompanyPage > followCompanies;
        vector< User > connections;
        vector< CompanyPage > createPages;
        vector< Group > createdGroups;

    public:
        bool sendMessage( Message message );
        bool sendInvite( ConnectionInvitation invite );
        bool cancelInvite( ConnectionInvitation invite );
        bool createPage( CompanyPage page );
        bool deletePage( CompanyPage page );
        bool createGroup( Group group );
        bool deleteGroup( Group group );

        bool createPost( Post post );
        bool deletePost( Post post );
        bool createComment( Comment comment );
        bool deleteComment( Comment comment );
        bool react( Post post );
        bool requestRecommendation( User user );
        bool acceptRecommendation( User user );
        bool applyForJob( Job job );

        void update( string & message ) override 
        {
            // implement 
        }
};