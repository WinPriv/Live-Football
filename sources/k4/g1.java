package k4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes2.dex */
public final class g1 extends a {
    public final int[] A;
    public final q1[] B;
    public final Object[] C;
    public final HashMap<Object, Integer> D;

    /* renamed from: x, reason: collision with root package name */
    public final int f30470x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f30471z;

    public g1(List list, j5.h0 h0Var) {
        super(h0Var);
        int size = list.size();
        this.f30471z = new int[size];
        this.A = new int[size];
        this.B = new q1[size];
        this.C = new Object[size];
        this.D = new HashMap<>();
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            this.B[i12] = s0Var.b();
            this.A[i12] = i10;
            this.f30471z[i12] = i11;
            i10 += this.B[i12].o();
            i11 += this.B[i12].h();
            this.C[i12] = s0Var.a();
            this.D.put(this.C[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f30470x = i10;
        this.y = i11;
    }

    @Override // k4.q1
    public final int h() {
        return this.y;
    }

    @Override // k4.q1
    public final int o() {
        return this.f30470x;
    }
}
