package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b, reason: collision with root package name */
    private static AlertDialog f19019b;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f19020c = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final o f19021a;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f19022d;

    /* renamed from: com.applovin.impl.sdk.n$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f19023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f19024b;

        public AnonymousClass1(p pVar, a aVar) {
            this.f19023a = pVar;
            this.f19024b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.f19021a.d()) {
                this.f19023a.L();
                if (y.a()) {
                    this.f19023a.L().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                    return;
                }
                return;
            }
            Activity a10 = this.f19023a.w().a();
            if (a10 != null && com.applovin.impl.sdk.utils.i.a(p.y())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = n.f19019b = new AlertDialog.Builder(AnonymousClass1.this.f19023a.w().a()).setTitle((CharSequence) AnonymousClass1.this.f19023a.a(com.applovin.impl.sdk.c.b.aT)).setMessage((CharSequence) AnonymousClass1.this.f19023a.a(com.applovin.impl.sdk.c.b.aU)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.f19023a.a(com.applovin.impl.sdk.c.b.aV), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f19024b.a();
                                dialogInterface.dismiss();
                                n.f19020c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.f19023a.a(com.applovin.impl.sdk.c.b.aW), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f19024b.b();
                                dialogInterface.dismiss();
                                n.f19020c.set(false);
                                long longValue = ((Long) AnonymousClass1.this.f19023a.a(com.applovin.impl.sdk.c.b.aR)).longValue();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                n.this.a(longValue, anonymousClass1.f19023a, anonymousClass1.f19024b);
                            }
                        }).create();
                        n.f19019b.show();
                    }
                });
                return;
            }
            if (a10 == null) {
                this.f19023a.L();
                if (y.a()) {
                    this.f19023a.L().e("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
                }
            } else {
                this.f19023a.L();
                if (y.a()) {
                    this.f19023a.L().e("ConsentAlertManager", "No internet available - rescheduling consent alert...");
                }
            }
            n.f19020c.set(false);
            n.this.a(((Long) this.f19023a.a(com.applovin.impl.sdk.c.b.aS)).longValue(), this.f19023a, this.f19024b);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public n(o oVar, p pVar) {
        this.f19021a = oVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (this.f19022d == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19022d.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f19022d.c();
        }
    }

    public void a(long j10, p pVar, a aVar) {
        if (j10 <= 0) {
            return;
        }
        AlertDialog alertDialog = f19019b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f19020c.getAndSet(true)) {
                if (j10 < this.f19022d.a()) {
                    pVar.L();
                    if (y.a()) {
                        y L = pVar.L();
                        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Scheduling consent alert earlier (", j10, "ms) than remaining scheduled time (");
                        k10.append(this.f19022d.a());
                        k10.append("ms)");
                        L.b("ConsentAlertManager", k10.toString());
                    }
                    this.f19022d.d();
                } else {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f19022d.a() + " milliseconds");
                        return;
                    }
                    return;
                }
            }
            pVar.L();
            if (y.a()) {
                pVar.L().b("ConsentAlertManager", a3.l.k("Scheduling consent alert for ", j10, " milliseconds"));
            }
            this.f19022d = com.applovin.impl.sdk.utils.p.a(j10, pVar, new AnonymousClass1(pVar, aVar));
        }
    }
}
