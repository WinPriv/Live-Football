package i3;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public final class a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f29164a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: i3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0397a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f29164a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final ByteBuffer a() throws IOException {
        ByteBuffer byteBuffer = this.f29164a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
