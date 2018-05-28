package pojo;

public class Company
{
    private String compid;

    public String getCompid ()
    {
        return compid;
    }

    public void setCompid (String compid)
    {
        this.compid = compid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [compid = "+compid+"]";
    }
}