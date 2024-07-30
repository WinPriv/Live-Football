package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1189a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f1190b;

    /* renamed from: c, reason: collision with root package name */
    public int f1191c = 0;

    public i(ImageView imageView) {
        this.f1189a = imageView;
    }

    public final void a() {
        k0 k0Var;
        ImageView imageView = this.f1189a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            x.a(drawable);
        }
        if (drawable != null && (k0Var = this.f1190b) != null) {
            f.e(drawable, k0Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        ImageView imageView = this.f1189a;
        Context context = imageView.getContext();
        int[] iArr = a0.a.H;
        m0 m10 = m0.m(context, attributeSet, iArr, i10);
        n0.c0.k(imageView, imageView.getContext(), iArr, attributeSet, m10.f1206b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i11 = m10.i(1, -1)) != -1 && (drawable = g.a.a(imageView.getContext(), i11)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x.a(drawable);
            }
            if (m10.l(2)) {
                r0.e.c(imageView, m10.b(2));
            }
            if (m10.l(3)) {
                r0.e.d(imageView, x.c(m10.h(3, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        ImageView imageView = this.f1189a;
        if (i10 != 0) {
            Drawable a10 = g.a.a(imageView.getContext(), i10);
            if (a10 != null) {
                x.a(a10);
            }
            imageView.setImageDrawable(a10);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
