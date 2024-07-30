package f2;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import cn.iwgang.countdownview.CountdownView;

/* compiled from: CustomCountDownTimer.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f28036a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28037b;

    /* renamed from: c, reason: collision with root package name */
    public long f28038c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28039d = false;

    /* renamed from: e, reason: collision with root package name */
    public final a f28040e = new a();

    /* compiled from: CustomCountDownTimer.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            synchronized (c.this) {
                c cVar = c.this;
                if (!cVar.f28039d) {
                    cVar.getClass();
                    long elapsedRealtime = c.this.f28038c - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        c.this.a();
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        CountdownView.this.c(elapsedRealtime);
                        long elapsedRealtime3 = (elapsedRealtime2 + c.this.f28037b) - SystemClock.elapsedRealtime();
                        while (elapsedRealtime3 < 0) {
                            elapsedRealtime3 += c.this.f28037b;
                        }
                        sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                    }
                }
            }
        }
    }

    public c(long j10, long j11) {
        this.f28036a = j11 > 1000 ? j10 + 15 : j10;
        this.f28037b = j11;
    }

    public abstract void a();
}
