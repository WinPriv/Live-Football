package d7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f27400a;

    public a(float f) {
        this.f27400a = f;
    }

    @Override // d7.c
    public final float a(RectF rectF) {
        return this.f27400a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f27400a == ((a) obj).f27400a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27400a)});
    }
}
