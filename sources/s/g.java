package s;

import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public final class g implements Comparable<g> {
    public int A;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35032s;

    /* renamed from: w, reason: collision with root package name */
    public float f35036w;

    /* renamed from: t, reason: collision with root package name */
    public int f35033t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f35034u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f35035v = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35037x = false;
    public final float[] y = new float[9];

    /* renamed from: z, reason: collision with root package name */
    public final float[] f35038z = new float[9];
    public b[] B = new b[16];
    public int C = 0;
    public int D = 0;

    public g(int i10) {
        this.A = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 < i11) {
                if (this.B[i10] == bVar) {
                    return;
                } else {
                    i10++;
                }
            } else {
                b[] bVarArr = this.B;
                if (i11 >= bVarArr.length) {
                    this.B = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.B;
                int i12 = this.C;
                bVarArr2[i12] = bVar;
                this.C = i12 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.C;
        int i11 = 0;
        while (i11 < i10) {
            if (this.B[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.B;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.C--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.A = 5;
        this.f35035v = 0;
        this.f35033t = -1;
        this.f35034u = -1;
        this.f35036w = gl.Code;
        this.f35037x = false;
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11] = null;
        }
        this.C = 0;
        this.D = 0;
        this.f35032s = false;
        Arrays.fill(this.f35038z, gl.Code);
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        return this.f35033t - gVar.f35033t;
    }

    public final void d(c cVar, float f) {
        this.f35036w = f;
        this.f35037x = true;
        int i10 = this.C;
        this.f35034u = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].h(cVar, this, false);
        }
        this.C = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].i(cVar, bVar, false);
        }
        this.C = 0;
    }

    public final String toString() {
        return "" + this.f35033t;
    }
}
