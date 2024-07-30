package androidx.appcompat.app;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f659s;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends a0.a {
        public a() {
        }

        @Override // n0.m0
        public final void a() {
            j jVar = j.this;
            jVar.f659s.N.setAlpha(1.0f);
            AppCompatDelegateImpl appCompatDelegateImpl = jVar.f659s;
            appCompatDelegateImpl.Q.d(null);
            appCompatDelegateImpl.Q = null;
        }

        @Override // a0.a, n0.m0
        public final void c() {
            j.this.f659s.N.setVisibility(0);
        }
    }

    public j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f659s = appCompatDelegateImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r5.f659s
            android.widget.PopupWindow r1 = r0.O
            androidx.appcompat.widget.ActionBarContextView r2 = r0.N
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            n0.l0 r1 = r0.Q
            if (r1 == 0) goto L13
            r1.b()
        L13:
            boolean r1 = r0.S
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.T
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, n0.l0> r2 = n0.c0.f33054a
            boolean r1 = n0.c0.g.c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r4
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.N
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.N
            n0.l0 r1 = n0.c0.a(r1)
            r1.a(r2)
            r0.Q = r1
            androidx.appcompat.app.j$a r0 = new androidx.appcompat.app.j$a
            r0.<init>()
            r1.d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.N
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.N
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.run():void");
    }
}
