// The purpose of this class is to model a remote.
// Sushant Khatri - October 2, 2026

public class Remote
{
    // The manufacturer/brand of the television.
    private final String MANUFACTURER;

    // The room where the remote will be used.
    private final String LOCATION;

    // Indicates whether the television power is on or off.
    private boolean powerOn;

    // The current television channel.
    private int channel;

    // The current television volume.
    private int volume;

    /**
     * Constructs a Remote object with a manufacturer and room location.
     * The television begins powered off, on channel 5, with volume 16.
     * @param brand the manufacturer of the television
     * @param room the room where the television is located
     */
    public Remote(String brand, String room)
    {
        MANUFACTURER = brand;
        LOCATION = room;
        powerOn = false;
        volume = 16;
        channel = 5;
    }

    /**
     * Returns the current volume setting.
     * @return the current volume
     */
    public int getVolume()
    {
        return volume;
    }

    /**
     * Returns the current channel.
     * @return the current channel
     */
    public int getChannel()
    {
        return channel;
    }

    /**
     * Returns the television manufacturer.
     * @return the manufacturer
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }

    /**
     * Returns the room location of the television.
     * @return the location
     */
    public String getLocation()
    {
        return LOCATION;
    }

    /**
     * Changes the television to the specified channel.
     * @param station the desired channel
     */
    public void setChannel(int station)
    {
        channel = station;
    }

    /**
     * Toggles the television power on or off.
     */
    public void power()
    {
        powerOn = !powerOn;
    }

    /**
     * Increases the volume by 1.
     */
    public void volumeUp()
    {
        volume++;
    }

    /**
     * Decreases the volume by 1.
     */
    public void volumeDown()
    {
        volume--;
    }
}
