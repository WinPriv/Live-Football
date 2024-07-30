package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.i.d {

    /* renamed from: a, reason: collision with root package name */
    private final y f15859a;

    /* renamed from: b, reason: collision with root package name */
    private final c f15860b;

    public g() {
        super("WebvttDecoder");
        this.f15859a = new y();
        this.f15860b = new c();
    }

    private static void b(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.C()));
    }

    @Override // com.applovin.exoplayer2.i.d
    public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
        e a10;
        this.f15859a.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.a(this.f15859a);
            do {
            } while (!TextUtils.isEmpty(this.f15859a.C()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a11 = a(this.f15859a);
                if (a11 == 0) {
                    return new i(arrayList2);
                }
                if (a11 == 1) {
                    b(this.f15859a);
                } else if (a11 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f15859a.C();
                        arrayList.addAll(this.f15860b.a(this.f15859a));
                    } else {
                        throw new com.applovin.exoplayer2.i.h("A style block was found after the first cue.");
                    }
                } else if (a11 == 3 && (a10 = f.a(this.f15859a, arrayList)) != null) {
                    arrayList2.add(a10);
                }
            }
        } catch (ai e10) {
            throw new com.applovin.exoplayer2.i.h(e10);
        }
    }

    private static int a(y yVar) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = yVar.c();
            String C = yVar.C();
            if (C == null) {
                i10 = 0;
            } else if ("STYLE".equals(C)) {
                i10 = 2;
            } else {
                i10 = C.startsWith("NOTE") ? 1 : 3;
            }
        }
        yVar.d(i11);
        return i10;
    }
}
