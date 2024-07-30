package com.applovin.exoplayer2.e.h;

import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.b.s;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.w;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14515a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f14516b;

    public static boolean a(y yVar) {
        int a10 = yVar.a();
        byte[] bArr = f14515a;
        if (a10 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        return b(a(yVar.d()));
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f14516b = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) {
        if (!this.f14516b) {
            byte[] copyOf = Arrays.copyOf(yVar.d(), yVar.b());
            aVar.f14529a = new v.a().f(o.H).k(s.a(copyOf)).l(48000).a(s.b(copyOf)).a();
            this.f14516b = true;
            return true;
        }
        com.applovin.exoplayer2.l.a.b(aVar.f14529a);
        boolean z10 = yVar.q() == 1332770163;
        yVar.d(0);
        return z10;
    }

    private long a(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & DefaultClassResolver.NAME;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r1 : i13 >= 12 ? 10000 << (r1 & 1) : (i13 & 3) == 3 ? w.f22171t : 10000 << r1);
    }
}
