package ia;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fh;
import com.huawei.hms.ads.fk;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class c implements IMultiMediaPlayingManager {

    /* renamed from: g, reason: collision with root package name */
    public static c f29444g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f29445h = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public ia.a f29447b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f29449d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29446a = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f29448c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public final a f29450e = new a();
    public final b f = new b();

    /* loaded from: classes2.dex */
    public class a implements fk {
        public a() {
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(int i10, int i11) {
        }

        @Override // com.huawei.hms.ads.fk
        public final void I(ia.a aVar, int i10) {
            if (ex.Code()) {
                c cVar = c.f29444g;
                ex.Code("c", "onMediaStop: %s", aVar);
            }
            a();
        }

        @Override // com.huawei.hms.ads.fk
        public final void V(ia.a aVar, int i10) {
            if (ex.Code()) {
                c cVar = c.f29444g;
                ex.Code("c", "onMediaPause: %s", aVar);
            }
            a();
        }

        @Override // com.huawei.hms.ads.fk
        public final void Z(ia.a aVar, int i10) {
            if (ex.Code()) {
                c cVar = c.f29444g;
                ex.Code("c", "onMediaCompletion: %s", aVar);
            }
            c.g(c.this);
        }

        public final void a() {
            synchronized (c.this.f29446a) {
                if (ex.Code()) {
                    c cVar = c.f29444g;
                    ex.Code("c", "checkAndPlayNext current player: %s", c.this.f29447b);
                }
                c cVar2 = c.this;
                if (cVar2.f29447b == null) {
                    c.g(cVar2);
                }
            }
        }

        @Override // com.huawei.hms.ads.fk
        public final void Code(ia.a aVar, int i10) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements fh {
        public b() {
        }

        @Override // com.huawei.hms.ads.fh
        public final void Code(ia.a aVar, int i10, int i11, int i12) {
            if (ex.Code()) {
                c cVar = c.f29444g;
                ex.Code("c", "onError: %s", aVar);
            }
            synchronized (c.this.f29446a) {
                aVar.V(this);
            }
            c.g(c.this);
        }
    }

    /* renamed from: ia.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0401c {

        /* renamed from: a, reason: collision with root package name */
        public final String f29453a;

        /* renamed from: b, reason: collision with root package name */
        public final ia.a f29454b;

        public C0401c(ia.a aVar, String str) {
            this.f29453a = str;
            this.f29454b = aVar;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0401c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0401c c0401c = (C0401c) obj;
            if (!TextUtils.equals(this.f29453a, c0401c.f29453a) || this.f29454b != c0401c.f29454b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = -1;
            String str = this.f29453a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = -1;
            }
            ia.a aVar = this.f29454b;
            if (aVar != null) {
                i11 = aVar.hashCode();
            }
            return i11 & i10 & super.hashCode();
        }

        public final String toString() {
            return "Task [" + n.e(this.f29453a) + "]";
        }
    }

    public c(Context context) {
        this.f29449d = context.getApplicationContext();
    }

    public static void g(c cVar) {
        if (a0.a.s(cVar.f29449d)) {
            synchronized (cVar.f29446a) {
                C0401c c0401c = (C0401c) cVar.f29448c.poll();
                if (ex.Code()) {
                    ex.Code("c", "playNextTask - task: %s currentPlayer: %s", c0401c, cVar.f29447b);
                }
                if (c0401c != null) {
                    if (ex.Code()) {
                        ex.Code("c", "playNextTask - play: %s", c0401c.f29454b);
                    }
                    c0401c.f29454b.Code(cVar.f29450e);
                    c0401c.f29454b.Code(cVar.f);
                    c0401c.f29454b.Code(c0401c.f29453a);
                    cVar.f29447b = c0401c.f29454b;
                } else {
                    cVar.f29447b = null;
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void a(ia.a aVar) {
        synchronized (this.f29446a) {
            if (aVar != null) {
                aVar.V(this.f29450e);
                aVar.V(this.f);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void b(ia.a aVar, String str) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            synchronized (this.f29446a) {
                if (ex.Code()) {
                    ex.Code("c", "manualPlay - url: %s player: %s", n.e(str), aVar);
                }
                ia.a aVar2 = this.f29447b;
                if (aVar2 != null && aVar != aVar2) {
                    aVar2.Code();
                    ex.V("c", "manualPlay - stop other");
                }
                ex.V("c", "manualPlay - play new");
                aVar.Code(this.f29450e);
                aVar.Code(this.f);
                aVar.Code(str);
                this.f29447b = aVar;
                this.f29448c.remove(new C0401c(aVar, str));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void c(ia.a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (this.f29446a) {
            ia.a aVar2 = this.f29447b;
            if (aVar == aVar2) {
                a(aVar2);
                this.f29447b = null;
            }
            Iterator it = this.f29448c.iterator();
            while (it.hasNext()) {
                ia.a aVar3 = ((C0401c) it.next()).f29454b;
                if (aVar3 == aVar) {
                    a(aVar3);
                    it.remove();
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void d(ia.a aVar, String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str) && aVar != null) {
            synchronized (this.f29446a) {
                if (ex.Code()) {
                    ex.Code("c", "autoPlay - url: %s player: %s", n.e(str), aVar);
                }
                ia.a aVar2 = this.f29447b;
                if (aVar != aVar2 && aVar2 != null) {
                    C0401c c0401c = new C0401c(aVar, str);
                    this.f29448c.remove(c0401c);
                    this.f29448c.add(c0401c);
                    str2 = "c";
                    str3 = "autoPlay - add to queue";
                    ex.V(str2, str3);
                }
                aVar.Code(this.f29450e);
                aVar.Code(this.f);
                aVar.Code(str);
                this.f29447b = aVar;
                str2 = "c";
                str3 = "autoPlay - play directly";
                ex.V(str2, str3);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void e(ia.a aVar, String str) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            synchronized (this.f29446a) {
                if (ex.Code()) {
                    ex.Code("c", "pause - url: %s player: %s", n.e(str), aVar);
                }
                if (aVar == this.f29447b) {
                    ex.V("c", "pause current");
                    aVar.I(str);
                } else {
                    ex.V("c", "pause - remove from queue");
                    this.f29448c.remove(new C0401c(aVar, str));
                    a(aVar);
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.IMultiMediaPlayingManager
    public final void f(ia.a aVar, String str) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            synchronized (this.f29446a) {
                if (ex.Code()) {
                    ex.Code("c", "stop - url: %s player: %s", n.e(str), aVar);
                }
                if (aVar == this.f29447b) {
                    ex.V("c", "stop current");
                    this.f29447b = null;
                    aVar.V(str);
                } else {
                    ex.V("c", "stop - remove from queue");
                    this.f29448c.remove(new C0401c(aVar, str));
                    a(aVar);
                }
            }
        }
    }
}
