package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.a;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes2.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public f f26530a;

    public c(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.f26530a;
        if (fVar == null) {
            Logger.i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 != 1016) {
                this.f26530a.a((com.ironsource.sdk.h.c) message.obj, new e(i10, a.AnonymousClass1.a(i10)));
            } else {
                fVar.a((com.ironsource.sdk.h.c) message.obj);
            }
        } catch (Throwable th) {
            Logger.i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
