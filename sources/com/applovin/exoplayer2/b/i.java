package com.applovin.exoplayer2.b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f13399a;

    /* renamed from: b, reason: collision with root package name */
    private int f13400b;

    /* renamed from: c, reason: collision with root package name */
    private long f13401c;

    /* renamed from: d, reason: collision with root package name */
    private long f13402d;

    /* renamed from: e, reason: collision with root package name */
    private long f13403e;
    private long f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f13404a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f13405b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f13406c;

        /* renamed from: d, reason: collision with root package name */
        private long f13407d;

        /* renamed from: e, reason: collision with root package name */
        private long f13408e;

        public a(AudioTrack audioTrack) {
            this.f13404a = audioTrack;
        }

        public boolean a() {
            boolean timestamp = this.f13404a.getTimestamp(this.f13405b);
            if (timestamp) {
                long j10 = this.f13405b.framePosition;
                if (this.f13407d > j10) {
                    this.f13406c++;
                }
                this.f13407d = j10;
                this.f13408e = j10 + (this.f13406c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.f13405b.nanoTime / 1000;
        }

        public long c() {
            return this.f13408e;
        }
    }

    public i(AudioTrack audioTrack) {
        if (ai.f16274a >= 19) {
            this.f13399a = new a(audioTrack);
            d();
        } else {
            this.f13399a = null;
            a(3);
        }
    }

    @TargetApi(19)
    public boolean a(long j10) {
        a aVar = this.f13399a;
        if (aVar == null || j10 - this.f13403e < this.f13402d) {
            return false;
        }
        this.f13403e = j10;
        boolean a10 = aVar.a();
        int i10 = this.f13400b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (a10) {
                        d();
                    }
                } else if (!a10) {
                    d();
                }
            } else if (!a10) {
                d();
            } else if (this.f13399a.c() > this.f) {
                a(2);
            }
        } else if (a10) {
            if (this.f13399a.b() < this.f13401c) {
                return false;
            }
            this.f = this.f13399a.c();
            a(1);
        } else if (j10 - this.f13401c > 500000) {
            a(3);
        }
        return a10;
    }

    public void b() {
        if (this.f13400b == 4) {
            d();
        }
    }

    public boolean c() {
        if (this.f13400b == 2) {
            return true;
        }
        return false;
    }

    public void d() {
        if (this.f13399a != null) {
            a(0);
        }
    }

    @TargetApi(19)
    public long e() {
        a aVar = this.f13399a;
        if (aVar != null) {
            return aVar.b();
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @TargetApi(19)
    public long f() {
        a aVar = this.f13399a;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    public void a() {
        a(4);
    }

    private void a(int i10) {
        this.f13400b = i10;
        if (i10 == 0) {
            this.f13403e = 0L;
            this.f = -1L;
            this.f13401c = System.nanoTime() / 1000;
            this.f13402d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f13402d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f13402d = 10000000L;
        } else {
            if (i10 == 4) {
                this.f13402d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
