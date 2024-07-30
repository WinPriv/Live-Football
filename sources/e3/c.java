package e3;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public final class c implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // e3.o
        public final n<File, ByteBuffer> a(r rVar) {
            return new c();
        }
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // e3.n
    public final n.a<ByteBuffer> b(File file, int i10, int i11, y2.g gVar) {
        File file2 = file;
        return new n.a<>(new s3.d(file2), new a(file2));
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: s, reason: collision with root package name */
        public final File f27670s;

        public a(File file) {
            this.f27670s = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final y2.a d() {
            return y2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(t3.a.a(this.f27670s));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
