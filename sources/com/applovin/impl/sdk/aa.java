package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<AppLovinAdImpl> f18538a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f18539b = new Object();

    public int a() {
        int size;
        synchronized (this.f18539b) {
            size = this.f18538a.size();
        }
        return size;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f18539b) {
            if (a() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public AppLovinAdImpl c() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f18539b) {
            if (!b()) {
                appLovinAdImpl = this.f18538a.poll();
            } else {
                appLovinAdImpl = null;
            }
        }
        return appLovinAdImpl;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl peek;
        synchronized (this.f18539b) {
            peek = this.f18538a.peek();
        }
        return peek;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f18539b) {
            if (a() <= 25) {
                this.f18538a.offer(appLovinAdImpl);
            } else {
                y.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }
}
