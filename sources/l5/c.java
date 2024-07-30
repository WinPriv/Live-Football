package l5;

import d6.p;
import j5.e0;
import l5.f;
import p4.w;

/* compiled from: BaseMediaChunkOutput.java */
/* loaded from: classes2.dex */
public final class c implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f32491a;

    /* renamed from: b, reason: collision with root package name */
    public final e0[] f32492b;

    public c(int[] iArr, e0[] e0VarArr) {
        this.f32491a = iArr;
        this.f32492b = e0VarArr;
    }

    public final w a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f32491a;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.f32492b[i11];
                }
                i11++;
            } else {
                p.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new p4.g();
            }
        }
    }
}
