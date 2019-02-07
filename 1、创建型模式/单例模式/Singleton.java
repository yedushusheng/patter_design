class Singleton
{
    private static Singleton instance;

    private Singleton()
    {

    }

    public static  Singleton GetInstance()
    {
        if(null == instance)
        {
            instance = new Singleton();
        }
        return instance;
    }

}