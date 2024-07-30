package f3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import e3.n;
import e3.o;
import e3.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import y2.g;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28049a;

    /* renamed from: b, reason: collision with root package name */
    public final n<File, DataT> f28050b;

    /* renamed from: c, reason: collision with root package name */
    public final n<Uri, DataT> f28051c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<DataT> f28052d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f28053a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<DataT> f28054b;

        public a(Context context, Class<DataT> cls) {
            this.f28053a = context;
            this.f28054b = cls;
        }

        @Override // e3.o
        public final n<Uri, DataT> a(r rVar) {
            Class<DataT> cls = this.f28054b;
            return new d(this.f28053a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: f3.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0376d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] C = {"_data"};
        public volatile boolean A;
        public volatile com.bumptech.glide.load.data.d<DataT> B;

        /* renamed from: s, reason: collision with root package name */
        public final Context f28055s;

        /* renamed from: t, reason: collision with root package name */
        public final n<File, DataT> f28056t;

        /* renamed from: u, reason: collision with root package name */
        public final n<Uri, DataT> f28057u;

        /* renamed from: v, reason: collision with root package name */
        public final Uri f28058v;

        /* renamed from: w, reason: collision with root package name */
        public final int f28059w;

        /* renamed from: x, reason: collision with root package name */
        public final int f28060x;
        public final g y;

        /* renamed from: z, reason: collision with root package name */
        public final Class<DataT> f28061z;

        public C0376d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, g gVar, Class<DataT> cls) {
            this.f28055s = context.getApplicationContext();
            this.f28056t = nVar;
            this.f28057u = nVar2;
            this.f28058v = uri;
            this.f28059w = i10;
            this.f28060x = i11;
            this.y = gVar;
            this.f28061z = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f28061z;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.B;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            boolean z10;
            n.a<DataT> b10;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            g gVar = this.y;
            int i10 = this.f28060x;
            int i11 = this.f28059w;
            Context context = this.f28055s;
            if (isExternalStorageLegacy) {
                Uri uri = this.f28058v;
                try {
                    Cursor query = context.getContentResolver().query(uri, C, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b10 = this.f28056t.b(file, i11, i10, gVar);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Uri uri2 = this.f28058v;
                if (z10) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                b10 = this.f28057u.b(uri2, i11, i10, gVar);
            }
            if (b10 == null) {
                return null;
            }
            return b10.f27705c;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.A = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.B;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f28058v));
                } else {
                    this.B = c10;
                    if (this.A) {
                        cancel();
                    } else {
                        c10.e(jVar, aVar);
                    }
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f28049a = context.getApplicationContext();
        this.f28050b = nVar;
        this.f28051c = nVar2;
        this.f28052d = cls;
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && a0.a.R0(uri2)) {
            return true;
        }
        return false;
    }

    @Override // e3.n
    public final n.a b(Uri uri, int i10, int i11, g gVar) {
        Uri uri2 = uri;
        return new n.a(new s3.d(uri2), new C0376d(this.f28049a, this.f28050b, this.f28051c, uri2, i10, i11, gVar, this.f28052d));
    }
}
