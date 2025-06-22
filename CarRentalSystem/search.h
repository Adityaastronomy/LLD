class Search
{
    public : 
    virtual vector< Vehicle >  seachByType( string type ) = 0;
    virtual vector< Vehicle >  searchByModel( string  model ) = 0;
};

class VehicleCatalog : public Search 
{
    private :
    map< string , vector< Vehicle >> vehicleType;
    map< string , vector< Vehicle >> vehicleModel;

    public:

    vector< Vehicle > searchByModel( string type )
    {
        // implement

    }
    vector< Vehicle > searchByType( string model )
    {
        // implement

    }
};
