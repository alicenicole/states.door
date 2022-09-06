/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;


public interface DoorState
{
    void buttonPressed( Door door );

    void openingCompleted( Door door );

    void closingCompleted( Door door );

    void timeout( Door door );
}
