package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1072Mu {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = C1072Mu.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0R> A03;
    public final WeakReference<InterfaceC1073Mv> A04;
    public final WeakReference<C1137Pi> A05;
    public final WeakReference<C1197Rq> A06;

    public C1072Mu(C1197Rq c1197Rq, InterfaceC1073Mv interfaceC1073Mv, C1137Pi c1137Pi, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1316Wj c1316Wj) {
        this.A06 = new WeakReference<>(c1197Rq);
        this.A04 = new WeakReference<>(interfaceC1073Mv);
        this.A05 = new WeakReference<>(c1137Pi);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1316Wj.A0D());
    }

    private C0R A00() {
        C0R funnel = this.A03.get();
        if (funnel == null) {
            return new ZP();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C1010Kj.A01(C07067u.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AFH(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AFI();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z10 = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z10) {
            this.A01.get().set(true);
            A00().AFJ();
            if (this.A06.get().isShown()) {
                A00().AFK();
                new Handler(Looper.getMainLooper()).post(new C1199Rs(this.A05));
            }
            InterfaceC1073Mv interfaceC1073Mv = this.A04.get();
            if (interfaceC1073Mv != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1071Mt(this, interfaceC1073Mv));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1197Rq webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AFL(true);
            return;
        }
        InterfaceC1073Mv listener = this.A04.get();
        if (listener == null) {
            A00().AFL(true);
        } else {
            A00().AFL(false);
            listener.ABb();
        }
    }
}
