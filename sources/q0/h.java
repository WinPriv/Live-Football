package q0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final c f34557a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34557a = new a(uri, clipDescription, uri2);
        } else {
            this.f34557a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f34558a;

        public a(Object obj) {
            this.f34558a = (InputContentInfo) obj;
        }

        @Override // q0.h.c
        public final Uri a() {
            Uri contentUri;
            contentUri = this.f34558a.getContentUri();
            return contentUri;
        }

        @Override // q0.h.c
        public final void b() {
            this.f34558a.requestPermission();
        }

        @Override // q0.h.c
        public final Uri c() {
            Uri linkUri;
            linkUri = this.f34558a.getLinkUri();
            return linkUri;
        }

        @Override // q0.h.c
        public final Object d() {
            return this.f34558a;
        }

        @Override // q0.h.c
        public final ClipDescription getDescription() {
            ClipDescription description;
            description = this.f34558a.getDescription();
            return description;
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34558a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public h(a aVar) {
        this.f34557a = aVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f34559a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f34560b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f34561c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34559a = uri;
            this.f34560b = clipDescription;
            this.f34561c = uri2;
        }

        @Override // q0.h.c
        public final Uri a() {
            return this.f34559a;
        }

        @Override // q0.h.c
        public final Uri c() {
            return this.f34561c;
        }

        @Override // q0.h.c
        public final Object d() {
            return null;
        }

        @Override // q0.h.c
        public final ClipDescription getDescription() {
            return this.f34560b;
        }

        @Override // q0.h.c
        public final void b() {
        }
    }
}
