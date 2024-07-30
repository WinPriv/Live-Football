package com.bumptech.glide;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class l implements t3.g<k> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f19750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f19751c;

    public l(b bVar, ArrayList arrayList, n3.a aVar) {
        this.f19750b = bVar;
        this.f19751c = arrayList;
    }

    @Override // t3.g
    public final k get() {
        if (!this.f19749a) {
            this.f19749a = true;
            Trace.beginSection("Glide registry");
            try {
                return m.a(this.f19750b, this.f19751c);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}
