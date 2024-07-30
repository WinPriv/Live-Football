package gb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.HiAnalytics;
import gb.m;
import v9.Task;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: gb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0388a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f28544s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f28545t;

        public RunnableC0388a(Context context, m mVar) {
            this.f28544s = context;
            this.f28545t = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Task aaid = HiAnalytics.getInstance(this.f28544s).getAAID();
                if (aaid != null) {
                    this.f28545t.d((String) aaid.c());
                }
            } catch (Throwable th) {
                e0.i.q(th, "error getAgcAaid: ", "AaidUtil");
            }
        }
    }

    public static String a(Context context) {
        String str;
        if (androidx.transition.n.k(com.huawei.openalliance.ad.constant.w.bO)) {
            m b10 = m.b(context);
            synchronized (b10.f28595b) {
                b10.g();
                m.b bVar = b10.f28596c;
                if (bVar == null) {
                    str = "";
                } else {
                    str = bVar.y;
                }
            }
            if (TextUtils.isEmpty(str)) {
                c0.c(new RunnableC0388a(context, b10));
            }
            return str;
        }
        return "";
    }
}
