package com.onesignal;

/* compiled from: OSNotificationReceivedEvent.java */
/* loaded from: classes2.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f26702a;

    /* renamed from: b, reason: collision with root package name */
    public final y2 f26703b;

    /* renamed from: c, reason: collision with root package name */
    public final a f26704c;

    /* renamed from: d, reason: collision with root package name */
    public final t1 f26705d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26706e = false;

    /* compiled from: OSNotificationReceivedEvent.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e3.b(6, "Running complete from OSNotificationReceivedEvent timeout runnable!", null);
            c2 c2Var = c2.this;
            c2Var.a(c2Var.f26705d);
        }
    }

    /* compiled from: OSNotificationReceivedEvent.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ t1 f26708s;

        public b(t1 t1Var) {
            this.f26708s = t1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c2.this.b(this.f26708s);
        }
    }

    public c2(u1 u1Var, t1 t1Var) {
        this.f26705d = t1Var;
        this.f26702a = u1Var;
        y2 b10 = y2.b();
        this.f26703b = b10;
        a aVar = new a();
        this.f26704c = aVar;
        b10.c(25000L, aVar);
    }

    public final synchronized void a(t1 t1Var) {
        this.f26703b.a(this.f26704c);
        if (this.f26706e) {
            e3.b(6, "OSNotificationReceivedEvent already completed", null);
            return;
        }
        this.f26706e = true;
        if (OSUtils.o()) {
            new Thread(new b(t1Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            b(t1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.onesignal.t1 r14) {
        /*
            r13 = this;
            com.onesignal.t1 r0 = r13.f26705d
            com.onesignal.t1 r0 = r0.a()
            if (r14 == 0) goto Ld
            com.onesignal.t1 r14 = r14.a()
            goto Le
        Ld:
            r14 = 0
        Le:
            r1 = 0
            r2 = 1
            com.onesignal.u1 r3 = r13.f26702a
            if (r14 == 0) goto L79
            r3.getClass()
            java.lang.String r4 = r14.f27073g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r2
            com.onesignal.o2 r5 = com.onesignal.e3.f26776x
            r5.getClass()
            java.lang.String r5 = com.onesignal.r3.f27010a
            java.lang.String r6 = "OS_RESTORE_TTL_FILTER"
            boolean r5 = com.onesignal.r3.b(r5, r6, r2)
            com.onesignal.z1 r6 = r3.f27097a
            if (r5 != 0) goto L30
            goto L48
        L30:
            l3.d r5 = com.onesignal.e3.f26775w
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            com.onesignal.t1 r5 = r6.f27212a
            long r9 = r5.y
            int r5 = r5.f27090z
            long r11 = (long) r5
            long r9 = r9 + r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L4a
        L48:
            r5 = r2
            goto L4b
        L4a:
            r5 = r1
        L4b:
            boolean r7 = r3.f27098b
            if (r4 == 0) goto L5a
            if (r5 == 0) goto L5a
            r6.b(r14)
            boolean r14 = r3.f27099c
            com.onesignal.e0.e(r3, r14)
            goto L6b
        L5a:
            r6.b(r0)
            if (r7 == 0) goto L63
            com.onesignal.e0.c(r6)
            goto L6b
        L63:
            r6.f27216e = r1
            com.onesignal.e0.f(r6, r2, r1)
            com.onesignal.e3.w(r6)
        L6b:
            if (r7 == 0) goto L8e
            r14 = 100
            long r0 = (long) r14
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L74
            goto L8e
        L74:
            r14 = move-exception
            r14.printStackTrace()
            goto L8e
        L79:
            com.onesignal.z1 r14 = r3.f27097a
            r14.b(r0)
            boolean r0 = r3.f27098b
            if (r0 == 0) goto L86
            com.onesignal.e0.c(r14)
            goto L8e
        L86:
            r14.f27216e = r1
            com.onesignal.e0.f(r14, r2, r1)
            com.onesignal.e3.w(r14)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.c2.b(com.onesignal.t1):void");
    }

    public final String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f26706e + ", notification=" + this.f26705d + '}';
    }
}
