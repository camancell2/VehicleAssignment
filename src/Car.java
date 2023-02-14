public class Car extends Vehicle
{
    public int m_numberOfWheels = 4;
    public int m_topSpeed = 300;

    protected boolean m_airConditioning;
    protected boolean m_handbrake;
    protected boolean m_sound;
    protected String m_engine;

    public void setAirConditioning(boolean airConditioning)
    {
        m_airConditioning = airConditioning;
    }

    public void setHandbrake(boolean handbrake)
    {
        m_handbrake = handbrake;
    }

    public void setSound(boolean sound)
    {
        m_sound = sound;
    }

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
