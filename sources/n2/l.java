package n2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33269a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f33270b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33271c;

    public l(PointF pointF, boolean z10, List<l2.a> list) {
        this.f33270b = pointF;
        this.f33271c = z10;
        this.f33269a = new ArrayList(list);
    }

    public final void a(float f, float f10) {
        if (this.f33270b == null) {
            this.f33270b = new PointF();
        }
        this.f33270b.set(f, f10);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f33269a.size() + "closed=" + this.f33271c + '}';
    }

    public l() {
        this.f33269a = new ArrayList();
    }
}
