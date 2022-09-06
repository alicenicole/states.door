/*
 05.09.2022 Original version
 */


package dk.via.jpe.door;

public class Door
{
    private static final long OPENING_TIME = 3000L; // three seconds
    private static final long CLOSING_TIME = 3000L; // three seconds
    private static final long TIMEOUT_TIME = 20000L; // twenty seconds

    private DoorState state = new DoorClosed();


    public void buttonPressed()
    {
        System.out.println( "Button pressed" );

        state.buttonPressed( this );
    }


    void startOpening()
    {
        System.out.println( "   Door opening" );

        try {
            Thread.sleep( OPENING_TIME );
        } catch( InterruptedException ex ) {
        }

        openingComplete();
    }


    void openingComplete()
    {
        System.out.println( "   Opening completed" );

        state.openingCompleted( this );
    }


    void startClosing()
    {
        System.out.println( "   Door closing" );

        try {
            Thread.sleep( CLOSING_TIME );
        } catch( InterruptedException ex ) {
        }

        closingComplete();
    }


    void closingComplete()
    {
        System.out.println( "   Closing completed" );

        state.closingCompleted( this );
    }

    

    private void timeout()
    {
        System.out.println( "   Timeout" );

        state.timeout( this );
    }


    void startTimer()
    {
        new Thread( new Timer() ).start();
    }


    void setState( DoorState state )
    {
        this.state = state;
    }


    private class Timer
        implements Runnable
    {
        public void run()
        {
            try {
                Thread.sleep( TIMEOUT_TIME );
            } catch( InterruptedException ex ) {
            }

            timeout();
        }
    }
}
