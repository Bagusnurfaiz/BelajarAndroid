package com.example.amikom.solashscreen;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private  PreferencesHelper (Context context) {
        Object simple;
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }


    public static preferencesHelper(context);
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(context);
    }
    return INSTANCE;
}
public SharedPreferences Pref() {
    return sharePReferences;
        }

        public Boolean isLogin () {
            return sharedPreferences.getBoolean("isLogin", false);
        }

        public void setLogin(boolean isCall){
            sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
        }
        void setName(string isName){
            sharedPreferences.edit("isname", isCall).apply();
        }
        public void setName(String isName) {
            return sharedPreferences ("isName", "");
        }
