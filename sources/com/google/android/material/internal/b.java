package com.google.android.material.internal;

import android.graphics.Typeface;
import z6.a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes2.dex */
public final class b implements a.InterfaceC0516a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f20826a;

    public b(c cVar) {
        this.f20826a = cVar;
    }

    @Override // z6.a.InterfaceC0516a
    public final void a(Typeface typeface) {
        c cVar = this.f20826a;
        if (cVar.j(typeface)) {
            cVar.h(false);
        }
    }
}
