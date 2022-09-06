/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;


public class DoorClosed
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
    }


    public void timeout( Door door )
    {
    }
}
