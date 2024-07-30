package j3;

import a3.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import y2.g;
import y2.i;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes.dex */
public final class e implements i<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final y2.f<Resources.Theme> f29637b = new y2.f<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, y2.f.f36562e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f29638a;

    public e(Context context) {
        this.f29638a = context.getApplicationContext();
    }

    @Override // y2.i
    public final boolean a(Uri uri, g gVar) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // y2.i
    public final /* bridge */ /* synthetic */ x<Drawable> b(Uri uri, int i10, int i11, g gVar) throws IOException {
        return c(uri, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a3.x c(android.net.Uri r10, y2.g r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAuthority()
            android.content.Context r1 = r9.f29638a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L12
            goto L22
        L12:
            android.content.Context r2 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L23
        L17:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Ld7
        L22:
            r2 = r1
        L23:
            java.util.List r4 = r10.getPathSegments()
            int r5 = r4.size()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L6e
            java.util.List r4 = r10.getPathSegments()
            java.lang.String r5 = r10.getAuthority()
            java.lang.Object r6 = r4.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r8 = r2.getResources()
            int r5 = r8.getIdentifier(r4, r6, r5)
            if (r5 != 0) goto L57
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r8 = "android"
            int r5 = r5.getIdentifier(r4, r6, r8)
        L57:
            if (r5 == 0) goto L5a
            goto L84
        L5a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find resource id for: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L6e:
            int r4 = r4.size()
            java.lang.String r5 = "Unrecognized Uri format: "
            if (r4 != r7) goto Lc5
            java.util.List r4 = r10.getPathSegments()
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.NumberFormatException -> Lb2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> Lb2
            int r5 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lb2
        L84:
            y2.f<android.content.res.Resources$Theme> r10 = j3.e.f29637b
            java.lang.Object r10 = r11.c(r10)
            android.content.res.Resources$Theme r10 = (android.content.res.Resources.Theme) r10
            java.lang.String r11 = r2.getPackageName()
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L98
            if (r10 != 0) goto L99
        L98:
            r3 = r7
        L99:
            java.lang.String r11 = "Can't get a theme from another package"
            androidx.activity.n.m0(r11, r3)
            r11 = 0
            if (r10 != 0) goto La6
            android.graphics.drawable.Drawable r10 = j3.b.a(r1, r2, r5, r11)
            goto Laa
        La6:
            android.graphics.drawable.Drawable r10 = j3.b.a(r1, r1, r5, r10)
        Laa:
            if (r10 == 0) goto Lb1
            j3.d r11 = new j3.d
            r11.<init>(r10)
        Lb1:
            return r11
        Lb2:
            r11 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10, r11)
            throw r0
        Lc5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        Ld7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to obtain context or unrecognized Uri format for: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.c(android.net.Uri, y2.g):a3.x");
    }
}
