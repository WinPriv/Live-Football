package com.anythink.expressad.exoplayer.b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.anythink.expressad.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7373a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7374b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7375c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7376d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7377e = 4;
    private static final int f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7378g = 10000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7379h = 500000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f7380i = 500000;

    /* renamed from: j, reason: collision with root package name */
    private final a f7381j;

    /* renamed from: k, reason: collision with root package name */
    private int f7382k;

    /* renamed from: l, reason: collision with root package name */
    private long f7383l;

    /* renamed from: m, reason: collision with root package name */
    private long f7384m;

    /* renamed from: n, reason: collision with root package name */
    private long f7385n;
    private long o;

    @TargetApi(19)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f7386a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f7387b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f7388c;

        /* renamed from: d, reason: collision with root package name */
        private long f7389d;

        /* renamed from: e, reason: collision with root package name */
        private long f7390e;

        public a(AudioTrack audioTrack) {
            this.f7386a = audioTrack;
        }

        public final boolean a() {
            boolean timestamp = this.f7386a.getTimestamp(this.f7387b);
            if (timestamp) {
                long j10 = this.f7387b.framePosition;
                if (this.f7389d > j10) {
                    this.f7388c++;
                }
                this.f7389d = j10;
                this.f7390e = j10 + (this.f7388c << 32);
            }
            return timestamp;
        }

        public final long b() {
            return this.f7387b.nanoTime / 1000;
        }

        public final long c() {
            return this.f7390e;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public i(AudioTrack audioTrack) {
        if (af.f8993a >= 19) {
            this.f7381j = new a(audioTrack);
            e();
        } else {
            this.f7381j = null;
            a(3);
        }
    }

    public final boolean a(long j10) {
        a aVar = this.f7381j;
        if (aVar == null || j10 - this.f7385n < this.f7384m) {
            return false;
        }
        this.f7385n = j10;
        boolean a10 = aVar.a();
        int i10 = this.f7382k;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (a10) {
                        e();
                    }
                } else if (!a10) {
                    e();
                }
            } else if (!a10) {
                e();
            } else if (this.f7381j.c() > this.o) {
                a(2);
            }
        } else if (a10) {
            if (this.f7381j.b() < this.f7383l) {
                return false;
            }
            this.o = this.f7381j.c();
            a(1);
        } else if (j10 - this.f7383l > 500000) {
            a(3);
        }
        return a10;
    }

    public final void b() {
        if (this.f7382k == 4) {
            e();
        }
    }

    public final boolean c() {
        int i10 = this.f7382k;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f7382k == 2) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (this.f7381j != null) {
            a(0);
        }
    }

    public final long f() {
        a aVar = this.f7381j;
        if (aVar != null) {
            return aVar.b();
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    public final long g() {
        a aVar = this.f7381j;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    public final void a() {
        a(4);
    }

    private void a(int i10) {
        this.f7382k = i10;
        if (i10 == 0) {
            this.f7385n = 0L;
            this.o = -1L;
            this.f7383l = System.nanoTime() / 1000;
            this.f7384m = com.anythink.expressad.exoplayer.f.f7962a;
            return;
        }
        if (i10 == 1) {
            this.f7384m = com.anythink.expressad.exoplayer.f.f7962a;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f7384m = 10000000L;
        } else {
            if (i10 == 4) {
                this.f7384m = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
