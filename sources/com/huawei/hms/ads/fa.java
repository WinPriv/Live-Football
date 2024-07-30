package com.huawei.hms.ads;

import android.util.Log;
import gb.d0;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class fa extends ev {
    private static final String I = "HiAdLog";
    private static final int V = 60;
    private final Executor B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d0("FileLog", 5));
    private final fc Z;

    public fa(fc fcVar) {
        this.Z = fcVar;
    }

    @Override // com.huawei.hms.ads.fc
    public fc Code(final String str, final String str2) {
        this.B.execute(new Runnable() { // from class: com.huawei.hms.ads.fa.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fa.this.Z.Code(str, str2);
                } catch (Throwable th) {
                    Log.w(fa.I, "init err: ".concat(th.getClass().getSimpleName()));
                }
            }
        });
        fc fcVar = this.Code;
        if (fcVar != null) {
            fcVar.Code(str, str2);
        }
        return this;
    }

    @Override // com.huawei.hms.ads.fc
    public void Code(final fe feVar, final int i10, final String str) {
        this.B.execute(new Runnable() { // from class: com.huawei.hms.ads.fa.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fa.this.Z.Code(feVar, i10, str);
                } catch (Throwable th) {
                    Log.w(fa.I, "log err: ".concat(th.getClass().getSimpleName()));
                }
            }
        });
        fc fcVar = this.Code;
        if (fcVar != null) {
            fcVar.Code(feVar, i10, str);
        }
    }
}
