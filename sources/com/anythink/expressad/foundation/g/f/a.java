package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f9897a;

    /* renamed from: b, reason: collision with root package name */
    private static long f9898b;

    /* renamed from: c, reason: collision with root package name */
    private static long f9899c;

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0122a {

        /* renamed from: a, reason: collision with root package name */
        private static a f9902a = new a(0);

        private C0122a() {
        }
    }

    private a() {
    }

    public /* synthetic */ a(byte b10) {
        this();
    }

    public static a a() {
        return C0122a.f9902a;
    }

    public static long b() {
        return f9898b;
    }

    private synchronized void c() {
        if (f9897a == 0) {
            f9897a = SystemClock.elapsedRealtime();
            f9899c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        if (f9897a != 0 && f9899c != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f9897a;
            if (elapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f9899c) * 1000) / elapsedRealtime;
                        if (totalRxBytes == 0) {
                            f9898b = 1L;
                        } else {
                            f9898b = totalRxBytes;
                        }
                    } else {
                        f9898b = 0L;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            e();
        }
    }

    private synchronized void e() {
        f9899c = 0L;
        f9897a = 0L;
    }
}
