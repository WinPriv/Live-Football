package com.anythink.core.common.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static volatile k f5187b;

    /* renamed from: a, reason: collision with root package name */
    Context f5188a;

    private k(Context context) {
        this.f5188a = context;
    }

    public static k a(Context context) {
        if (f5187b == null) {
            synchronized (k.class) {
                if (f5187b == null) {
                    f5187b = new k(context.getApplicationContext());
                }
            }
        }
        return f5187b;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            d1.a.a(this.f5188a).b(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
        try {
            d1.a.a(this.f5188a).b(broadcastReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            d1.a.a(this.f5188a).d(broadcastReceiver);
        } catch (Throwable unused) {
        }
        try {
            d1.a.a(this.f5188a).d(broadcastReceiver);
        } catch (Throwable unused2) {
        }
    }

    public final void a(Intent intent) {
        try {
            d1.a.a(this.f5188a).c(intent);
        } catch (Throwable unused) {
        }
        try {
            d1.a.a(this.f5188a).c(intent);
        } catch (Throwable unused2) {
        }
    }
}
