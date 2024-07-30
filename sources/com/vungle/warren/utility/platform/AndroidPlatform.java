package com.vungle.warren.utility.platform;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.vungle.warren.model.AdvertisingInfo;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.VungleThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.a;

/* loaded from: classes2.dex */
public class AndroidPlatform implements Platform {
    private final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo = null;
    private String appSetId;
    private final Context context;
    private boolean defaultIdFallbackDisabled;
    private final PowerManager powerManager;
    private final Repository repository;
    private final TimeoutProvider timeoutProvider;
    private final VungleThreadPoolExecutor uaExecutor;

    public AndroidPlatform(Context context, Repository repository, VungleThreadPoolExecutor vungleThreadPoolExecutor, TimeoutProvider timeoutProvider) {
        this.context = context;
        this.powerManager = (PowerManager) context.getSystemService("power");
        this.repository = repository;
        this.uaExecutor = vungleThreadPoolExecutor;
        this.timeoutProvider = timeoutProvider;
        updateAppSetID();
    }

    private void updateAppSetID() {
        try {
            AppSet.getClient(this.context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.vungle.warren.utility.platform.AndroidPlatform.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    if (appSetIdInfo != null) {
                        AndroidPlatform.this.appSetId = appSetIdInfo.getId();
                        if (TextUtils.isEmpty(AndroidPlatform.this.appSetId)) {
                            return;
                        }
                        Cookie cookie = new Cookie(Cookie.APP_SET_ID_COOKIE);
                        cookie.putValue(Cookie.APP_SET_ID, AndroidPlatform.this.appSetId);
                        AndroidPlatform.this.repository.save(cookie, null, false);
                    }
                }
            });
        } catch (NoClassDefFoundError e10) {
            Log.e(this.TAG, "Required libs to get AppSetID Not available: " + e10.getLocalizedMessage());
        }
    }

    @Override // com.vungle.warren.utility.platform.Platform
    @SuppressLint({"HardwareIds", "NewApi"})
    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null && !TextUtils.isEmpty(advertisingInfo.advertisingId)) {
            return this.advertisingInfo;
        }
        this.advertisingInfo = new AdvertisingInfo();
        try {
        } catch (Exception unused) {
            Log.e(this.TAG, "Cannot load Advertising ID");
        }
        if (Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = this.context.getContentResolver();
                AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
                boolean z10 = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z10 = false;
                }
                advertisingInfo2.limitAdTracking = z10;
                this.advertisingInfo.advertisingId = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e10) {
                Log.w(this.TAG, "Error getting Amazon advertising info", e10);
            }
            return this.advertisingInfo;
        }
        try {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
                if (advertisingIdInfo != null) {
                    this.advertisingInfo.advertisingId = advertisingIdInfo.getId();
                    this.advertisingInfo.limitAdTracking = advertisingIdInfo.isLimitAdTrackingEnabled();
                }
            } catch (GooglePlayServicesNotAvailableException e11) {
                Log.e(this.TAG, "Play services Not available: " + e11.getLocalizedMessage());
            }
        } catch (NoClassDefFoundError e12) {
            Log.e(this.TAG, "Play services Not available: " + e12.getLocalizedMessage());
            this.advertisingInfo.advertisingId = Settings.Secure.getString(this.context.getContentResolver(), "advertising_id");
        }
        return this.advertisingInfo;
        Log.e(this.TAG, "Cannot load Advertising ID");
        return this.advertisingInfo;
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public String getAndroidId() {
        if (this.defaultIdFallbackDisabled) {
            return "";
        }
        return Settings.Secure.getString(this.context.getContentResolver(), "android_id");
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public String getAppSetId() {
        String str;
        if (TextUtils.isEmpty(this.appSetId)) {
            Cookie cookie = (Cookie) this.repository.load(Cookie.APP_SET_ID_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
            if (cookie != null) {
                str = cookie.getString(Cookie.APP_SET_ID);
            } else {
                str = null;
            }
            this.appSetId = str;
        }
        return this.appSetId;
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public boolean getIsBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public boolean getIsSDCardPresent() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public boolean getIsSideloaded() {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.context.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
                canRequestPackageInstalls = this.context.getApplicationContext().getPackageManager().canRequestPackageInstalls();
                return canRequestPackageInstalls;
            }
            return false;
        }
        try {
            if (Settings.Secure.getInt(this.context.getContentResolver(), "install_non_market_apps") != 1) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public boolean getIsSoundEnabled() {
        if (((AudioManager) this.context.getSystemService(o.f9069b)).getStreamVolume(3) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public String getUserAgent() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.USER_AGENT_ID_COOKIE, Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString(Cookie.USER_AGENT_ID_COOKIE);
        if (TextUtils.isEmpty(string)) {
            return System.getProperty("http.agent");
        }
        return string;
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public void getUserAgentLazy(final a<String> aVar) {
        this.uaExecutor.execute(new Runnable() { // from class: com.vungle.warren.utility.platform.AndroidPlatform.1
            @Override // java.lang.Runnable
            public void run() {
                new WebViewUtil(AndroidPlatform.this.context, AndroidPlatform.this.repository).getUserAgent(aVar);
            }
        });
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public double getVolumeLevel() {
        AudioManager audioManager = (AudioManager) this.context.getSystemService(o.f9069b);
        return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public boolean isAtLeastMinimumSDK() {
        return true;
    }

    @Override // com.vungle.warren.utility.platform.Platform
    public void setAndroidIdFallbackDisabled(boolean z10) {
        this.defaultIdFallbackDisabled = z10;
    }
}
