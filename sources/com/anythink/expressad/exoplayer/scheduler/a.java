package com.anythink.expressad.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.anythink.expressad.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9316a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9317b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9318c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9319d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9320e = 4;
    private static final int f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9321g = 16;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9322h = 7;

    /* renamed from: i, reason: collision with root package name */
    private static final String f9323i = "Requirements";

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f9324j = null;

    /* renamed from: k, reason: collision with root package name */
    private final int f9325k;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.expressad.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0116a {
    }

    private a(int i10, boolean z10, boolean z11) {
        this(i10 | (z10 ? 16 : 0) | (z11 ? 8 : 0));
    }

    public final int a() {
        return this.f9325k & 7;
    }

    public final boolean b() {
        return (this.f9325k & 16) != 0;
    }

    public final boolean c() {
        return (this.f9325k & 8) != 0;
    }

    public final int d() {
        return this.f9325k;
    }

    public final String toString() {
        return super.toString();
    }

    public a(int i10) {
        this.f9325k = i10;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        if (af.f8993a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return !(networkCapabilities == null || !networkCapabilities.hasCapability(16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if ((r6 == null || !r6.hasCapability(16)) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = r8.f9325k
            r1 = 7
            r0 = r0 & r1
            r2 = 1
            if (r0 != 0) goto L8
            return r2
        L8:
            java.lang.String r3 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r3)
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
            android.net.NetworkInfo r3 = r9.getActiveNetworkInfo()
            r4 = 0
            if (r3 == 0) goto L7b
            boolean r5 = r3.isConnected()
            if (r5 != 0) goto L1f
            goto L7b
        L1f:
            int r5 = com.anythink.expressad.exoplayer.k.af.f8993a
            r6 = 23
            r7 = 16
            if (r5 >= r6) goto L29
        L27:
            r6 = r2
            goto L43
        L29:
            android.net.Network r6 = r9.getActiveNetwork()
            if (r6 == 0) goto L42
            android.net.NetworkCapabilities r6 = r9.getNetworkCapabilities(r6)
            if (r6 == 0) goto L3e
            boolean r6 = r6.hasCapability(r7)
            if (r6 != 0) goto L3c
            goto L3e
        L3c:
            r6 = r4
            goto L3f
        L3e:
            r6 = r2
        L3f:
            if (r6 != 0) goto L42
            goto L27
        L42:
            r6 = r4
        L43:
            if (r6 != 0) goto L46
            return r4
        L46:
            if (r0 != r2) goto L49
            return r2
        L49:
            r6 = 3
            if (r0 != r6) goto L54
            boolean r9 = r3.isRoaming()
            if (r9 != 0) goto L53
            return r2
        L53:
            return r4
        L54:
            if (r5 < r7) goto L5b
            boolean r9 = r9.isActiveNetworkMetered()
            goto L6a
        L5b:
            int r9 = r3.getType()
            if (r9 == r2) goto L69
            if (r9 == r1) goto L69
            r1 = 9
            if (r9 == r1) goto L69
            r9 = r2
            goto L6a
        L69:
            r9 = r4
        L6a:
            r1 = 2
            if (r0 != r1) goto L71
            if (r9 != 0) goto L70
            return r2
        L70:
            return r4
        L71:
            r1 = 4
            if (r0 != r1) goto L75
            return r9
        L75:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.scheduler.a.b(android.content.Context):boolean");
    }

    private boolean c(Context context) {
        if (!b()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean d(Context context) {
        if (!c()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i10 = af.f8993a;
        return i10 >= 23 ? !powerManager.isDeviceIdleMode() : i10 >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (af.f8993a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0053, code lost:
    
        if (r7.isRoaming() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006e, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0042, code lost:
    
        if ((r10 == null || !r10.hasCapability(16)) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.scheduler.a.a(android.content.Context):boolean");
    }

    private static void e() {
    }
}
