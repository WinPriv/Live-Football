package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final p f18660a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f18661b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f18662c;

    /* renamed from: d, reason: collision with root package name */
    private a f18663d;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, p pVar) {
        this.f18660a = pVar;
        this.f18661b = activity;
    }

    public void b() {
        this.f18661b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f18662c = new AlertDialog.Builder(b.this.f18661b).setTitle((CharSequence) b.this.f18660a.a(com.applovin.impl.sdk.c.b.bK)).setMessage((CharSequence) b.this.f18660a.a(com.applovin.impl.sdk.c.b.bL)).setCancelable(false).setPositiveButton((CharSequence) b.this.f18660a.a(com.applovin.impl.sdk.c.b.bN), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f18663d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.f18660a.a(com.applovin.impl.sdk.c.b.bM), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f18663d.b();
                    }
                }).show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.f18662c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void a(a aVar) {
        this.f18663d = aVar;
    }

    public void a() {
        this.f18661b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f18662c != null) {
                    b.this.f18662c.dismiss();
                }
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.f18661b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.f18661b);
                builder.setTitle(eVar.an());
                String ao = eVar.ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.ap(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.f18662c = builder.show();
            }
        });
    }
}
