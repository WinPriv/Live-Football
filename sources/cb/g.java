package cb;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class g extends ViewGroup.LayoutParams {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3481c = {R.attr.layout_gravity};

    /* renamed from: a, reason: collision with root package name */
    public float f3482a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3483b;

    public g() {
        super(-1, -1);
        this.f3482a = gl.Code;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3482a = gl.Code;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3481c);
        obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
