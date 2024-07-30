package k4;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import k4.a0;

/* compiled from: AudioFocusManager.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f30371a;

    /* renamed from: b, reason: collision with root package name */
    public final a f30372b;

    /* renamed from: c, reason: collision with root package name */
    public b f30373c;

    /* renamed from: d, reason: collision with root package name */
    public m4.d f30374d;

    /* renamed from: e, reason: collision with root package name */
    public int f30375e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public float f30376g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f30377h;

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes2.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f30378a;

        public a(Handler handler) {
            this.f30378a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            this.f30378a.post(new com.anythink.basead.ui.g(i10, 1, this));
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public c(Context context, Handler handler, a0.b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        audioManager.getClass();
        this.f30371a = audioManager;
        this.f30373c = bVar;
        this.f30372b = new a(handler);
        this.f30375e = 0;
    }

    public final void a() {
        if (this.f30375e == 0) {
            return;
        }
        int i10 = d6.g0.f27302a;
        AudioManager audioManager = this.f30371a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f30377h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f30372b);
        }
        d(0);
    }

    public final void b(int i10) {
        b bVar = this.f30373c;
        if (bVar != null) {
            a0 a0Var = a0.this;
            boolean g6 = a0Var.g();
            int i11 = 1;
            if (g6 && i10 != 1) {
                i11 = 2;
            }
            a0Var.q0(i10, i11, g6);
        }
    }

    public final void c() {
        if (!d6.g0.a(this.f30374d, null)) {
            this.f30374d = null;
            this.f = 0;
        }
    }

    public final void d(int i10) {
        float f;
        if (this.f30375e == i10) {
            return;
        }
        this.f30375e = i10;
        if (i10 == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f30376g == f) {
            return;
        }
        this.f30376g = f;
        b bVar = this.f30373c;
        if (bVar != null) {
            a0 a0Var = a0.this;
            a0Var.k0(1, 2, Float.valueOf(a0Var.f30318a0 * a0Var.A.f30376g));
        }
    }

    public final int e(int i10, boolean z10) {
        boolean z11;
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z12;
        int i11 = 1;
        if (i10 != 1 && this.f == 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            a();
            if (z10) {
                return 1;
            }
            return -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f30375e != 1) {
            int i12 = d6.g0.f27302a;
            a aVar = this.f30372b;
            AudioManager audioManager = this.f30371a;
            if (i12 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f30377h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        builder = new AudioFocusRequest.Builder(this.f);
                    } else {
                        builder = new AudioFocusRequest.Builder(this.f30377h);
                    }
                    m4.d dVar = this.f30374d;
                    if (dVar != null && dVar.f32719s == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    dVar.getClass();
                    this.f30377h = builder.setAudioAttributes(dVar.a().f32725a).setWillPauseWhenDucked(z12).setOnAudioFocusChangeListener(aVar).build();
                }
                requestAudioFocus = audioManager.requestAudioFocus(this.f30377h);
            } else {
                m4.d dVar2 = this.f30374d;
                dVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(aVar, d6.g0.y(dVar2.f32721u), this.f);
            }
            if (requestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i11 = -1;
            }
        }
        return i11;
    }
}
