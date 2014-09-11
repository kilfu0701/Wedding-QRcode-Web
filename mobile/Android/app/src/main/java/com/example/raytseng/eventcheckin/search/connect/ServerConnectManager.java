package com.example.raytseng.eventcheckin.search.connect;

import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by raytseng on 8/29/14.
 * This class is used for communicate with api server
 */
public class ServerConnectManager {


    private final String TAG = "ServerConnectManager";

    private static ServerConnectManager mServerConnectManager = null;
    public ServerConnectCallback serverConnectCallback;

    // For testing
    private Timer myTestTimer;
    private TimerTask task;
    private int tSec = 0;


    /**
     * callback function for update UI
     * to make user know if search process is success or fail
     * */
    public interface ServerConnectCallback {
        public void searchSuccess(String info);
        public void searchTimeout();
        public void searchFail();

        public void checkinSuccess();
        public void checkinTimeout();
        public void checkinFail();
    }


    private ServerConnectManager() {

    }

    // For testing
    private void stopTimer() {
        myTestTimer.cancel();
        serverConnectCallback.searchSuccess("YO-MAN");

    }


    /**
     * ServerConnectManager is a singleton instance
     * User can only access server by this method
     *
     * */
    public static ServerConnectManager getManagerInstance() {
        if (mServerConnectManager == null) {
            mServerConnectManager = new ServerConnectManager();
        }

        return mServerConnectManager;

    }



    /**
     * search guest by name and friend type
     * */
    public boolean searchByNameAndType(int friendType, String guestName) {

        Log.i(TAG, "FriendType: " + friendType + " Guest Name: " + guestName);

        // For testing
        myTestTimer = new Timer();
        task = new TimerTask(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                if (tSec < 10){
                    tSec++;

                } else {
                    stopTimer();
                }
            }

        };
        myTestTimer.schedule(task, 0,1000);

        return true;
    }

    /**
     * search guest by qrcode
     * */
    public boolean searchByQrcode(String qrcode) {

        return true;
    }

    /**
     * check in guest
     * */
    public boolean checkInGuest(long id) {

        return true;
    }

}
