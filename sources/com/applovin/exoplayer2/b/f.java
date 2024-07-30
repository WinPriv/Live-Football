package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f13380a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13381a = new a(-1, -1, -1);

        /* renamed from: b, reason: collision with root package name */
        public final int f13382b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13383c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13384d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13385e;

        public a(int i10, int i11, int i12) {
            int i13;
            this.f13382b = i10;
            this.f13383c = i11;
            this.f13384d = i12;
            if (ai.d(i12)) {
                i13 = ai.c(i12, i11);
            } else {
                i13 = -1;
            }
            this.f13385e = i13;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f13382b + ", channelCount=" + this.f13383c + ", encoding=" + this.f13384d + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    boolean d();

    void e();

    void f();
}
