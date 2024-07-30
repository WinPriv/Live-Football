package ka;

import android.text.TextUtils;
import com.huawei.hms.app.CoreApplication;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.views.RewardVideoView;
import java.net.Socket;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import ka.u8;

/* loaded from: classes2.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    public final x8 f31032a;

    /* renamed from: b, reason: collision with root package name */
    public final d9 f31033b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Long> f31034c;

    /* renamed from: d, reason: collision with root package name */
    public RewardVideoView.f f31035d;

    /* renamed from: e, reason: collision with root package name */
    public w8 f31036e;
    public long f = 157286400;

    /* renamed from: g, reason: collision with root package name */
    public y8 f31037g;

    /* loaded from: classes2.dex */
    public class a {
    }

    static {
        Pattern.compile("(\\d+)-(\\d+)/(\\d+)");
        Pattern.compile("(\\d+)/(\\d+)");
        Pattern.compile("(\\d+)");
    }

    public c9(x8 x8Var, d9 d9Var, ConcurrentHashMap concurrentHashMap) {
        this.f31032a = x8Var;
        this.f31033b = d9Var;
        this.f31034c = concurrentHashMap;
        b();
    }

    public final void a(Socket socket) {
        boolean z10;
        u8 u8Var;
        w8 w8Var = this.f31036e;
        x8 x8Var = this.f31032a;
        String str = x8Var.f32174a;
        w8Var.getClass();
        if (w8.a(str) > this.f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            n7.e("ProxyRequestProcessor", "max limit, skip.");
            RewardVideoView.f fVar = this.f31035d;
            if (fVar != null) {
                n7.f("RewardVideoView", "stream error, code: %s", -2);
                RewardVideoView rewardVideoView = ((RewardVideoView.e) fVar).f23333a.get();
                if (rewardVideoView != null) {
                    com.huawei.openalliance.ad.ppskit.utils.d2.a(new com.huawei.openalliance.ad.ppskit.views.z0(rewardVideoView));
                }
            }
            y8 y8Var = this.f31037g;
            if (y8Var != null && (u8Var = ((u8.b) y8Var).f31941a.get()) != null) {
                u8Var.f31939h = true;
            }
            try {
                n7.b("ProxyRequestProcessor", "close socket");
                if (!socket.isInputShutdown()) {
                    socket.shutdownInput();
                }
                if (!socket.isOutputShutdown()) {
                    socket.shutdownOutput();
                }
                socket.close();
                return;
            } catch (Throwable th) {
                n7.h("ProxyRequestProcessor", "close socket failed, %s", th.getClass().getSimpleName());
                return;
            }
        }
        androidx.transition.r rVar = new androidx.transition.r(4);
        String str2 = x8Var.f32175b;
        if (!TextUtils.isEmpty(str2) && str2 != null) {
            ((Map) rVar.f2493s).put("Range".toLowerCase(Locale.ENGLISH), str2);
        }
        ((b9) this.f31033b).b(new a4.j(x8Var.f32174a, rVar, (Object) null), new a());
    }

    public final void b() {
        this.f31036e = w8.b();
        long l10 = ConfigSpHandler.b(CoreApplication.getCoreBaseContext()).l();
        this.f = l10;
        n7.f("ProxyRequestProcessor", "init, max data consume is: %s", Long.valueOf(l10));
    }
}
