package com.applovin.exoplayer2.i.b;

import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.y;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final b f15619a;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        y yVar = new y(list.get(0));
        this.f15619a = new b(yVar.i(), yVar.i());
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f15619a.a();
        }
        return new c(this.f15619a.a(bArr, i10));
    }
}
