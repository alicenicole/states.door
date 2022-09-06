/*
 * 05.09.2022 Original version
 */


package dk.via.jpe.door;


import java.util.Random;


public class DoorDriver
{
    public static void main( String[] args )
    {
        new DoorDriver().run();
    }


    private static Random random = new Random();


    private void run()
    {
        Door door = new Door();

        while( true ) {
            door.buttonPressed();

            try {
                Thread.sleep( random.nextInt( 40000 ) );
            } catch (InterruptedException ex) {
            }
        }
    }
}
