package com.huawei.hms.ads.instreamad;

import com.huawei.hms.ads.annotation.GlobalApi;

@GlobalApi
/* loaded from: classes2.dex */
public interface InstreamMediaStateListener {
    void onMediaCompletion(int i10);

    void onMediaError(int i10, int i11, int i12);

    void onMediaPause(int i10);

    void onMediaProgress(int i10, int i11);

    void onMediaStart(int i10);

    void onMediaStop(int i10);
}
