package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public final class a extends IronSourceLogger {
    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("UIThread: ");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(" ");
        String sb3 = sb2.toString();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Log.e("ironSourceSDK: " + ironSourceTag, str);
                        return;
                    }
                    return;
                }
                Log.w("ironSourceSDK: " + ironSourceTag, str);
                return;
            }
            Log.i("ironSourceSDK: " + ironSourceTag, str);
            return;
        }
        Log.v("ironSourceSDK: " + ironSourceTag, sb3 + str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, ":stacktrace[");
        l10.append(Log.getStackTraceString(th));
        l10.append("]");
        log(ironSourceTag, l10.toString(), 3);
    }

    public a(int i10) {
        super("console", 0);
    }
}
