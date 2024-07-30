package com.google.gson.internal.bind;

import m8.a0;
import m8.b0;
import m8.i;
import m8.x;
import m8.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ObjectTypeAdapter$1 implements b0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f21341s;

    public ObjectTypeAdapter$1(x.a aVar) {
        this.f21341s = aVar;
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        if (aVar.getRawType() == Object.class) {
            return new e(iVar, this.f21341s);
        }
        return null;
    }
}
