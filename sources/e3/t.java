package e3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import e3.n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public final class t<Data> implements n<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f27732a;

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // e3.o
        public final n<String, AssetFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // e3.o
        public final n<String, ParcelFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // e3.o
        public final n<String, InputStream> a(r rVar) {
            return new t(rVar.b(Uri.class, InputStream.class));
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f27732a = nVar;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // e3.n
    public final n.a b(String str, int i10, int i11, y2.g gVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str2));
            } else {
                uri = parse;
            }
        }
        if (uri == null) {
            return null;
        }
        n<Uri, Data> nVar = this.f27732a;
        if (!nVar.a(uri)) {
            return null;
        }
        return nVar.b(uri, i10, i11, gVar);
    }
}
