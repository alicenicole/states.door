/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;


public class DoorOpening
        implements DoorState
{
    public void buttonPressed( Door door )
    {
    }


    public void openingCompleted( Door door )
    {
        door.startTimer();
        door.setState( new DoorOpen() );
    }


    public void closingCompleted( Door door )
    {
    }


    public void timeout( Door door )
    {
    }
}
