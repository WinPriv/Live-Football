package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.constant.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import ka.ea;
import ka.na;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f22750a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22751b;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.net.http.b f22752c;

    /* renamed from: d, reason: collision with root package name */
    public final na f22753d;

    /* renamed from: e, reason: collision with root package name */
    public final na f22754e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f22755g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22756h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22757i;

    /* loaded from: classes2.dex */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f22758a;

        public a(Class cls) {
            this.f22758a = cls;
        }

        /* JADX WARN: Code restructure failed: missing block: B:196:0x0500, code lost:
        
            continue;
         */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) {
            /*
                Method dump skipped, instructions count: 1490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.d.a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22760a;

        /* renamed from: d, reason: collision with root package name */
        public na f22763d;

        /* renamed from: e, reason: collision with root package name */
        public na f22764e;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22765g;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22767i;

        /* renamed from: b, reason: collision with root package name */
        public int f22761b = 10000;

        /* renamed from: c, reason: collision with root package name */
        public int f22762c = 10000;
        public int f = 1;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22766h = true;

        public b(Context context) {
            this.f22760a = context.getApplicationContext();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.huawei.openalliance.ad.ppskit.net.http.d.b r7) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.f22761b
            r6.f22750a = r0
            int r0 = r7.f22762c
            r6.f22751b = r0
            int r0 = r7.f
            r1 = 0
            r2 = 2
            android.content.Context r3 = r7.f22760a
            if (r0 != r2) goto L19
            com.huawei.openalliance.ad.ppskit.net.http.h r2 = new com.huawei.openalliance.ad.ppskit.net.http.h
            r2.<init>(r3)
            goto L1a
        L19:
            r2 = r1
        L1a:
            r4 = 1
            java.lang.String r5 = "HttpCallerFactory"
            if (r0 != r4) goto L50
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.d0.t()     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L3d
            if (r0 == 0) goto L4f
            java.lang.String r0 = "create OkHttpCaller"
            ka.n7.e(r5, r0)     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L3d
            com.huawei.openalliance.ad.ppskit.net.http.OkHttpCaller r0 = new com.huawei.openalliance.ad.ppskit.net.http.OkHttpCaller     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L3d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L3d
            r1 = r0
            goto L4f
        L31:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "createOkHttpCaller Exception:"
            goto L48
        L3d:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "createOkHttpCaller RuntimeException:"
        L48:
            java.lang.String r0 = r2.concat(r0)
            ka.n7.g(r5, r0)
        L4f:
            r2 = r1
        L50:
            if (r2 != 0) goto L5c
            java.lang.String r0 = "create HttpUrlConnectionCaller"
            ka.n7.e(r5, r0)
            com.huawei.openalliance.ad.ppskit.net.http.f r2 = new com.huawei.openalliance.ad.ppskit.net.http.f
            r2.<init>(r3)
        L5c:
            r6.f22752c = r2
            ka.na r0 = r7.f22763d
            r6.f22753d = r0
            ka.na r0 = r7.f22764e
            r6.f22754e = r0
            boolean r0 = r7.f22765g
            r6.f = r0
            r6.f22755g = r3
            boolean r0 = r7.f22766h
            r6.f22756h = r0
            boolean r7 = r7.f22767i
            r6.f22757i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.d.<init>(com.huawei.openalliance.ad.ppskit.net.http.d$b):void");
    }

    public static c a(ea eaVar) {
        c cVar = new c();
        if (eaVar != null) {
            for (String str : eaVar.a()) {
                String[] split = str.split(w.bE);
                if (split.length >= 2) {
                    cVar.b(split[0].trim(), split[1].trim());
                }
            }
        }
        return cVar;
    }

    public final <T> T b(Class<T> cls) {
        if (cls.isInterface()) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("Service must be interface.");
    }
}
