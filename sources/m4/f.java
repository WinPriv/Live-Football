package m4;

import d6.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: AudioProcessor.java */
/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f32732a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f32733e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f32734a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32735b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32736c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32737d;

        public a(int i10, int i11, int i12) {
            int i13;
            this.f32734a = i10;
            this.f32735b = i11;
            this.f32736c = i12;
            if (g0.G(i12)) {
                i13 = g0.w(i12, i11);
            } else {
                i13 = -1;
            }
            this.f32737d = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f32734a == aVar.f32734a && this.f32735b == aVar.f32735b && this.f32736c == aVar.f32736c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32734a), Integer.valueOf(this.f32735b), Integer.valueOf(this.f32736c)});
        }

        public final String toString() {
            return "AudioFormat[sampleRate=" + this.f32734a + ", channelCount=" + this.f32735b + ", encoding=" + this.f32736c + ']';
        }
    }

    /* compiled from: AudioProcessor.java */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean b();

    void c();

    a d(a aVar) throws b;

    boolean e();

    void flush();

    ByteBuffer getOutput();

    void reset();
}
