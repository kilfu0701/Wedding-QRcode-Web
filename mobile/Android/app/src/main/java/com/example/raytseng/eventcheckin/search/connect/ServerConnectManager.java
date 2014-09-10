package com.example.raytseng.eventcheckin.search.connect;

/**
 * Created by raytseng on 8/29/14.
 * This class is used for communicate with api server
 */
public class ServerConnectManager {


    private final String TAG = "ServerConnectManager";

    private static ServerConnectManager mServerConnectManager = null;
    public ServerConnectCallback serverConnectCallback;


    /**
     * callback function for update UI
     * to make user know if search process is success or fail
     * */
    public interface ServerConnectCallback {
        public void searchSuccess();
        public void searchTimeout();
        public void searchFail();

        public void checkinSuccess();
        public void checkinTimeout();
        public void checkinFail();
    }


    private ServerConnectManager() {

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
