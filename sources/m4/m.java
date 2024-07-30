package m4;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import d6.g0;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f32756a;

    /* renamed from: b, reason: collision with root package name */
    public int f32757b;

    /* renamed from: c, reason: collision with root package name */
    public long f32758c;

    /* renamed from: d, reason: collision with root package name */
    public long f32759d;

    /* renamed from: e, reason: collision with root package name */
    public long f32760e;
    public long f;

    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f32761a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f32762b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f32763c;

        /* renamed from: d, reason: collision with root package name */
        public long f32764d;

        /* renamed from: e, reason: collision with root package name */
        public long f32765e;

        public a(AudioTrack audioTrack) {
            this.f32761a = audioTrack;
        }
    }

    public m(AudioTrack audioTrack) {
        if (g0.f27302a >= 19) {
            this.f32756a = new a(audioTrack);
            a();
        } else {
            this.f32756a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f32756a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f32757b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f32759d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f32759d = 10000000L;
                return;
            }
            this.f32759d = 10000L;
            return;
        }
        this.f32760e = 0L;
        this.f = -1L;
        this.f32758c = System.nanoTime() / 1000;
        this.f32759d = 10000L;
    }
}
