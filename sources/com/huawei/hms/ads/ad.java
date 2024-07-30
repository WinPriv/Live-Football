package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;

/* loaded from: classes2.dex */
public interface ad {
    Context Code(Context context);

    c0.a Code();

    Object Code(Context context, String str);

    void Code(Activity activity);

    void Code(String str);

    void V(String str);

    void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback);
}
