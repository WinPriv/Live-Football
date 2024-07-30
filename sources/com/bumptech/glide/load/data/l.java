package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: s, reason: collision with root package name */
    public final Uri f19777s;

    /* renamed from: t, reason: collision with root package name */
    public final ContentResolver f19778t;

    /* renamed from: u, reason: collision with root package name */
    public T f19779u;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f19778t = contentResolver;
        this.f19777s = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t10 = this.f19779u;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final y2.a d() {
        return y2.a.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f19778t, this.f19777s);
            this.f19779u = r32;
            aVar.f(r32);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
