package y1;

import a4.j;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.R;
import com.onesignal.a4;
import com.onesignal.c3;
import com.onesignal.j3;
import com.onesignal.p3;
import com.onesignal.s1;
import f4.k;
import java.util.concurrent.Executor;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public final class g implements b4.b {

    /* renamed from: x, reason: collision with root package name */
    public static g f36542x;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36543s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f36544t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f36545u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f36546v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f36547w;

    public g(c3 c3Var, a4 a4Var, p3 p3Var, c3 c3Var2) {
        this.f36543s = 7;
        zc.d.d(c3Var, "logger");
        zc.d.d(a4Var, "apiClient");
        this.f36546v = c3Var;
        this.f36547w = a4Var;
        zc.d.b(p3Var);
        zc.d.b(c3Var2);
        this.f36544t = new j(c3Var, p3Var, c3Var2);
    }

    public static g a(View view) {
        int i10 = R.id.NativeContainer;
        FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.NativeContainer, view);
        if (frameLayout != null) {
            i10 = R.id.native_ad_view;
            ATNativeAdView aTNativeAdView = (ATNativeAdView) a0.a.H0(R.id.native_ad_view, view);
            if (aTNativeAdView != null) {
                i10 = R.id.native_selfrender_view;
                View H0 = a0.a.H0(R.id.native_selfrender_view, view);
                if (H0 != null) {
                    return new g((CardView) view, frameLayout, aTNativeAdView, m9.j.a(H0), 5);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static synchronized g c(Context context, d2.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f36542x == null) {
                f36542x = new g(context, aVar);
            }
            gVar = f36542x;
        }
        return gVar;
    }

    public final dc.b b() {
        j jVar = (j) this.f36544t;
        boolean o = jVar.o();
        Object obj = this.f36547w;
        Object obj2 = this.f36546v;
        if (o) {
            return new dc.e((s1) obj2, jVar, new dc.f((j3) obj));
        }
        return new dc.c((s1) obj2, jVar, new dc.d((j3) obj));
    }

    public final ec.c d() {
        ec.c cVar = (ec.c) this.f36545u;
        if (cVar != null) {
            j jVar = (j) this.f36544t;
            if (!jVar.o() && (cVar instanceof dc.c)) {
                zc.d.b(cVar);
                return cVar;
            }
            if (jVar.o() && (cVar instanceof dc.e)) {
                zc.d.b(cVar);
                return cVar;
            }
            return b();
        }
        return b();
    }

    @Override // tc.a
    public final Object get() {
        return new f4.j((Executor) ((tc.a) this.f36544t).get(), (g4.d) ((tc.a) this.f36545u).get(), (k) ((tc.a) this.f36546v).get(), (h4.b) ((tc.a) this.f36547w).get());
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36543s = i10;
        this.f36544t = obj;
        this.f36545u = obj2;
        this.f36546v = obj3;
        this.f36547w = obj4;
    }

    public g() {
        this.f36543s = 1;
        this.f36544t = new q.b();
        this.f36545u = new SparseArray();
        this.f36546v = new q.f();
        this.f36547w = new q.b();
    }

    public g(Context context, d2.a aVar) {
        this.f36543s = 0;
        Context applicationContext = context.getApplicationContext();
        this.f36544t = new a(applicationContext, aVar);
        this.f36545u = new b(applicationContext, aVar);
        this.f36546v = new e(applicationContext, aVar);
        this.f36547w = new f(applicationContext, aVar);
    }
}
