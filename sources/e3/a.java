package e3;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import e3.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f27663a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0366a<Data> f27664b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: e3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0366a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, AssetFileDescriptor>, InterfaceC0366a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f27665a;

        public b(AssetManager assetManager) {
            this.f27665a = assetManager;
        }

        @Override // e3.o
        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new a(this.f27665a, this);
        }

        @Override // e3.a.InterfaceC0366a
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0366a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f27666a;

        public c(AssetManager assetManager) {
            this.f27666a = assetManager;
        }

        @Override // e3.o
        public final n<Uri, InputStream> a(r rVar) {
            return new a(this.f27666a, this);
        }

        @Override // e3.a.InterfaceC0366a
        public final com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }
    }

    public a(AssetManager assetManager, InterfaceC0366a<Data> interfaceC0366a) {
        this.f27663a = assetManager;
        this.f27664b = interfaceC0366a;
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // e3.n
    public final n.a b(Uri uri, int i10, int i11, y2.g gVar) {
        Uri uri2 = uri;
        return new n.a(new s3.d(uri2), this.f27664b.b(this.f27663a, uri2.toString().substring(22)));
    }
}
