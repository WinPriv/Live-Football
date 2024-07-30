package z2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: s, reason: collision with root package name */
    public final Uri f36894s;

    /* renamed from: t, reason: collision with root package name */
    public final c f36895t;

    /* renamed from: u, reason: collision with root package name */
    public InputStream f36896u;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0514a implements z2.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f36897b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f36898a;

        public C0514a(ContentResolver contentResolver) {
            this.f36898a = contentResolver;
        }

        @Override // z2.b
        public final Cursor a(Uri uri) {
            return this.f36898a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f36897b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    public static class b implements z2.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f36899b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f36900a;

        public b(ContentResolver contentResolver) {
            this.f36900a = contentResolver;
        }

        @Override // z2.b
        public final Cursor a(Uri uri) {
            return this.f36900a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f36899b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f36894s = uri;
        this.f36895t = cVar;
    }

    public static a c(Context context, Uri uri, z2.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f19719u.a().d(), bVar, com.bumptech.glide.b.b(context).f19720v, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f36896u;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final y2.a d() {
        return y2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(j jVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f = f();
            this.f36896u = f;
            aVar.f(f);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:38), block:B:70:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream f() throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.a.f():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
