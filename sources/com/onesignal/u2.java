package com.onesignal;

/* compiled from: OSSystemConditionController.java */
/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final b f27100a;

    /* compiled from: OSSystemConditionController.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: OSSystemConditionController.java */
    /* loaded from: classes2.dex */
    public interface b {
        void b();
    }

    public u2(v0 v0Var) {
        this.f27100a = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: NoClassDefFoundError -> 0x0057, TRY_LEAVE, TryCatch #0 {NoClassDefFoundError -> 0x0057, blocks: (B:8:0x0010, B:10:0x0018, B:12:0x003b, B:14:0x0048, B:18:0x0051), top: B:7:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r9 = this;
            android.app.Activity r0 = com.onesignal.e3.i()
            r1 = 0
            r2 = 4
            r3 = 0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "OSSystemConditionObserver curActivity null"
            com.onesignal.e3.b(r2, r0, r3)
            return r1
        Lf:
            r0 = 1
            android.app.Activity r4 = com.onesignal.e3.i()     // Catch: java.lang.NoClassDefFoundError -> L57
            boolean r5 = r4 instanceof androidx.appcompat.app.AppCompatActivity     // Catch: java.lang.NoClassDefFoundError -> L57
            if (r5 == 0) goto L4e
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4     // Catch: java.lang.NoClassDefFoundError -> L57
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()     // Catch: java.lang.NoClassDefFoundError -> L57
            com.onesignal.t2 r5 = new com.onesignal.t2     // Catch: java.lang.NoClassDefFoundError -> L57
            r5.<init>(r9, r4)     // Catch: java.lang.NoClassDefFoundError -> L57
            androidx.fragment.app.s r6 = r4.f1735m     // Catch: java.lang.NoClassDefFoundError -> L57
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.s$a> r6 = r6.f1871a     // Catch: java.lang.NoClassDefFoundError -> L57
            androidx.fragment.app.s$a r7 = new androidx.fragment.app.s$a     // Catch: java.lang.NoClassDefFoundError -> L57
            r7.<init>(r5, r0)     // Catch: java.lang.NoClassDefFoundError -> L57
            r6.add(r7)     // Catch: java.lang.NoClassDefFoundError -> L57
            androidx.fragment.app.x r4 = r4.f1726c     // Catch: java.lang.NoClassDefFoundError -> L57
            java.util.List r4 = r4.f()     // Catch: java.lang.NoClassDefFoundError -> L57
            int r5 = r4.size()     // Catch: java.lang.NoClassDefFoundError -> L57
            if (r5 <= 0) goto L4e
            int r5 = r5 - r0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.NoClassDefFoundError -> L57
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4     // Catch: java.lang.NoClassDefFoundError -> L57
            boolean r5 = r4.isVisible()     // Catch: java.lang.NoClassDefFoundError -> L57
            if (r5 == 0) goto L4e
            boolean r4 = r4 instanceof androidx.fragment.app.l     // Catch: java.lang.NoClassDefFoundError -> L57
            if (r4 == 0) goto L4e
            r4 = r0
            goto L4f
        L4e:
            r4 = r1
        L4f:
            if (r4 == 0) goto L6a
            java.lang.String r4 = "OSSystemConditionObserver dialog fragment detected"
            com.onesignal.e3.b(r2, r4, r3)     // Catch: java.lang.NoClassDefFoundError -> L57
            return r1
        L57:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 5
            com.onesignal.e3.b(r4, r1, r3)
        L6a:
            com.onesignal.a r1 = com.onesignal.c.f26699t
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            android.app.Activity r5 = com.onesignal.e3.i()
            r4.<init>(r5)
            boolean r4 = com.onesignal.b3.f(r4)
            if (r4 == 0) goto La8
            if (r1 == 0) goto La8
            android.app.Activity r5 = r1.f26635b
            java.lang.String r6 = "com.onesignal.u2"
            com.onesignal.u2$b r7 = r9.f27100a
            if (r5 == 0) goto L9e
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            com.onesignal.a$c r8 = new com.onesignal.a$c
            r8.<init>(r1, r7, r6)
            r5.addOnGlobalLayoutListener(r8)
            java.util.concurrent.ConcurrentHashMap r1 = com.onesignal.a.f
            r1.put(r6, r8)
        L9e:
            java.util.concurrent.ConcurrentHashMap r1 = com.onesignal.a.f26633e
            r1.put(r6, r7)
            java.lang.String r1 = "OSSystemConditionObserver keyboard up detected"
            com.onesignal.e3.b(r2, r1, r3)
        La8:
            r0 = r0 ^ r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.u2.a():boolean");
    }
}
