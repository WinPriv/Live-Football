package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import g0.a;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f1153a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1154b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1155c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1156d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1157e = false;
    public boolean f;

    public e(CompoundButton compoundButton) {
        this.f1153a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f1153a;
        Drawable a10 = r0.c.a(compoundButton);
        if (a10 != null) {
            if (this.f1156d || this.f1157e) {
                Drawable mutate = a10.mutate();
                if (this.f1156d) {
                    a.b.h(mutate, this.f1154b);
                }
                if (this.f1157e) {
                    a.b.i(mutate, this.f1155c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:8:0x0026, B:10:0x0035, B:12:0x003b, B:14:0x0041, B:15:0x004c, B:17:0x0053, B:18:0x005a, B:20:0x0061), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:8:0x0026, B:10:0x0035, B:12:0x003b, B:14:0x0041, B:15:0x004c, B:17:0x0053, B:18:0x005a, B:20:0x0061), top: B:2:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r6 = r8.f1153a
            android.content.Context r0 = r6.getContext()
            int[] r2 = a0.a.O
            androidx.appcompat.widget.m0 r7 = androidx.appcompat.widget.m0.m(r0, r9, r2, r10)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.f1206b
            r0 = r6
            r3 = r9
            r5 = r10
            n0.c0.k(r0, r1, r2, r3, r4, r5)
            r9 = 1
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            r0 = 0
            if (r10 == 0) goto L32
            int r10 = r7.i(r9, r0)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L32
            android.content.Context r1 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r10 = g.a.a(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            r6.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 != 0) goto L4c
            boolean r9 = r7.l(r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            int r9 = r7.i(r0, r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r9 = g.a.a(r10, r9)     // Catch: java.lang.Throwable -> L72
            r6.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L72
        L4c:
            r9 = 2
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L5a
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch: java.lang.Throwable -> L72
            r0.b.c(r6, r9)     // Catch: java.lang.Throwable -> L72
        L5a:
            r9 = 3
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L6e
            r10 = -1
            int r9 = r7.h(r9, r10)     // Catch: java.lang.Throwable -> L72
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.x.c(r9, r10)     // Catch: java.lang.Throwable -> L72
            r0.b.d(r6, r9)     // Catch: java.lang.Throwable -> L72
        L6e:
            r7.n()
            return
        L72:
            r9 = move-exception
            r7.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.b(android.util.AttributeSet, int):void");
    }
}
