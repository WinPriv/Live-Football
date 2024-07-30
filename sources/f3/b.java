package f3;

import android.content.Context;
import android.net.Uri;
import e3.n;
import e3.o;
import e3.r;
import java.io.InputStream;
import y2.g;
import z2.a;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes.dex */
public final class b implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28045a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f28046a;

        public a(Context context) {
            this.f28046a = context;
        }

        @Override // e3.o
        public final n<Uri, InputStream> a(r rVar) {
            return new b(this.f28046a);
        }
    }

    public b(Context context) {
        this.f28045a = context.getApplicationContext();
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (a0.a.R0(uri2) && !uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // e3.n
    public final n.a<InputStream> b(Uri uri, int i10, int i11, g gVar) {
        boolean z10;
        Uri uri2 = uri;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            s3.d dVar = new s3.d(uri2);
            Context context = this.f28045a;
            return new n.a<>(dVar, z2.a.c(context, uri2, new a.C0514a(context.getContentResolver())));
        }
        return null;
    }
}
