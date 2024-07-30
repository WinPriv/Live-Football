package com.google.android.datatransport.cct;

import a4.d;
import a4.h;
import a4.m;
import androidx.annotation.Keep;
import x3.b;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // a4.d
    public m create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
