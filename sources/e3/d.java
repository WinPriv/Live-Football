package e3;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final a<Data> f27671a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final a f27675a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // e3.o
        public final n<Model, InputStream> a(r rVar) {
            return new d(this.f27675a);
        }
    }

    public d(c.a aVar) {
        this.f27671a = aVar;
    }

    @Override // e3.n
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // e3.n
    public final n.a<Data> b(Model model, int i10, int i11, y2.g gVar) {
        return new n.a<>(new s3.d(model), new b(model.toString(), this.f27671a));
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: s, reason: collision with root package name */
        public final String f27672s;

        /* renamed from: t, reason: collision with root package name */
        public final a<Data> f27673t;

        /* renamed from: u, reason: collision with root package name */
        public ByteArrayInputStream f27674u;

        public b(String str, a<Data> aVar) {
            this.f27672s = str;
            this.f27673t = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            this.f27673t.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            try {
                a<Data> aVar = this.f27673t;
                ByteArrayInputStream byteArrayInputStream = this.f27674u;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f27673t).a(this.f27672s);
                this.f27674u = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
