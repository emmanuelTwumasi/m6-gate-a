package mooc.vandy.java4android.gate.logic;

import java.lang.reflect.Field;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    public static final int IN = 1;
    private int mSwing;


    //constructor created


    public Gate() {
        close();
    }
    //swing boolean mutator

    public boolean setSwing(int direction) {
        if (direction == IN || direction == OUT||direction==CLOSED) {
           this.mSwing = direction;
            return true;
        } else
            return false;
    }

    public boolean open(int direction) {
        //opens for in or out
        if (direction == IN || direction == OUT)
        {
            this.setSwing(direction);
            return true;
        } else
            return false;
    }

    public void close() {
        ///should close
        this.mSwing = CLOSED;
    }

    public int getSwingDirection() {
       return mSwing;
    }

    public int thru(int count) {
            if (mSwing==IN) {
                return count;
            } else if (mSwing==OUT) {
                return - count;
            } else
                return 0;
    }

    public String toString() {
        if (mSwing==CLOSED) {
            return ("This gate is closed");
        } else if (mSwing==IN) {
            return ("This gate is open and swings to enter the pen only");
        } else if (mSwing==OUT) {
            return ("This gate is open and swings to exit the pen only");
        } else {
            return ("This gate has an invalid swing direction");
        }

    }
    // TODO -- Fill in your code here


}
