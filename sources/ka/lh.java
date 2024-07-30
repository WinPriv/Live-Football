package ka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lh {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31426b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static lh f31427c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31428a = new HashMap();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: ka.lh$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0425a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Intent f31430s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Context f31431t;

            public RunnableC0425a(Intent intent, Context context) {
                this.f31430s = intent;
                this.f31431t = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = this.f31430s;
                String action = intent.getAction();
                for (Map.Entry entry : lh.this.f31428a.entrySet()) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) entry.getKey();
                    IntentFilter intentFilter = (IntentFilter) entry.getValue();
                    if (intentFilter != null && intentFilter.matchAction(action)) {
                        broadcastReceiver.onReceive(this.f31431t, intent);
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
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new RunnableC0425a(intent, context));
        }
    }

    public lh() {
        new a();
    }
}
