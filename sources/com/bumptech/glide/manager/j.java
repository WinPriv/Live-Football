package com.bumptech.glide.manager;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.i f19788s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f19789t;

    public j(k kVar, androidx.lifecycle.i iVar) {
        this.f19789t = kVar;
        this.f19788s = iVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
        this.f19789t.f19790a.remove(this.f19788s);
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
    }
}
