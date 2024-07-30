package e3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e3.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f27736b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final c<Data> f27737a;

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f27738a;

        public a(ContentResolver contentResolver) {
            this.f27738a = contentResolver;
        }

        @Override // e3.o
        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new v(this);
        }

        @Override // e3.v.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f27738a, uri);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f27739a;

        public b(ContentResolver contentResolver) {
            this.f27739a = contentResolver;
        }

        @Override // e3.o
        public final n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new v(this);
        }

        @Override // e3.v.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f27739a, uri);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f27740a;

        public d(ContentResolver contentResolver) {
            this.f27740a = contentResolver;
        }

        @Override // e3.o
        public final n<Uri, InputStream> a(r rVar) {
            return new v(this);
        }

        @Override // e3.v.c
        public final com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f27740a, uri);
        }
    }

    public v(c<Data> cVar) {
        this.f27737a = cVar;
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        return f27736b.contains(uri.getScheme());
    }

    @Override // e3.n
    public final n.a b(Uri uri, int i10, int i11, y2.g gVar) {
        Uri uri2 = uri;
        return new n.a(new s3.d(uri2), this.f27737a.b(uri2));
    }
}
