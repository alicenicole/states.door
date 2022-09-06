/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;


public class DoorClosing
        implements DoorState
{
    public void buttonPressed( Door door )
    {
        door.setState( new DoorOpening() );
        door.startOpening();
    }


    public void openingCompleted( Door door )
    {
    }


    public void closingCompleted( Door door )
    {
        door.setState( new DoorClosed() );
    }


    public void timeout( Door door )
    {
    }
}
