package ha;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ct;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.b0;
import gb.c0;
import gb.r0;
import gb.w;
import ha.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i extends d<g> {

    /* renamed from: h, reason: collision with root package name */
    public static i f28814h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f28815i = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public long f28816g;

    /* loaded from: classes2.dex */
    public static class a<T> extends d.b<g> {

        /* renamed from: b, reason: collision with root package name */
        public final String f28817b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28818c;

        /* renamed from: d, reason: collision with root package name */
        public final RemoteCallResultCallback<T> f28819d;

        /* renamed from: e, reason: collision with root package name */
        public final Class<T> f28820e;

        /* renamed from: ha.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0393a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ RemoteCallResultCallback f28821s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f28822t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ CallResult f28823u;

            public RunnableC0393a(RemoteCallResultCallback remoteCallResultCallback, String str, CallResult callResult) {
                this.f28821s = remoteCallResultCallback;
                this.f28822t = str;
                this.f28823u = callResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28821s.onRemoteCallResult(this.f28822t, this.f28823u);
            }
        }

        public a(String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
            this.f28817b = str;
            this.f28818c = str2;
            this.f28819d = remoteCallResultCallback;
            this.f28820e = cls;
        }

        @Override // ha.d.b
        public final void a(g gVar) {
            String concat;
            String str = this.f28817b;
            g gVar2 = gVar;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "13.4.65.300");
                jSONObject.put("content", this.f28818c);
                gVar2.h(str, jSONObject.toString(), new h(this));
            } catch (RemoteException unused) {
                concat = "remote call RemoteException";
                ex.I("Decouple.PPSApiServiceManager", concat);
                CallResult callResult = new CallResult();
                callResult.setCode(-1);
                callResult.setMsg(concat);
                c(this.f28819d, str, callResult);
            } catch (Throwable th) {
                concat = "remote call ".concat(th.getClass().getSimpleName());
                ex.I("Decouple.PPSApiServiceManager", concat);
                CallResult callResult2 = new CallResult();
                callResult2.setCode(-1);
                callResult2.setMsg(concat);
                c(this.f28819d, str, callResult2);
            }
        }

        @Override // ha.d.b
        public final void b() {
            ex.I("Decouple.PPSApiServiceManager", "onServiceCallFailed");
            CallResult callResult = new CallResult();
            callResult.setCode(-1);
            callResult.setMsg("onServiceCallFailed");
            c(this.f28819d, this.f28817b, callResult);
        }

        public final void c(RemoteCallResultCallback remoteCallResultCallback, String str, CallResult callResult) {
            ex.V("Decouple.PPSApiServiceManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
            if (remoteCallResultCallback != null) {
                c0.c(new RunnableC0393a(remoteCallResultCallback, str, callResult));
            }
        }
    }

    public i(Context context) {
        super(context);
    }

    public static i e(Context context) {
        i iVar;
        synchronized (f28815i) {
            if (f28814h == null) {
                f28814h = new i(context);
            }
            iVar = f28814h;
        }
        return iVar;
    }

    @Override // ha.d
    public void a(ComponentName componentName) {
        long currentTimeMillis = System.currentTimeMillis() - this.f28816g;
        String packageName = componentName.getPackageName();
        synchronized (r0.f28623b) {
            r0.f28622a = packageName;
        }
        d("AidlConnectMonitorMethod", String.valueOf(currentTimeMillis), null, null);
    }

    @Override // ha.d
    public String c() {
        return "Decouple.PPSApiServiceManager";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void d(String str, String str2, RemoteCallResultCallback<T> remoteCallResultCallback, Class<T> cls) {
        SERVICE service;
        ex.V(c(), "call remote method: " + str);
        if (ex.Code()) {
            ex.Code(c(), "paramContent: %s", n.e(str2));
        }
        a aVar = new a(str, str2, remoteCallResultCallback, cls);
        ex.Code(c(), "handleTask");
        b bVar = this.f28805e;
        aVar.f28807a = bVar;
        synchronized (bVar) {
            bVar.f28793c++;
            w.d(bVar.f28792b);
            ex.V(bVar.a(), "inc count: " + bVar.f28793c);
        }
        synchronized (this) {
            service = this.f28802b;
        }
        if (service == 0) {
            this.f28803c.add(aVar);
            Context context = this.f28804d;
            try {
                ex.V(c(), "bindService " + System.currentTimeMillis());
                this.f28816g = System.currentTimeMillis();
                Intent intent = new Intent("com.huawei.android.hms.ppskit.PPS_API_SERVICE");
                String f = f();
                ex.V(c(), "bind service pkg: " + f);
                intent.setPackage(f);
                if (!cl.B(context) && b0.d(f)) {
                    String a10 = b0.a(context, f);
                    boolean isEmpty = TextUtils.isEmpty(a10);
                    ex.V(c(), "is sign empty: %s", Boolean.valueOf(isEmpty));
                    if (!isEmpty && !ct.Code(context, f, a10)) {
                        return;
                    }
                }
                boolean bindService = context.bindService(intent, this.f, 1);
                ex.V(c(), "bind service result: %s", Boolean.valueOf(bindService));
                if (!bindService) {
                    b("bind service failed");
                    return;
                }
                return;
            } catch (SecurityException unused) {
                ex.I(c(), "bindService SecurityException");
                b("bindService SecurityException");
                return;
            } catch (Exception e10) {
                ex.I(c(), "bindService ".concat(e10.getClass().getSimpleName()));
                b("bindService ".concat(e10.getClass().getSimpleName()));
                return;
            }
        }
        aVar.a(service);
    }

    public String f() {
        return r0.n(this.f28804d);
    }
}
