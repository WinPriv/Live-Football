package com.anythink.expressad.exoplayer.i;

import com.anythink.expressad.exoplayer.aa;
import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8687a;

    /* renamed from: b, reason: collision with root package name */
    public final aa[] f8688b;

    /* renamed from: c, reason: collision with root package name */
    public final g f8689c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8690d;

    public i(aa[] aaVarArr, f[] fVarArr, Object obj) {
        this.f8688b = aaVarArr;
        this.f8689c = new g(fVarArr);
        this.f8690d = obj;
        this.f8687a = aaVarArr.length;
    }

    public final boolean a(int i10) {
        return this.f8688b[i10] != null;
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.f8689c.f8683a != this.f8689c.f8683a) {
            return false;
        }
        for (int i10 = 0; i10 < this.f8689c.f8683a; i10++) {
            if (!a(iVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(i iVar, int i10) {
        return iVar != null && af.a(this.f8688b[i10], iVar.f8688b[i10]) && af.a(this.f8689c.a(i10), iVar.f8689c.a(i10));
    }
}
