package n4;

import java.nio.ByteBuffer;
import k4.g0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: DecoderInputBuffer.java */
/* loaded from: classes2.dex */
public class g extends n4.a {

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f33322u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33323v;

    /* renamed from: w, reason: collision with root package name */
    public long f33324w;

    /* renamed from: x, reason: collision with root package name */
    public ByteBuffer f33325x;
    public final int y;

    /* renamed from: t, reason: collision with root package name */
    public final c f33321t = new c();

    /* renamed from: z, reason: collision with root package name */
    public final int f33326z = 0;

    /* compiled from: DecoderInputBuffer.java */
    /* loaded from: classes2.dex */
    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
        }
    }

    static {
        g0.a("goog.exo.decoder");
    }

    public g(int i10) {
        this.y = i10;
    }

    public void h() {
        this.f33298s = 0;
        ByteBuffer byteBuffer = this.f33322u;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f33325x;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f33323v = false;
    }

    public final ByteBuffer i(int i10) {
        int capacity;
        int i11 = this.y;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f33322u;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new a(capacity, i10);
    }

    @EnsuresNonNull({"data"})
    public final void j(int i10) {
        int i11 = i10 + this.f33326z;
        ByteBuffer byteBuffer = this.f33322u;
        if (byteBuffer == null) {
            this.f33322u = i(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f33322u = byteBuffer;
            return;
        }
        ByteBuffer i13 = i(i12);
        i13.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i13.put(byteBuffer);
        }
        this.f33322u = i13;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f33322u;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f33325x;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
