package e3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e3.n;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f27726a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f27727b;

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f27728a;

        public a(Resources resources) {
            this.f27728a = resources;
        }

        @Override // e3.o
        public final n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f27728a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f27729a;

        public b(Resources resources) {
            this.f27729a = resources;
        }

        @Override // e3.o
        public final n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f27729a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f27730a;

        public c(Resources resources) {
            this.f27730a = resources;
        }

        @Override // e3.o
        public final n<Integer, InputStream> a(r rVar) {
            return new s(this.f27730a, rVar.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f27731a;

        public d(Resources resources) {
            this.f27731a = resources;
        }

        @Override // e3.o
        public final n<Integer, Uri> a(r rVar) {
            return new s(this.f27731a, u.f27733a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f27727b = resources;
        this.f27726a = nVar;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // e3.n
    public final n.a b(Integer num, int i10, int i11, y2.g gVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f27727b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f27726a.b(uri, i10, i11, gVar);
    }
}
