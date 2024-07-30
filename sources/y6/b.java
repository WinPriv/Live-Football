package y6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.hamkho.livefoot.R;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f36769a;

    /* renamed from: b, reason: collision with root package name */
    public int f36770b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f36771c;

    /* renamed from: d, reason: collision with root package name */
    public int f36772d;

    /* renamed from: e, reason: collision with root package name */
    public int f36773e;
    public int f;

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f36771c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray d10 = com.google.android.material.internal.k.d(context, attributeSet, androidx.activity.n.M, i10, i11, new int[0]);
        this.f36769a = z6.c.c(context, d10, 8, dimensionPixelSize);
        this.f36770b = Math.min(z6.c.c(context, d10, 7, 0), this.f36769a / 2);
        this.f36773e = d10.getInt(4, 0);
        this.f = d10.getInt(1, 0);
        if (!d10.hasValue(2)) {
            this.f36771c = new int[]{a0.a.L0(context, R.attr.colorPrimary, -1)};
        } else if (d10.peekValue(2).type != 1) {
            this.f36771c = new int[]{d10.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d10.getResourceId(2, -1));
            this.f36771c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d10.hasValue(6)) {
            this.f36772d = d10.getColor(6, -1);
        } else {
            this.f36772d = this.f36771c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f36772d = a0.a.C0(this.f36772d, (int) (f * 255.0f));
        }
        d10.recycle();
    }

    public abstract void a();
}
