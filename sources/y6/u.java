package y6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.hamkho.livefoot.R;

/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public final class u extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f36829g;

    /* renamed from: h, reason: collision with root package name */
    public int f36830h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36831i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i10 = LinearProgressIndicator.F;
        TypedArray d10 = com.google.android.material.internal.k.d(context, attributeSet, androidx.activity.n.X, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.f36829g = d10.getInt(0, 1);
        this.f36830h = d10.getInt(1, 0);
        d10.recycle();
        a();
        this.f36831i = this.f36830h == 1;
    }

    @Override // y6.b
    public final void a() {
        if (this.f36829g == 0) {
            if (this.f36770b <= 0) {
                if (this.f36771c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }
}
