package edu.stanford.rkpandey.instagramclone;

import android.app.Application;

import com.parse.Parse;

 public class parseapp extends Application{
    public void onCreate(){
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("x4q6KAZHBh9OnvZ2JJPQOE96UMNKM1DOBdyjyUk9")
                .clientKey("X6b2jGXxCri0spaeArwIWatbwlpUebczkdosu2mo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
