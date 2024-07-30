package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final y logger;
    private final p sdk;

    public ArrayDataCollector(p pVar) {
        this.sdk = pVar;
        this.logger = pVar.L();
    }

    public long maybeCollectAppHubVersionCode(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.aA)).booleanValue()) {
            return -1L;
        }
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (y.a()) {
                this.logger.b(TAG, "Failed to collect App Hub version code", th);
            }
            return -1L;
        }
    }

    public boolean maybeCollectDirectDownloadEnabled(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.aB)).booleanValue()) {
            return false;
        }
        try {
            return iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD");
        } catch (Throwable th) {
            if (y.a()) {
                this.logger.b(TAG, "Failed to collect App Hub version code", th);
            }
            return false;
        }
    }

    public String maybeCollectRandomUserToken(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.aC)).booleanValue()) {
            return null;
        }
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (y.a()) {
                this.logger.b(TAG, "Failed to collect random user token", th);
            }
            return null;
        }
    }
}
