package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class r implements v {

    /* renamed from: a, reason: collision with root package name */
    private final int f16183a;

    public r() {
        this(-1);
    }

    @Override // com.applovin.exoplayer2.k.v
    public long a(v.a aVar) {
        IOException iOException = aVar.f16201c;
        return ((iOException instanceof ai) || (iOException instanceof FileNotFoundException) || (iOException instanceof t.a) || (iOException instanceof w.g) || j.a(iOException)) ? com.anythink.expressad.exoplayer.b.f7291b : Math.min((aVar.f16202d - 1) * 1000, 5000);
    }

    public r(int i10) {
        this.f16183a = i10;
    }

    @Override // com.applovin.exoplayer2.k.v
    public int a(int i10) {
        int i11 = this.f16183a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }
}
