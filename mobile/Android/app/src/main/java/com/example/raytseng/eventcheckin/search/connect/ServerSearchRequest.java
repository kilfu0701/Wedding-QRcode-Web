package com.example.raytseng.eventcheckin.search.connect;

import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by raytseng on 9/11/14.
 */
public class ServerSearchRequest {
    /**
     * callback function for update UI
     * to make user know if search process is success or fail
     * */
    public interface ServerSearchCallback {
        public void searchSuccess(String info);
        public void searchTimeout();
        public void searchFail();

    }


    public ServerSearchRequest() {

    }

    /**
     * search guest by name and friend type
     * */
    public boolean searchByNameAndType(int friendType, String guestName) {

        return true;
    }

    /**
     * search guest by qrcode
     * */
    public boolean searchByQrcode(String qrcode) {

        return true;
    }


}
