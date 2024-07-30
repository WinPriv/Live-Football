package e3;

import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0368b<Data> f27667a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: e3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0367a implements InterfaceC0368b<ByteBuffer> {
            @Override // e3.b.InterfaceC0368b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // e3.b.InterfaceC0368b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // e3.o
        public final n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0367a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: e3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0368b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        public class a implements InterfaceC0368b<InputStream> {
            @Override // e3.b.InterfaceC0368b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // e3.b.InterfaceC0368b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // e3.o
        public final n<byte[], InputStream> a(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0368b<Data> interfaceC0368b) {
        this.f27667a = interfaceC0368b;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // e3.n
    public final n.a b(byte[] bArr, int i10, int i11, y2.g gVar) {
        byte[] bArr2 = bArr;
        return new n.a(new s3.d(bArr2), new c(bArr2, this.f27667a));
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: s, reason: collision with root package name */
        public final byte[] f27668s;

        /* renamed from: t, reason: collision with root package name */
        public final InterfaceC0368b<Data> f27669t;

        public c(byte[] bArr, InterfaceC0368b<Data> interfaceC0368b) {
            this.f27668s = bArr;
            this.f27669t = interfaceC0368b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f27669t.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            aVar.f(this.f27669t.b(this.f27668s));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
