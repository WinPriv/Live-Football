package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* renamed from: a, reason: collision with root package name */
    private final y f15812a;

    public a() {
        super("Mp4WebvttDecoder");
        this.f15812a = new y();
    }

    @Override // com.applovin.exoplayer2.i.d
    public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
        this.f15812a.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f15812a.a() > 0) {
            if (this.f15812a.a() >= 8) {
                int q10 = this.f15812a.q();
                if (this.f15812a.q() == 1987343459) {
                    arrayList.add(a(this.f15812a, q10 - 8));
                } else {
                    this.f15812a.e(q10 - 8);
                }
            } else {
                throw new com.applovin.exoplayer2.i.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, int i10) throws com.applovin.exoplayer2.i.h {
        CharSequence charSequence = null;
        a.C0175a c0175a = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int q10 = yVar.q();
                int q11 = yVar.q();
                int i11 = q10 - 8;
                String a10 = ai.a(yVar.d(), yVar.c(), i11);
                yVar.e(i11);
                i10 = (i10 - 8) - i11;
                if (q11 == 1937011815) {
                    c0175a = f.a(a10);
                } else if (q11 == 1885436268) {
                    charSequence = f.a((String) null, a10.trim(), (List<d>) Collections.emptyList());
                }
            } else {
                throw new com.applovin.exoplayer2.i.h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c0175a != null) {
            return c0175a.a(charSequence).e();
        }
        return f.a(charSequence);
    }
}
