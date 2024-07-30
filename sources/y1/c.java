package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import r1.h;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f36527h = h.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final a f36528g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.f(intent);
            }
        }
    }

    public c(Context context, d2.a aVar) {
        super(context, aVar);
        this.f36528g = new a();
    }

    @Override // y1.d
    public final void c() {
        h.c().a(f36527h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f36531b.registerReceiver(this.f36528g, e());
    }

    @Override // y1.d
    public final void d() {
        h.c().a(f36527h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f36531b.unregisterReceiver(this.f36528g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
