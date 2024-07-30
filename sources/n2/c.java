package n2;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f33221a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33222b;

    public c(float[] fArr, int[] iArr) {
        this.f33221a = fArr;
        this.f33222b = iArr;
    }

    public final c a(float[] fArr) {
        int u02;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f = fArr[i10];
            float[] fArr2 = this.f33221a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f33222b;
            if (binarySearch >= 0) {
                u02 = iArr2[binarySearch];
            } else {
                int i11 = -(binarySearch + 1);
                if (i11 == 0) {
                    u02 = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    u02 = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f10 = fArr2[i12];
                    u02 = androidx.activity.n.u0((f - f10) / (fArr2[i11] - f10), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = u02;
        }
        return new c(fArr, iArr);
    }
}
