package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public MediaDescription A;

    /* renamed from: s, reason: collision with root package name */
    public final String f416s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f417t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f418u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f419v;

    /* renamed from: w, reason: collision with root package name */
    public final Bitmap f420w;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f421x;
    public final Bundle y;

    /* renamed from: z, reason: collision with root package name */
    public final Uri f422z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f416s = str;
        this.f417t = charSequence;
        this.f418u = charSequence2;
        this.f419v = charSequence3;
        this.f420w = bitmap;
        this.f421x = uri;
        this.y = bundle;
        this.f422z = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5d
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.b.g(r13)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r13)
            java.lang.CharSequence r4 = android.support.v4.media.MediaDescriptionCompat.b.h(r13)
            java.lang.CharSequence r5 = android.support.v4.media.MediaDescriptionCompat.b.c(r13)
            android.graphics.Bitmap r6 = android.support.v4.media.MediaDescriptionCompat.b.e(r13)
            android.net.Uri r7 = android.support.v4.media.MediaDescriptionCompat.b.f(r13)
            android.os.Bundle r1 = android.support.v4.media.MediaDescriptionCompat.b.d(r13)
            if (r1 == 0) goto L27
            android.os.Bundle r1 = android.support.v4.media.session.MediaSessionCompat.b(r1)
        L27:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L32
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 == 0) goto L4c
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L46
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L46
            r8 = r0
            goto L4d
        L46:
            r1.remove(r8)
            r1.remove(r10)
        L4c:
            r8 = r1
        L4d:
            if (r9 == 0) goto L50
            goto L55
        L50:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r13)
            r9 = r0
        L55:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.A = r13
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f417t) + ", " + ((Object) this.f418u) + ", " + ((Object) this.f419v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescription = this.A;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f416s);
            b.p(b10, this.f417t);
            b.o(b10, this.f418u);
            b.j(b10, this.f419v);
            b.l(b10, this.f420w);
            b.m(b10, this.f421x);
            b.k(b10, this.y);
            c.b(b10, this.f422z);
            mediaDescription = b.a(b10);
            this.A = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
