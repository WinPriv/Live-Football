package e0;

import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27631a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f27632b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f27631a = new int[size];
        this.f27632b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f27631a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f27632b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public e(int i10, int i11) {
        this.f27631a = new int[]{i10, i11};
        this.f27632b = new float[]{gl.Code, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f27631a = new int[]{i10, i11, i12};
        this.f27632b = new float[]{gl.Code, 0.5f, 1.0f};
    }
}
