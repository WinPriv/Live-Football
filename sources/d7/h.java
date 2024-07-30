package d7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f27430a;

    public h(float f) {
        this.f27430a = f;
    }

    @Override // d7.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f27430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f27430a == ((h) obj).f27430a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27430a)});
    }
}
