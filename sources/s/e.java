package s;

import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class e extends s.b {
    public g[] f;

    /* renamed from: g, reason: collision with root package name */
    public g[] f35026g;

    /* renamed from: h, reason: collision with root package name */
    public int f35027h;

    /* renamed from: i, reason: collision with root package name */
    public final b f35028i;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<g> {
        @Override // java.util.Comparator
        public final int compare(g gVar, g gVar2) {
            return gVar.f35033t - gVar2.f35033t;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public g f35029a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f35029a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
                    j10.append(this.f35029a.f35038z[i10]);
                    j10.append(" ");
                    str = j10.toString();
                }
            }
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "] ");
            l10.append(this.f35029a);
            return l10.toString();
        }
    }

    public e(m2.g gVar) {
        super(gVar);
        this.f = new g[128];
        this.f35026g = new g[128];
        this.f35027h = 0;
        this.f35028i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r9 < r8) goto L30;
     */
    @Override // s.b, s.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s.g a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f35027h
            if (r2 >= r4) goto L57
            s.g[] r4 = r11.f
            r5 = r4[r2]
            int r6 = r5.f35033t
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            s.e$b r6 = r11.f35028i
            r6.f35029a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            s.g r4 = r6.f35029a
            float[] r4 = r4.f35038z
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f35038z
            r8 = r8[r7]
            s.g r9 = r6.f35029a
            float[] r9 = r9.f35038z
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            s.g[] r12 = r11.f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.a(boolean[]):s.g");
    }

    @Override // s.b
    public final boolean e() {
        if (this.f35027h == 0) {
            return true;
        }
        return false;
    }

    @Override // s.b
    public final void i(c cVar, s.b bVar, boolean z10) {
        boolean z11;
        g gVar = bVar.f35003a;
        if (gVar == null) {
            return;
        }
        b.a aVar = bVar.f35006d;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g e10 = aVar.e(i10);
            float h10 = aVar.h(i10);
            b bVar2 = this.f35028i;
            bVar2.f35029a = e10;
            boolean z12 = e10.f35032s;
            float[] fArr = gVar.f35038z;
            if (z12) {
                boolean z13 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar2.f35029a.f35038z;
                    float f = (fArr[i11] * h10) + fArr2[i11];
                    fArr2[i11] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar2.f35029a.f35038z[i11] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    e.this.k(bVar2.f35029a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != gl.Code) {
                        float f11 = f10 * h10;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        bVar2.f35029a.f35038z[i12] = f11;
                    } else {
                        bVar2.f35029a.f35038z[i12] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                j(e10);
            }
            this.f35004b = (bVar.f35004b * h10) + this.f35004b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i10;
        int i11 = this.f35027h + 1;
        g[] gVarArr = this.f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f = gVarArr2;
            this.f35026g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f;
        int i12 = this.f35027h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f35027h = i13;
        if (i13 > 1 && gVarArr3[i13 - 1].f35033t > gVar.f35033t) {
            int i14 = 0;
            while (true) {
                i10 = this.f35027h;
                if (i14 >= i10) {
                    break;
                }
                this.f35026g[i14] = this.f[i14];
                i14++;
            }
            Arrays.sort(this.f35026g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f35027h; i15++) {
                this.f[i15] = this.f35026g[i15];
            }
        }
        gVar.f35032s = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i10 = 0;
        while (i10 < this.f35027h) {
            if (this.f[i10] == gVar) {
                while (true) {
                    int i11 = this.f35027h;
                    if (i10 < i11 - 1) {
                        g[] gVarArr = this.f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f35027h = i11 - 1;
                        gVar.f35032s = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // s.b
    public final String toString() {
        String str = " goal -> (" + this.f35004b + ") : ";
        for (int i10 = 0; i10 < this.f35027h; i10++) {
            g gVar = this.f[i10];
            b bVar = this.f35028i;
            bVar.f35029a = gVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
