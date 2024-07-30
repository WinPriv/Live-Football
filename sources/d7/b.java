package d7;

import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f27401a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27402b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f27401a;
            f += ((b) cVar).f27402b;
        }
        this.f27401a = cVar;
        this.f27402b = f;
    }

    @Override // d7.c
    public final float a(RectF rectF) {
        return Math.max(gl.Code, this.f27401a.a(rectF) + this.f27402b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27401a.equals(bVar.f27401a) && this.f27402b == bVar.f27402b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27401a, Float.valueOf(this.f27402b)});
    }
}
