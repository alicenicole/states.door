/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;


public class DoorOpen
        implements DoorState
{
    public void buttonPressed( Door door )
    {
        door.setState( new DoorClosing() );
        door.startClosing();
    }


    public void openingCompleted( Door door )
    {
    }


    public void closingCompleted( Door door )
    {
    }


    public void timeout( Door door )
    {
        door.setState( new DoorClosing() );
        door.startClosing();
    }
}
