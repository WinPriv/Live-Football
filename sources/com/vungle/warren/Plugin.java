package com.vungle.warren;

import android.util.Log;
import com.huawei.openalliance.ad.constant.w;
import com.vungle.warren.VungleApiClient;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class Plugin {
    private static final String TAG = "Plugin";

    public static void addWrapperInfo(VungleApiClient.WrapperFramework wrapperFramework, String str) {
        String str2;
        if (wrapperFramework != null && wrapperFramework != VungleApiClient.WrapperFramework.none) {
            VungleApiClient.WRAPPER_FRAMEWORK_SELECTED = wrapperFramework;
            String headerUa = VungleApiClient.getHeaderUa();
            if (str != null && !str.isEmpty()) {
                str2 = "/".concat(str);
            } else {
                str2 = "";
            }
            String str3 = wrapperFramework + str2;
            if (new HashSet(Arrays.asList(headerUa.split(w.aG))).add(str3)) {
                VungleApiClient.setHeaderUa(headerUa + w.aG + str3);
            }
        } else {
            Log.e(TAG, "Wrapper is null or is none");
        }
        if (Vungle.isInitialized()) {
            Log.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
