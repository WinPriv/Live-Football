package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.huawei.openalliance.ad.constant.av;
import java.util.Locale;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f33041a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f33042a;

        public a(ClipData clipData, int i10) {
            this.f33042a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // n0.c.b
        public final void a(Uri uri) {
            this.f33042a.setLinkUri(uri);
        }

        @Override // n0.c.b
        public final void b(int i10) {
            this.f33042a.setFlags(i10);
        }

        @Override // n0.c.b
        public final c build() {
            ContentInfo build;
            build = this.f33042a.build();
            return new c(new d(build));
        }

        @Override // n0.c.b
        public final void setExtras(Bundle bundle) {
            this.f33042a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: n0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0443c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f33043a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33044b;

        /* renamed from: c, reason: collision with root package name */
        public int f33045c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f33046d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f33047e;

        public C0443c(ClipData clipData, int i10) {
            this.f33043a = clipData;
            this.f33044b = i10;
        }

        @Override // n0.c.b
        public final void a(Uri uri) {
            this.f33046d = uri;
        }

        @Override // n0.c.b
        public final void b(int i10) {
            this.f33045c = i10;
        }

        @Override // n0.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // n0.c.b
        public final void setExtras(Bundle bundle) {
            this.f33047e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f33048a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f33048a = contentInfo;
        }

        @Override // n0.c.e
        public final ClipData a() {
            ClipData clip;
            clip = this.f33048a.getClip();
            return clip;
        }

        @Override // n0.c.e
        public final int b() {
            int flags;
            flags = this.f33048a.getFlags();
            return flags;
        }

        @Override // n0.c.e
        public final ContentInfo c() {
            return this.f33048a;
        }

        @Override // n0.c.e
        public final int d() {
            int source;
            source = this.f33048a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f33048a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f33049a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33050b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33051c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f33052d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f33053e;

        public f(C0443c c0443c) {
            ClipData clipData = c0443c.f33043a;
            clipData.getClass();
            this.f33049a = clipData;
            int i10 = c0443c.f33044b;
            if (i10 >= 0) {
                if (i10 <= 5) {
                    this.f33050b = i10;
                    int i11 = c0443c.f33045c;
                    if ((i11 & 1) == i11) {
                        this.f33051c = i11;
                        this.f33052d = c0443c.f33046d;
                        this.f33053e = c0443c.f33047e;
                        return;
                    } else {
                        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                    }
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", av.aq, 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", av.aq, 0, 5));
        }

        @Override // n0.c.e
        public final ClipData a() {
            return this.f33049a;
        }

        @Override // n0.c.e
        public final int b() {
            return this.f33051c;
        }

        @Override // n0.c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // n0.c.e
        public final int d() {
            return this.f33050b;
        }

        public final String toString() {
            String str;
            String valueOf;
            String str2;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f33049a.getDescription());
            sb2.append(", source=");
            int i10 = this.f33050b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    str = String.valueOf(i10);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb2.append(str);
            sb2.append(", flags=");
            int i11 = this.f33051c;
            if ((i11 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i11);
            }
            sb2.append(valueOf);
            String str3 = "";
            Uri uri = this.f33052d;
            if (uri == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str2);
            if (this.f33053e != null) {
                str3 = ", hasExtras";
            }
            return a3.l.p(sb2, str3, "}");
        }
    }

    public c(e eVar) {
        this.f33041a = eVar;
    }

    public final String toString() {
        return this.f33041a.toString();
    }
}
