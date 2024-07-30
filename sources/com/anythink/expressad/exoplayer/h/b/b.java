package com.anythink.expressad.exoplayer.h.b;

import android.util.Log;
import com.anythink.expressad.exoplayer.e.m;
import com.anythink.expressad.exoplayer.h.b.d;
import com.anythink.expressad.exoplayer.h.x;

/* loaded from: classes.dex */
public final class b implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8263a = "BaseMediaChunkOutput";

    /* renamed from: b, reason: collision with root package name */
    private final int[] f8264b;

    /* renamed from: c, reason: collision with root package name */
    private final x[] f8265c;

    public b(int[] iArr, x[] xVarArr) {
        this.f8264b = iArr;
        this.f8265c = xVarArr;
    }

    @Override // com.anythink.expressad.exoplayer.h.b.d.b
    public final m a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f8264b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.f8265c[i11];
                }
                i11++;
            } else {
                Log.e(f8263a, "Unmatched track of type: ".concat(String.valueOf(i10)));
                return new com.anythink.expressad.exoplayer.e.d();
            }
        }
    }

    public final int[] a() {
        int[] iArr = new int[this.f8265c.length];
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f8265c;
            if (i10 >= xVarArr.length) {
                return iArr;
            }
            x xVar = xVarArr[i10];
            if (xVar != null) {
                iArr[i10] = xVar.b();
            }
            i10++;
        }
    }

    public final void a(long j10) {
        for (x xVar : this.f8265c) {
            if (xVar != null) {
                xVar.a(j10);
            }
        }
    }
}
