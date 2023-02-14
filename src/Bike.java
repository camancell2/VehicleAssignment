public class Bike extends Vehicle
{
    public int m_numberOfWheels = 2;

    protected String m_engine;

    public void setEngine(String engine)
    {
        m_engine = engine;
    }

    public void accelerate() 
    {
        System.out.println(m_make + "( " + m_model + " ) called accelerate()");
    }

    public void brake() 
    {
        System.out.println(m_make + "( " + m_model + " ) called brake()");
    }

    public void handbrake() 
    {
        System.out.println(m_make + "( " + m_model + " ) called handbrake()");
    }
}
