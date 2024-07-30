package u0;

import android.view.Choreographer;
import java.util.ArrayList;
import q.i;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public final class a {
    public static final ThreadLocal<a> f = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public d f35713d;

    /* renamed from: a, reason: collision with root package name */
    public final i<b, Long> f35710a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f35711b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final C0490a f35712c = new C0490a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f35714e = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0490a {
        public C0490a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j10);
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C0490a f35716a;

        public c(C0490a c0490a) {
            this.f35716a = c0490a;
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final Choreographer f35717b;

        /* renamed from: c, reason: collision with root package name */
        public final ChoreographerFrameCallbackC0491a f35718c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: u0.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ChoreographerFrameCallbackC0491a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0491a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[SYNTHETIC] */
            @Override // android.view.Choreographer.FrameCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    u0.a$d r10 = u0.a.d.this
                    u0.a$a r10 = r10.f35716a
                    r10.getClass()
                    long r0 = android.os.SystemClock.uptimeMillis()
                    u0.a r10 = u0.a.this
                    r10.getClass()
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r11 = 0
                    r4 = r11
                L16:
                    java.util.ArrayList<u0.a$b> r5 = r10.f35711b
                    int r6 = r5.size()
                    if (r4 >= r6) goto L49
                    java.lang.Object r5 = r5.get(r4)
                    u0.a$b r5 = (u0.a.b) r5
                    if (r5 != 0) goto L27
                    goto L46
                L27:
                    q.i<u0.a$b, java.lang.Long> r6 = r10.f35710a
                    r7 = 0
                    java.lang.Object r7 = r6.getOrDefault(r5, r7)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L33
                    goto L3e
                L33:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L40
                    r6.remove(r5)
                L3e:
                    r6 = 1
                    goto L41
                L40:
                    r6 = r11
                L41:
                    if (r6 == 0) goto L46
                    r5.a(r0)
                L46:
                    int r4 = r4 + 1
                    goto L16
                L49:
                    boolean r0 = r10.f35714e
                    if (r0 == 0) goto L61
                    int r0 = r5.size()
                L51:
                    int r0 = r0 + (-1)
                    if (r0 < 0) goto L5f
                    java.lang.Object r1 = r5.get(r0)
                    if (r1 != 0) goto L51
                    r5.remove(r0)
                    goto L51
                L5f:
                    r10.f35714e = r11
                L61:
                    int r11 = r5.size()
                    if (r11 <= 0) goto L7d
                    u0.a$d r11 = r10.f35713d
                    if (r11 != 0) goto L74
                    u0.a$d r11 = new u0.a$d
                    u0.a$a r0 = r10.f35712c
                    r11.<init>(r0)
                    r10.f35713d = r11
                L74:
                    u0.a$d r10 = r10.f35713d
                    u0.a$d$a r11 = r10.f35718c
                    android.view.Choreographer r10 = r10.f35717b
                    r10.postFrameCallback(r11)
                L7d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.a.d.ChoreographerFrameCallbackC0491a.doFrame(long):void");
            }
        }

        public d(C0490a c0490a) {
            super(c0490a);
            this.f35717b = Choreographer.getInstance();
            this.f35718c = new ChoreographerFrameCallbackC0491a();
        }
    }
}
