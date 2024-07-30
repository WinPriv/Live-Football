package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: s, reason: collision with root package name */
    public final String f19756s;

    /* renamed from: t, reason: collision with root package name */
    public final AssetManager f19757t;

    /* renamed from: u, reason: collision with root package name */
    public T f19758u;

    public b(AssetManager assetManager, String str) {
        this.f19757t = assetManager;
        this.f19756s = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f19758u;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final y2.a d() {
        return y2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super T> aVar) {
        try {
            T f = f(this.f19757t, this.f19756s);
            this.f19758u = f;
            aVar.f(f);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
