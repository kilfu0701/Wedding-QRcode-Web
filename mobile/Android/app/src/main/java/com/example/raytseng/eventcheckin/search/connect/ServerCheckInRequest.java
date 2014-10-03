package com.example.raytseng.eventcheckin.search.connect;

import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by raytseng on 9/11/14.
 */
public class ServerCheckInRequest {
    /**
     * callback function for update UI
     * to make user know if search process is success or fail
     * */
    public interface ServerCheckInCallback {
        public void checkinSuccess();
        public void checkinTimeout();
        public void checkinFail();
    }


    public ServerCheckInRequest() {

    }


    /**
     * check in guest
     * */
    public boolean checkInGuest(long id) {

        return true;
    }
}
