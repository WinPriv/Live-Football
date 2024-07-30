package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.p;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1205a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f1206b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1207c;

    public m0(Context context, TypedArray typedArray) {
        this.f1205a = context;
        this.f1206b = typedArray;
    }

    public static m0 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new m0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f1206b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList b10;
        TypedArray typedArray = this.f1206b;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (b10 = d0.a.b(resourceId, this.f1205a)) != null) {
            return b10;
        }
        return typedArray.getColorStateList(i10);
    }

    public final int c(int i10, int i11) {
        return this.f1206b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f1206b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        TypedArray typedArray = this.f1206b;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return g.a.a(this.f1205a, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable e10;
        if (this.f1206b.hasValue(i10) && (resourceId = this.f1206b.getResourceId(i10, 0)) != 0) {
            f a10 = f.a();
            Context context = this.f1205a;
            synchronized (a10) {
                e10 = a10.f1160a.e(resourceId, context, true);
            }
            return e10;
        }
        return null;
    }

    public final Typeface g(int i10, int i11, p.a aVar) {
        int resourceId = this.f1206b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1207c == null) {
            this.f1207c = new TypedValue();
        }
        TypedValue typedValue = this.f1207c;
        ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
        Context context = this.f1205a;
        if (context.isRestricted()) {
            return null;
        }
        return e0.f.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f1206b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f1206b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f1206b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f1206b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f1206b.hasValue(i10);
    }

    public final void n() {
        this.f1206b.recycle();
    }
}
