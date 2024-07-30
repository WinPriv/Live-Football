package m2;

import android.graphics.PointF;
import j2.l;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public final class e implements i<PointF, PointF> {

    /* renamed from: s, reason: collision with root package name */
    public final b f32643s;

    /* renamed from: t, reason: collision with root package name */
    public final b f32644t;

    public e(b bVar, b bVar2) {
        this.f32643s = bVar;
        this.f32644t = bVar2;
    }

    @Override // m2.i
    public final j2.a<PointF, PointF> a() {
        return new l((j2.d) this.f32643s.a(), (j2.d) this.f32644t.a());
    }

    @Override // m2.i
    public final List<t2.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // m2.i
    public final boolean c() {
        if (this.f32643s.c() && this.f32644t.c()) {
            return true;
        }
        return false;
    }
}
