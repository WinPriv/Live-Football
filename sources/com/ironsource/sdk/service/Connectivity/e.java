package com.ironsource.sdk.service.Connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f26540a = com.anythink.core.c.e.f4869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26541b = 23;

    /* renamed from: c, reason: collision with root package name */
    public final d f26542c;

    /* renamed from: d, reason: collision with root package name */
    public a f26543d;

    /* loaded from: classes2.dex */
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f26544a;

        public a(Context context) {
            this.f26544a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            e eVar = e.this;
            Context context = this.f26544a;
            if (network != null) {
                d dVar = eVar.f26542c;
                String a10 = com.ironsource.d.a.a(network, context);
                com.ironsource.d.a.a(context, network);
                dVar.a(a10);
                return;
            }
            d dVar2 = eVar.f26542c;
            String a11 = com.ironsource.d.a.a(context);
            com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
            dVar2.a(a11);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                d dVar = e.this.f26542c;
                Context context = this.f26544a;
                dVar.a(com.ironsource.d.a.a(network, context), com.ironsource.d.a.a(context, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                d dVar = e.this.f26542c;
                Context context = this.f26544a;
                dVar.a(com.ironsource.d.a.a(network, context), com.ironsource.d.a.a(context, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            if (com.ironsource.d.a.a(this.f26544a).equals("none")) {
                e.this.f26542c.a();
            }
        }
    }

    public e(d dVar) {
        this.f26542c = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.f26543d = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi"})
    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f26541b && this.f26543d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f26543d);
            } catch (Exception unused) {
                Log.e(this.f26540a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi", "MissingPermission"})
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= this.f26541b) {
            b(context);
            if (com.ironsource.d.a.a(context).equals("none")) {
                this.f26542c.a();
            }
            if (this.f26543d == null) {
                this.f26543d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f26543d);
                }
            } catch (Exception unused) {
                Log.e(this.f26540a, "NetworkCallback was not able to register");
            }
        }
    }
}
