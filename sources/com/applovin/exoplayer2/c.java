package com.applovin.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.exoplayer2.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f13612a;

    /* renamed from: b, reason: collision with root package name */
    private final a f13613b;

    /* renamed from: c, reason: collision with root package name */
    private b f13614c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.b.d f13615d;
    private int f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f13618h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13619i;

    /* renamed from: g, reason: collision with root package name */
    private float f13617g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f13616e = 0;

    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f13621b;

        public a(Handler handler) {
            this.f13621b = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f13621b.post(new Runnable() { // from class: com.applovin.exoplayer2.f0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            c.this.c(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f);

        void a(int i10);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f13612a = (AudioManager) com.applovin.exoplayer2.l.a.b((AudioManager) context.getApplicationContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b));
        this.f13614c = bVar;
        this.f13613b = new a(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !i()) {
                b(3);
                return;
            } else {
                d(0);
                b(2);
                return;
            }
        }
        if (i10 == -1) {
            d(-1);
            d();
        } else if (i10 != 1) {
            a3.k.y("Unknown focus change type: ", i10, "AudioFocusManager");
        } else {
            b(1);
            d(1);
        }
    }

    private void d() {
        if (this.f13616e == 0) {
            return;
        }
        if (com.applovin.exoplayer2.l.ai.f16274a >= 26) {
            h();
        } else {
            g();
        }
        b(0);
    }

    private int e() {
        return this.f13612a.requestAudioFocus(this.f13613b, com.applovin.exoplayer2.l.ai.g(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.f13615d)).f13362d), this.f);
    }

    private int f() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f13618h;
        if (audioFocusRequest == null || this.f13619i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f13618h);
            }
            this.f13618h = builder.setAudioAttributes(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.f13615d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.f13613b).build();
            this.f13619i = false;
        }
        return this.f13612a.requestAudioFocus(this.f13618h);
    }

    private void g() {
        this.f13612a.abandonAudioFocus(this.f13613b);
    }

    private void h() {
        AudioFocusRequest audioFocusRequest = this.f13618h;
        if (audioFocusRequest != null) {
            this.f13612a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean i() {
        com.applovin.exoplayer2.b.d dVar = this.f13615d;
        if (dVar != null && dVar.f13360b == 1) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f13614c = null;
        d();
    }

    public float a() {
        return this.f13617g;
    }

    private static int b(com.applovin.exoplayer2.b.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f13362d) {
            case 0:
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (dVar.f13360b == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Unidentified audio usage: " + dVar.f13362d);
                return 0;
            case 16:
                return com.applovin.exoplayer2.l.ai.f16274a >= 19 ? 4 : 2;
        }
    }

    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (com.applovin.exoplayer2.l.ai.a(this.f13615d, dVar)) {
            return;
        }
        this.f13615d = dVar;
        int b10 = b(dVar);
        this.f = b10;
        boolean z10 = true;
        if (b10 != 1 && b10 != 0) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    private void d(int i10) {
        b bVar = this.f13614c;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    public int a(boolean z10, int i10) {
        if (a(i10)) {
            d();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return c();
        }
        return -1;
    }

    private void b(int i10) {
        if (this.f13616e == i10) {
            return;
        }
        this.f13616e = i10;
        float f = i10 == 3 ? 0.2f : 1.0f;
        if (this.f13617g == f) {
            return;
        }
        this.f13617g = f;
        b bVar = this.f13614c;
        if (bVar != null) {
            bVar.a(f);
        }
    }

    private boolean a(int i10) {
        return i10 == 1 || this.f != 1;
    }

    private int c() {
        if (this.f13616e == 1) {
            return 1;
        }
        if ((com.applovin.exoplayer2.l.ai.f16274a >= 26 ? f() : e()) == 1) {
            b(1);
            return 1;
        }
        b(0);
        return -1;
    }
}
