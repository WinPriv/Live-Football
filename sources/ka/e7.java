package ka;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandView;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f31121a;

    /* renamed from: b, reason: collision with root package name */
    public final PPSWebView f31122b;

    /* renamed from: c, reason: collision with root package name */
    public final p9 f31123c;

    /* loaded from: classes2.dex */
    public static class a extends ArrayList<Integer> {
        public a() {
            add(3);
            add(1);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends ArrayList<Integer> {
        public b() {
            add(12);
        }
    }

    static {
        new a();
        new b();
    }

    public e7(f7 f7Var, LinkedLandView linkedLandView, PPSWebView pPSWebView) {
        this.f31121a = f7Var;
        this.f31123c = linkedLandView;
        this.f31122b = pPSWebView;
    }

    public final RelativeLayout a() {
        p9 p9Var;
        boolean z10;
        PPSWebView pPSWebView = this.f31122b;
        g7 g7Var = this.f31121a;
        if (g7Var == null) {
            return pPSWebView;
        }
        if (!((f7) g7Var).b()) {
            return pPSWebView;
        }
        if ((g7Var instanceof f7) && ((z10 = (p9Var = this.f31123c) instanceof LinkedLandView)) && pPSWebView != null) {
            LinkedLandView linkedLandView = (LinkedLandView) p9Var;
            linkedLandView.d(g7Var);
            n7.b("LinkedLandView", "registerPPSWebView");
            FrameLayout frameLayout = (FrameLayout) linkedLandView.findViewById(R.id.linked_pps_web_view);
            if (pPSWebView.getCustomEmuiActionBar() != null) {
                try {
                    linkedLandView.f22673x = pPSWebView.getCustomEmuiActionBar();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10, -1);
                    layoutParams.addRule(2, R.id.linked_native_view);
                    linkedLandView.addView(linkedLandView.f22673x, layoutParams);
                    linkedLandView.f22673x.post(new wa.c(linkedLandView));
                } catch (Throwable th) {
                    n7.h("LinkedLandView", "setCustomActionBar error: %s", th.getClass().getSimpleName());
                }
            }
            frameLayout.addView(pPSWebView);
            linkedLandView.f22672w.setWebView(pPSWebView.findViewById(R.id.hiad_webview));
            if (z10) {
                linkedLandView.setPlayModeChangeListener(null);
            }
            return linkedLandView;
        }
        return pPSWebView;
    }
}
