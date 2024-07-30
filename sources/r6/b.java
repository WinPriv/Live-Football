package r6;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.d;
import d7.g;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: MaterialAlertDialogBuilder.java */
/* loaded from: classes2.dex */
public final class b extends d.a {

    /* renamed from: c, reason: collision with root package name */
    public final g f34934c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f34935d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r15) {
        /*
            r14 = this;
            r0 = 2130969421(0x7f04034d, float:1.7547523E38)
            android.util.TypedValue r1 = z6.b.a(r0, r15)
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
            goto Le
        Lc:
            int r1 = r1.data
        Le:
            r3 = 0
            r4 = 2130968660(0x7f040054, float:1.754598E38)
            r5 = 2132017575(0x7f1401a7, float:1.9673432E38)
            android.content.Context r6 = g7.a.a(r15, r3, r4, r5)
            if (r1 != 0) goto L1c
            goto L22
        L1c:
            i.c r7 = new i.c
            r7.<init>(r6, r1)
            r6 = r7
        L22:
            android.util.TypedValue r15 = z6.b.a(r0, r15)
            if (r15 != 0) goto L2a
            r15 = r2
            goto L2c
        L2a:
            int r15 = r15.data
        L2c:
            r14.<init>(r6, r15)
            android.content.Context r15 = r14.getContext()
            android.content.res.Resources$Theme r0 = r15.getTheme()
            r10 = 2130968660(0x7f040054, float:1.754598E38)
            r11 = 2132017575(0x7f1401a7, float:1.9673432E38)
            r8 = 0
            int[] r9 = androidx.activity.n.Y
            int[] r12 = new int[r2]
            r7 = r15
            android.content.res.TypedArray r1 = com.google.android.material.internal.k.d(r7, r8, r9, r10, r11, r12)
            android.content.res.Resources r6 = r15.getResources()
            r7 = 2131165989(0x7f070325, float:1.794621E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 2
            int r6 = r1.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r15.getResources()
            r8 = 2131165990(0x7f070326, float:1.7946213E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 3
            int r7 = r1.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r8 = r15.getResources()
            r9 = 2131165988(0x7f070324, float:1.7946209E38)
            int r8 = r8.getDimensionPixelSize(r9)
            r9 = 1
            int r8 = r1.getDimensionPixelSize(r9, r8)
            android.content.res.Resources r10 = r15.getResources()
            r11 = 2131165987(0x7f070323, float:1.7946207E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r1.recycle()
            android.content.res.Resources r1 = r15.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            if (r1 != r9) goto L9a
            r13 = r8
            r8 = r6
            r6 = r13
        L9a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r7, r8, r2)
            r14.f34935d = r1
            java.lang.Class<r6.b> r1 = r6.b.class
            java.lang.String r1 = r1.getCanonicalName()
            r2 = 2130968895(0x7f04013f, float:1.7546457E38)
            android.util.TypedValue r1 = z6.b.c(r15, r2, r1)
            int r2 = r1.resourceId
            if (r2 == 0) goto Lb9
            java.lang.Object r1 = d0.a.f27248a
            int r1 = d0.a.d.a(r15, r2)
            goto Lbb
        Lb9:
            int r1 = r1.data
        Lbb:
            d7.g r2 = new d7.g
            r2.<init>(r15, r3, r4, r5)
            r2.i(r15)
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r1)
            r2.k(r15)
            int r15 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r15 < r1) goto L100
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r15, r9)
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r15.getDimension(r0)
            int r15 = r15.type
            r1 = 5
            if (r15 != r1) goto L100
            r15 = 0
            int r15 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r15 < 0) goto L100
            d7.g$b r15 = r2.f27403s
            d7.j r15 = r15.f27411a
            d7.j r15 = r15.e(r0)
            r2.setShapeAppearanceModel(r15)
        L100:
            r14.f34934c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.<init>(android.content.Context):void");
    }

    @Override // androidx.appcompat.app.d.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.d.a
    public final d create() {
        d create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        g gVar = this.f34934c;
        if (gVar instanceof g) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            gVar.j(c0.i.i(decorView));
        }
        Rect rect = this.f34935d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(create, rect));
        return create;
    }

    @Override // androidx.appcompat.app.d.a
    public final d.a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    public final d.a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    public final d.a setView(View view) {
        return (b) super.setView(view);
    }
}
