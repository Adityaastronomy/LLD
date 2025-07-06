class Post
{
    private:
        int postId;
        User postOwner;
        string text;
        vector< signed char > media;
        int totalReacts;
        int totalShares;
        vector< Comment > comments;
    public:
        bool updateText();
};

class Comment
{
    private:
        int commentId;
        User commentOwner;
        string text;
        int totalReacts;
    
        
};