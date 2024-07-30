package y6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hamkho.livefoot.R;

/* compiled from: CircularProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f36790g;

    /* renamed from: h, reason: collision with root package name */
    public int f36791h;

    /* renamed from: i, reason: collision with root package name */
    public int f36792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i10 = CircularProgressIndicator.F;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray d10 = com.google.android.material.internal.k.d(context, attributeSet, androidx.activity.n.Q, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.f36790g = Math.max(z6.c.c(context, d10, 2, dimensionPixelSize), this.f36769a * 2);
        this.f36791h = z6.c.c(context, d10, 1, dimensionPixelSize2);
        this.f36792i = d10.getInt(0, 0);
        d10.recycle();
    }

    @Override // y6.b
    public final void a() {
    }
}
