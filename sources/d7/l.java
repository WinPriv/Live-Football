package d7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import d7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class l extends m.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f27465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f27466d;

    public l(ArrayList arrayList, Matrix matrix) {
        this.f27465c = arrayList;
        this.f27466d = matrix;
    }

    @Override // d7.m.f
    public final void a(Matrix matrix, c7.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f27465c.iterator();
        while (it.hasNext()) {
            ((m.f) it.next()).a(this.f27466d, aVar, i10, canvas);
        }
    }
}
