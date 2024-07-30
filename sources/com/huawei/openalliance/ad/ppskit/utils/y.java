package com.huawei.openalliance.ad.ppskit.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import java.util.concurrent.LinkedBlockingQueue;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class y {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f23061s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q1 f23062t;

        public a(Context context, q1 q1Var) {
            this.f23061s = context;
            this.f23062t = q1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.y.a.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f23063a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23064b;

        public b(String str, boolean z10) {
            this.f23063a = str;
            this.f23064b = z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: s, reason: collision with root package name */
        public boolean f23065s = false;

        /* renamed from: t, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f23066t = new LinkedBlockingQueue<>(1);

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                n7.c("GaidUtil", "onServiceConnected %s", Long.valueOf(System.currentTimeMillis()));
                this.f23066t.put(iBinder);
            } catch (InterruptedException unused) {
                n7.g("GaidUtil", "onServiceConnected InterruptedException " + System.currentTimeMillis());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            n7.c("GaidUtil", "onServiceDisconnected %s", Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static b a(Context context) {
        String str;
        Boolean bool;
        q1 m10 = q1.m(context);
        if (m10 == null) {
            return null;
        }
        p2.a(new a(context, m10), 0);
        byte[] bArr = q1.f22960g;
        synchronized (bArr) {
            m10.B();
            q1.b bVar = m10.f22965a;
            if (bVar == null) {
                str = "";
            } else {
                str = bVar.gaid;
            }
        }
        synchronized (bArr) {
            m10.B();
            q1.b bVar2 = m10.f22965a;
            if (bVar2 == null) {
                bool = null;
            } else {
                bool = bVar2.gaidLimit;
            }
        }
        if (y1.h(str) || bool == null) {
            return null;
        }
        return new b(str, bool.booleanValue());
    }

    public static boolean b(Context context) {
        if (!Cif.a(context).d()) {
            return true;
        }
        return false;
    }
}
