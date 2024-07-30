package e3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class j implements n<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27693a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f27694a;

        public a(Context context) {
            this.f27694a = context;
        }

        @Override // e3.o
        public final n<Uri, File> a(r rVar) {
            return new j(this.f27694a);
        }
    }

    public j(Context context) {
        this.f27693a = context;
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        return a0.a.R0(uri);
    }

    @Override // e3.n
    public final n.a<File> b(Uri uri, int i10, int i11, y2.g gVar) {
        Uri uri2 = uri;
        return new n.a<>(new s3.d(uri2), new b(this.f27693a, uri2));
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: u, reason: collision with root package name */
        public static final String[] f27695u = {"_data"};

        /* renamed from: s, reason: collision with root package name */
        public final Context f27696s;

        /* renamed from: t, reason: collision with root package name */
        public final Uri f27697t;

        public b(Context context, Uri uri) {
            this.f27696s = context;
            this.f27697t = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f27696s.getContentResolver().query(this.f27697t, f27695u, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f27697t));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
