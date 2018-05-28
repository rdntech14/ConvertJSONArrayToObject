package pojo;

public class MyPOJO
{
    private Company company;

    public Company getCompany ()
    {
        return company;
    }

    public void setCompany (Company company)
    {
        this.company = company;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [company = "+company+"]";
    }
}