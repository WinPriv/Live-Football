package l5;

import d6.g0;
import java.io.IOException;
import java.util.Arrays;
import k4.i0;
import o5.g;

/* compiled from: DataChunk.java */
/* loaded from: classes2.dex */
public abstract class j extends e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f32530j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f32531k;

    public j(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, byte[] bArr) {
        super(jVar, mVar, 3, i0Var, i10, obj, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        j jVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = g0.f;
            jVar2 = this;
        } else {
            jVar2 = this;
            bArr2 = bArr;
        }
        jVar2.f32530j = bArr2;
    }

    @Override // c6.b0.d
    public final void a() {
        this.f32531k = true;
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        try {
            this.f32512i.f(this.f32506b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f32531k) {
                byte[] bArr = this.f32530j;
                if (bArr.length < i11 + 16384) {
                    this.f32530j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f32512i.read(this.f32530j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f32531k) {
                ((g.a) this).f33654l = Arrays.copyOf(this.f32530j, i11);
            }
        } finally {
            androidx.activity.n.o0(this.f32512i);
        }
    }
}
