package f3;

import android.content.Context;
import android.net.Uri;
import e3.n;
import e3.o;
import e3.r;
import h3.z;
import java.io.InputStream;
import y2.g;
import z2.a;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes.dex */
public final class c implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28047a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f28048a;

        public a(Context context) {
            this.f28048a = context;
        }

        @Override // e3.o
        public final n<Uri, InputStream> a(r rVar) {
            return new c(this.f28048a);
        }
    }

    public c(Context context) {
        this.f28047a = context.getApplicationContext();
    }

    @Override // e3.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (a0.a.R0(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // e3.n
    public final n.a<InputStream> b(Uri uri, int i10, int i11, g gVar) {
        boolean z10;
        Uri uri2 = uri;
        boolean z11 = true;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Long l10 = (Long) gVar.c(z.f28757d);
            if (l10 == null || l10.longValue() != -1) {
                z11 = false;
            }
            if (z11) {
                s3.d dVar = new s3.d(uri2);
                Context context = this.f28047a;
                return new n.a<>(dVar, z2.a.c(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
