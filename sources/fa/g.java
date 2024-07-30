package fa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.views.PPSSplashView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static g f28229d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f28230e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f28231a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<b>> f28232b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public a f28233c;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            g gVar = g.this;
            ex.V("ExSplashStartReceiver", "onReceive");
            if (intent == null) {
                return;
            }
            try {
                if (w.bm.equals(intent.getAction())) {
                    gVar.getClass();
                    CopyOnWriteArrayList<WeakReference<b>> copyOnWriteArrayList = gVar.f28232b;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        Iterator<WeakReference<b>> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference<b> next = it.next();
                            if (next.get() != null) {
                                next.get().Code();
                            }
                        }
                    }
                    context.removeStickyBroadcast(intent);
                }
            } catch (Throwable th) {
                ex.I("ExSplashStartReceiver", "ExSplashBeginReceiver err: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void Code();
    }

    public g(Context context) {
        this.f28231a = context.getApplicationContext();
    }

    public static g a(Context context) {
        g gVar;
        synchronized (f28230e) {
            if (f28229d == null) {
                f28229d = new g(context);
            }
            gVar = f28229d;
        }
        return gVar;
    }

    public final void b() {
        String str;
        try {
            ex.V("ExSplashStartReceiver", "unregister receiver");
            a aVar = this.f28233c;
            if (aVar != null) {
                this.f28231a.unregisterReceiver(aVar);
                this.f28233c = null;
            }
        } catch (IllegalStateException unused) {
            str = "unregisterReceiver IllegalStateException";
            ex.I("ExSplashStartReceiver", str);
        } catch (Throwable unused2) {
            str = "unregisterReceiver exception";
            ex.I("ExSplashStartReceiver", str);
        }
    }

    public final void c(PPSSplashView.e eVar) {
        CopyOnWriteArrayList<WeakReference<b>> copyOnWriteArrayList = this.f28232b;
        if (copyOnWriteArrayList != null) {
            try {
                if (copyOnWriteArrayList.size() > 0) {
                    Iterator<WeakReference<b>> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference<b> next = it.next();
                        b bVar = next.get();
                        if (bVar == null || bVar == eVar) {
                            copyOnWriteArrayList.remove(next);
                        }
                    }
                }
            } catch (Throwable th) {
                ex.V("ExSplashStartReceiver", "removeStartListener err: %s", th.getClass().getSimpleName());
            }
        }
    }
}
