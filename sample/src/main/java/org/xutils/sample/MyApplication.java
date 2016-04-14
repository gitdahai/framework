package org.xutils.sample;

import android.support.multidex.MultiDexApplication;

import org.xutils.x;

/**
 * Created by wyouflf on 15/10/28.
 */
public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 开启debug会影响性能
    }
}
