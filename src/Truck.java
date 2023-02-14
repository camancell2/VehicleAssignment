public class Truck extends Vehicle
{
    public int m_numberOfWheels = 4;
    public int m_topSpeed = 250;

    protected boolean m_airConditioning;
    protected boolean m_handbrake;
    protected boolean m_sound;
    protected boolean m_container;
    protected String m_engine;

    public void openContainer() {}
    public void accelerate() {}
    public void brake() {}
    public void handbrake() {}
}
