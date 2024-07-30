package ka;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.views.RewardVideoView;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f31933a;

    /* renamed from: c, reason: collision with root package name */
    public int f31935c;

    /* renamed from: d, reason: collision with root package name */
    public ServerSocket f31936d;

    /* renamed from: e, reason: collision with root package name */
    public c f31937e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final RewardVideoView.f f31938g;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f31934b = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f31939h = false;

    /* loaded from: classes2.dex */
    public class a extends Thread {
        public a() {
            super("mediaCache");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            u8 u8Var = u8.this;
            if (u8Var.f31936d != null) {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        n7.e("CreativeHttpServer", "register listener running...");
                        Socket accept = u8Var.f31936d.accept();
                        n7.c("CreativeHttpServer", "accept a new socket: %s, data consume exceed max limit or stream error: %s ", accept, Boolean.valueOf(u8Var.f31939h));
                        if (!u8Var.f31939h) {
                            com.huawei.openalliance.ad.ppskit.utils.p2.a(new v8(u8Var, accept), 18);
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        n7.i("CreativeHttpServer", "register socket listener error! exception: ".concat(th.getClass().getSimpleName()));
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements y8 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<u8> f31941a;

        public b(u8 u8Var) {
            this.f31941a = new WeakReference<>(u8Var);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            n7.h("CreativeHttpServer", "register socket listener error: %s", th.getClass().getSimpleName());
        }
    }

    public u8(a4.l lVar, b9 b9Var, RewardVideoView.e eVar) {
        this.f31933a = b9Var;
        this.f31938g = eVar;
    }

    public final void a(Context context) {
        if (this.f) {
            return;
        }
        String string = context.getString(R.string.player_local_host);
        ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName(string));
        this.f31936d = serverSocket;
        this.f31937e = new c();
        int localPort = serverSocket.getLocalPort();
        this.f31935c = localPort;
        List<Proxy> list = z8.f32241d;
        ProxySelector.setDefault(new z8(ProxySelector.getDefault(), string, localPort));
        a aVar = new a();
        aVar.setUncaughtExceptionHandler(this.f31937e);
        aVar.start();
        this.f = true;
    }
}
