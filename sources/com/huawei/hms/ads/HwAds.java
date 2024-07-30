package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.annotation.GlobalApi;

@GlobalApi
/* loaded from: classes2.dex */
public class HwAds {
    private HwAds() {
    }

    @GlobalApi
    public static int getAppActivateStyle() {
        return k.Code().C();
    }

    @GlobalApi
    public static RequestOptions getRequestOptions() {
        return k.Code().I();
    }

    @GlobalApi
    public static String getSDKVersion() {
        return k.Code().V();
    }

    @GlobalApi
    public static void init(Context context) {
        init(context, null);
    }

    @GlobalApi
    public static boolean isAppInstalledNotify() {
        return k.Code().B();
    }

    @GlobalApi
    public static void setAppActivateStyle(int i10) {
        k.Code().V(i10);
    }

    @GlobalApi
    public static void setAppInstalledNotify(boolean z10) {
        k.Code().V(z10);
    }

    @GlobalApi
    public static void setBrand(int i10) {
        k.Code().Code(i10);
    }

    @GlobalApi
    public static void setConsent(String str) {
        k.Code().Code(str);
    }

    @GlobalApi
    public static void setRequestOptions(RequestOptions requestOptions) {
        k.Code().Code(requestOptions);
    }

    @GlobalApi
    public static void setVideoMuted(boolean z10) {
        k.Code().Code(z10);
    }

    @GlobalApi
    public static void setVideoVolume(float f) {
        k.Code().Code(f);
    }

    @GlobalApi
    public static void init(Context context, String str) {
        k.Code().Code(context, str);
    }
}
