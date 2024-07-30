package com.huawei.hms.ads.consent.inner.impl;

import android.content.Context;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.consent.bean.ConsentSyncRsp;
import com.huawei.hms.ads.consent.bean.network.ApiStatisticsRsp;
import com.huawei.hms.ads.consent.bean.network.ConfirmResultRsp;
import com.huawei.hms.ads.consent.bean.network.ConsentConfigRsp;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import ha.e;
import ha.i;

@AllApi
/* loaded from: classes2.dex */
public class ConsentImpl {
    private static <T> void Code(Context context, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        i.e(context.getApplicationContext()).d(str, str2, remoteCallResultCallback, cls);
    }

    private static <T> void V(Context context, String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        e.g(context.getApplicationContext()).d(str, str2, remoteCallResultCallback, cls);
    }

    @AllApi
    public static <T> void lookUpConsent(Context context, String str, String str2, RemoteCallResultCallback<ConsentConfigRsp> remoteCallResultCallback, Class<ConsentConfigRsp> cls) {
        Code(context, str, str2, remoteCallResultCallback, cls);
    }

    @AllApi
    public static void reportApiStistics(Context context, String str, String str2, RemoteCallResultCallback<ApiStatisticsRsp> remoteCallResultCallback, Class<ApiStatisticsRsp> cls) {
        Code(context, str, str2, remoteCallResultCallback, cls);
    }

    @AllApi
    public static <T> void reportConfirmResult(Context context, String str, String str2, RemoteCallResultCallback<ConfirmResultRsp> remoteCallResultCallback, Class<ConfirmResultRsp> cls) {
        Code(context, str, str2, remoteCallResultCallback, cls);
    }

    @AllApi
    public static void reportConsentStatus(Context context, String str, String str2, RemoteCallResultCallback<ConsentSyncRsp> remoteCallResultCallback, Class<ConsentSyncRsp> cls) {
        V(context, str, str2, remoteCallResultCallback, cls);
    }

    @AllApi
    public static <T> void reportConsentToKit(Context context, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback, Class<String> cls) {
        V(context, str, str2, remoteCallResultCallback, cls);
    }
}
