package ka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m6 {

    /* renamed from: d, reason: collision with root package name */
    public static m6 f31448d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31449e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31450a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f31451b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31452c;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: ka.m6$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0426a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Intent f31454s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Context f31455t;

            public RunnableC0426a(Intent intent, Context context) {
                this.f31454s = intent;
                this.f31455t = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = this.f31454s;
                String action = intent.getAction();
                for (Map.Entry entry : m6.this.f31450a.entrySet()) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) entry.getKey();
                    IntentFilter intentFilter = (IntentFilter) entry.getValue();
                    if (intentFilter != null && intentFilter.matchAction(action)) {
                        broadcastReceiver.onReceive(this.f31455t, intent);
                    }
                }
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new RunnableC0426a(intent, context));
        }
    }

    public m6(Context context) {
        this.f31452c = context.getApplicationContext();
    }

    public static m6 a(Context context) {
        m6 m6Var;
        synchronized (f31449e) {
            if (f31448d == null) {
                f31448d = new m6(context);
            }
            m6Var = f31448d;
        }
        return m6Var;
    }
}
