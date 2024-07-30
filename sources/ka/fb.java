package ka;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.huawei.Omid;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fb implements ob {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f31173u = jb.a(com.huawei.hms.ads.hb.f);

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f31174s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public Context f31175t;

    public static void c(Context context) {
        Omid.activate(context);
    }

    public final void a(View view) {
        ArrayList arrayList = this.f31174s;
        if (!arrayList.isEmpty()) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AdSession) it.next()).registerAdView(view);
                }
            } catch (Throwable unused) {
                n7.e("AdsessionAgent", "registerAdView, fail");
            }
        }
    }

    public final void b(AdSessionContext adSessionContext, lb lbVar) {
        try {
            if (!lb.a()) {
                n7.e("AdsessionAgent", "init AdSession failed");
                return;
            }
            AdSessionConfiguration b10 = lbVar.b();
            if (b10 == null) {
                n7.e("AdsessionAgent", "adSessionConfiguration is null");
                return;
            }
            c(this.f31175t);
            AdSession createAdSession = AdSession.createAdSession(b10, adSessionContext);
            if (createAdSession == null) {
                n7.e("AdsessionAgent", "adSession is null");
            } else {
                this.f31174s.add(createAdSession);
            }
        } catch (Throwable unused) {
            n7.g("AdsessionAgent", "initAdSession error");
        }
    }

    public final ArrayList d() {
        return this.f31174s;
    }

    public final Context e() {
        return this.f31175t;
    }

    @Override // ka.ob
    public final void b() {
        ArrayList arrayList = this.f31174s;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AdSession adSession = (AdSession) it.next();
                n7.b("AdsessionAgent", "adsession start");
                adSession.start();
            }
        } catch (Throwable unused) {
            n7.e("AdsessionAgent", "start, fail");
        }
    }

    @Override // ka.ob
    public final void c() {
        ArrayList arrayList = this.f31174s;
        if (!arrayList.isEmpty()) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AdSession) it.next()).finish();
                    n7.b("AdsessionAgent", " adSession finish");
                }
            } catch (Throwable unused) {
                n7.e("AdsessionAgent", "finish, fail");
            }
        }
        arrayList.clear();
    }
}
