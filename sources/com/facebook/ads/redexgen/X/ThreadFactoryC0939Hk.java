package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC0939Hk implements ThreadFactory {
    public final /* synthetic */ String A00;

    public ThreadFactoryC0939Hk(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
