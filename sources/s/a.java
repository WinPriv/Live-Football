package s;

import com.huawei.hms.ads.gl;
import java.util.Arrays;
import s.b;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f34995b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.g f34996c;

    /* renamed from: a, reason: collision with root package name */
    public int f34994a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f34997d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f34998e = new int[8];
    public int[] f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f34999g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f35000h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f35001i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35002j = false;

    public a(b bVar, m2.g gVar) {
        this.f34995b = bVar;
        this.f34996c = gVar;
    }

    @Override // s.b.a
    public final void a(g gVar, float f) {
        if (f == gl.Code) {
            d(gVar, true);
            return;
        }
        int i10 = this.f35000h;
        b bVar = this.f34995b;
        if (i10 == -1) {
            this.f35000h = 0;
            this.f34999g[0] = f;
            this.f34998e[0] = gVar.f35033t;
            this.f[0] = -1;
            gVar.D++;
            gVar.a(bVar);
            this.f34994a++;
            if (!this.f35002j) {
                int i11 = this.f35001i + 1;
                this.f35001i = i11;
                int[] iArr = this.f34998e;
                if (i11 >= iArr.length) {
                    this.f35002j = true;
                    this.f35001i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f34994a; i13++) {
            int i14 = this.f34998e[i10];
            int i15 = gVar.f35033t;
            if (i14 == i15) {
                this.f34999g[i10] = f;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f[i10];
        }
        int i16 = this.f35001i;
        int i17 = i16 + 1;
        if (this.f35002j) {
            int[] iArr2 = this.f34998e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f34998e;
        if (i16 >= iArr3.length && this.f34994a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f34998e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f34998e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f34997d * 2;
            this.f34997d = i19;
            this.f35002j = false;
            this.f35001i = i16 - 1;
            this.f34999g = Arrays.copyOf(this.f34999g, i19);
            this.f34998e = Arrays.copyOf(this.f34998e, this.f34997d);
            this.f = Arrays.copyOf(this.f, this.f34997d);
        }
        this.f34998e[i16] = gVar.f35033t;
        this.f34999g[i16] = f;
        if (i12 != -1) {
            int[] iArr6 = this.f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f[i16] = this.f35000h;
            this.f35000h = i16;
        }
        gVar.D++;
        gVar.a(bVar);
        int i20 = this.f34994a + 1;
        this.f34994a = i20;
        if (!this.f35002j) {
            this.f35001i++;
        }
        int[] iArr7 = this.f34998e;
        if (i20 >= iArr7.length) {
            this.f35002j = true;
        }
        if (this.f35001i >= iArr7.length) {
            this.f35002j = true;
            this.f35001i = iArr7.length - 1;
        }
    }

    @Override // s.b.a
    public final int b() {
        return this.f34994a;
    }

    @Override // s.b.a
    public final float c(b bVar, boolean z10) {
        float f = f(bVar.f35003a);
        d(bVar.f35003a, z10);
        b.a aVar = bVar.f35006d;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g e10 = aVar.e(i10);
            k(e10, aVar.f(e10) * f, z10);
        }
        return f;
    }

    @Override // s.b.a
    public final void clear() {
        int i10 = this.f35000h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            g gVar = ((g[]) this.f34996c.f32648v)[this.f34998e[i10]];
            if (gVar != null) {
                gVar.b(this.f34995b);
            }
            i10 = this.f[i10];
        }
        this.f35000h = -1;
        this.f35001i = -1;
        this.f35002j = false;
        this.f34994a = 0;
    }

    @Override // s.b.a
    public final float d(g gVar, boolean z10) {
        int i10 = this.f35000h;
        if (i10 == -1) {
            return gl.Code;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f34994a) {
            if (this.f34998e[i10] == gVar.f35033t) {
                if (i10 == this.f35000h) {
                    this.f35000h = this.f[i10];
                } else {
                    int[] iArr = this.f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    gVar.b(this.f34995b);
                }
                gVar.D--;
                this.f34994a--;
                this.f34998e[i10] = -1;
                if (this.f35002j) {
                    this.f35001i = i10;
                }
                return this.f34999g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f[i10];
        }
        return gl.Code;
    }

    @Override // s.b.a
    public final g e(int i10) {
        int i11 = this.f35000h;
        for (int i12 = 0; i11 != -1 && i12 < this.f34994a; i12++) {
            if (i12 == i10) {
                return ((g[]) this.f34996c.f32648v)[this.f34998e[i11]];
            }
            i11 = this.f[i11];
        }
        return null;
    }

    @Override // s.b.a
    public final float f(g gVar) {
        int i10 = this.f35000h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            if (this.f34998e[i10] == gVar.f35033t) {
                return this.f34999g[i10];
            }
            i10 = this.f[i10];
        }
        return gl.Code;
    }

    @Override // s.b.a
    public final void g() {
        int i10 = this.f35000h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            float[] fArr = this.f34999g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f[i10];
        }
    }

    @Override // s.b.a
    public final float h(int i10) {
        int i11 = this.f35000h;
        for (int i12 = 0; i11 != -1 && i12 < this.f34994a; i12++) {
            if (i12 == i10) {
                return this.f34999g[i11];
            }
            i11 = this.f[i11];
        }
        return gl.Code;
    }

    @Override // s.b.a
    public final boolean i(g gVar) {
        int i10 = this.f35000h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            if (this.f34998e[i10] == gVar.f35033t) {
                return true;
            }
            i10 = this.f[i10];
        }
        return false;
    }

    @Override // s.b.a
    public final void j(float f) {
        int i10 = this.f35000h;
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            float[] fArr = this.f34999g;
            fArr[i10] = fArr[i10] / f;
            i10 = this.f[i10];
        }
    }

    @Override // s.b.a
    public final void k(g gVar, float f, boolean z10) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i10 = this.f35000h;
        b bVar = this.f34995b;
        if (i10 == -1) {
            this.f35000h = 0;
            this.f34999g[0] = f;
            this.f34998e[0] = gVar.f35033t;
            this.f[0] = -1;
            gVar.D++;
            gVar.a(bVar);
            this.f34994a++;
            if (!this.f35002j) {
                int i11 = this.f35001i + 1;
                this.f35001i = i11;
                int[] iArr = this.f34998e;
                if (i11 >= iArr.length) {
                    this.f35002j = true;
                    this.f35001i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f34994a; i13++) {
            int i14 = this.f34998e[i10];
            int i15 = gVar.f35033t;
            if (i14 == i15) {
                float[] fArr = this.f34999g;
                float f10 = fArr[i10] + f;
                if (f10 > -0.001f && f10 < 0.001f) {
                    f10 = 0.0f;
                }
                fArr[i10] = f10;
                if (f10 == gl.Code) {
                    if (i10 == this.f35000h) {
                        this.f35000h = this.f[i10];
                    } else {
                        int[] iArr2 = this.f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        gVar.b(bVar);
                    }
                    if (this.f35002j) {
                        this.f35001i = i10;
                    }
                    gVar.D--;
                    this.f34994a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f[i10];
        }
        int i16 = this.f35001i;
        int i17 = i16 + 1;
        if (this.f35002j) {
            int[] iArr3 = this.f34998e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f34998e;
        if (i16 >= iArr4.length && this.f34994a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f34998e;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f34998e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f34997d * 2;
            this.f34997d = i19;
            this.f35002j = false;
            this.f35001i = i16 - 1;
            this.f34999g = Arrays.copyOf(this.f34999g, i19);
            this.f34998e = Arrays.copyOf(this.f34998e, this.f34997d);
            this.f = Arrays.copyOf(this.f, this.f34997d);
        }
        this.f34998e[i16] = gVar.f35033t;
        this.f34999g[i16] = f;
        if (i12 != -1) {
            int[] iArr7 = this.f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f[i16] = this.f35000h;
            this.f35000h = i16;
        }
        gVar.D++;
        gVar.a(bVar);
        this.f34994a++;
        if (!this.f35002j) {
            this.f35001i++;
        }
        int i20 = this.f35001i;
        int[] iArr8 = this.f34998e;
        if (i20 >= iArr8.length) {
            this.f35002j = true;
            this.f35001i = iArr8.length - 1;
        }
    }

    public final String toString() {
        int i10 = this.f35000h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f34994a; i11++) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(com.ironsource.adapters.facebook.a.h(str, " -> "));
            j10.append(this.f34999g[i10]);
            j10.append(" : ");
            StringBuilder j11 = com.ironsource.adapters.facebook.a.j(j10.toString());
            j11.append(((g[]) this.f34996c.f32648v)[this.f34998e[i10]]);
            str = j11.toString();
            i10 = this.f[i10];
        }
        return str;
    }
}
