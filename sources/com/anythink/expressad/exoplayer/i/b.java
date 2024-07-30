package com.anythink.expressad.exoplayer.i;

import android.os.SystemClock;
import com.anythink.expressad.exoplayer.h.ae;
import com.anythink.expressad.exoplayer.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f8612a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8613b;

    /* renamed from: c, reason: collision with root package name */
    private int f8614c;

    /* renamed from: g, reason: collision with root package name */
    protected final ae f8615g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f8616h;

    /* renamed from: i, reason: collision with root package name */
    protected final int[] f8617i;

    /* loaded from: classes.dex */
    public static final class a implements Comparator<m> {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        private static int a(m mVar, m mVar2) {
            return mVar2.f9254d - mVar.f9254d;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            return mVar2.f9254d - mVar.f9254d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ae aeVar, int... iArr) {
        boolean z10;
        int i10 = 0;
        Object[] objArr = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.f8615g = (ae) com.anythink.expressad.exoplayer.k.a.a(aeVar);
        int length = iArr.length;
        this.f8616h = length;
        this.f8612a = new m[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f8612a[i11] = aeVar.a(iArr[i11]);
        }
        Arrays.sort(this.f8612a, new a(objArr == true ? 1 : 0));
        this.f8617i = new int[this.f8616h];
        while (true) {
            int i12 = this.f8616h;
            if (i10 < i12) {
                this.f8617i[i10] = aeVar.a(this.f8612a[i10]);
                i10++;
            } else {
                this.f8613b = new long[i12];
                return;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public void a() {
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int b(int i10) {
        return this.f8617i[i10];
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f8616h; i11++) {
            if (this.f8617i[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8615g == bVar.f8615g && Arrays.equals(this.f8617i, bVar.f8617i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final ae f() {
        return this.f8615g;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int g() {
        return this.f8617i.length;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final m h() {
        return this.f8612a[b()];
    }

    public int hashCode() {
        if (this.f8614c == 0) {
            this.f8614c = Arrays.hashCode(this.f8617i) + (System.identityHashCode(this.f8615g) * 31);
        }
        return this.f8614c;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int i() {
        return this.f8617i[b()];
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public void a(float f) {
    }

    public final boolean b(int i10, long j10) {
        return this.f8613b[i10] > j10;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final m a(int i10) {
        return this.f8612a[i10];
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int a(m mVar) {
        for (int i10 = 0; i10 < this.f8616h; i10++) {
            if (this.f8612a[i10] == mVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public int a(long j10, List<? extends com.anythink.expressad.exoplayer.h.b.i> list) {
        return list.size();
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final boolean a(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b10 = b(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f8616h && !b10) {
            b10 = (i11 == i10 || b(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!b10) {
            return false;
        }
        long[] jArr = this.f8613b;
        jArr[i10] = Math.max(jArr[i10], elapsedRealtime + j10);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final void e() {
    }
}
