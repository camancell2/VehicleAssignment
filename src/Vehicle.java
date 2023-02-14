public class Vehicle 
{
    public void setModel(String model) 
    {
        m_model = model;
    }

    public void setMake(String make)
    {
        m_make = make;
    }

    protected String m_model;
    protected String m_make;
    protected int m_numberOfWheels;
    protected int m_topSpeed;
}