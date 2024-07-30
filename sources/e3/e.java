package e3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class e<Data> implements n<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final d<Data> f27676a;

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final d<Data> f27677a;

        public a(d<Data> dVar) {
            this.f27677a = dVar;
        }

        @Override // e3.o
        public final n<File, Data> a(r rVar) {
            return new e(this.f27677a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // e3.e.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // e3.e.d
            public final ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // e3.e.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: e3.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0369e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: e3.e$e$a */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // e3.e.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // e3.e.d
            public final InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // e3.e.d
            public final void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public C0369e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f27676a = dVar;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // e3.n
    public final n.a b(File file, int i10, int i11, y2.g gVar) {
        File file2 = file;
        return new n.a(new s3.d(file2), new c(file2, this.f27676a));
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: s, reason: collision with root package name */
        public final File f27678s;

        /* renamed from: t, reason: collision with root package name */
        public final d<Data> f27679t;

        /* renamed from: u, reason: collision with root package name */
        public Data f27680u;

        public c(File file, d<Data> dVar) {
            this.f27678s = file;
            this.f27679t = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f27679t.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f27680u;
            if (data != null) {
                try {
                    this.f27679t.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f27679t.b(this.f27678s);
                this.f27680u = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
