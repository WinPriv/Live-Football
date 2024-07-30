package ka;

import android.text.TextUtils;
import android.webkit.WebSettings;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class rc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f31756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sc f31757t;

    public rc(sc scVar, WebSettings webSettings) {
        this.f31757t = scVar;
        this.f31756s = webSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String simpleName;
        String str;
        Object obj = this.f31756s;
        String o02 = ((ContentRecord) this.f31757t.f32660t).o0();
        if (!TextUtils.isEmpty(o02)) {
            try {
                for (String str2 : o02.split("\\,")) {
                    String[] split = str2.split("\\|");
                    androidx.transition.n.H(obj, split[0], split[1], split[2]);
                }
            } catch (RuntimeException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "setBooleanValue RuntimeException:";
                n7.g("ReflectAPI", str.concat(simpleName));
            } catch (Exception e11) {
                simpleName = e11.getClass().getSimpleName();
                str = "setBooleanValue Exception:";
                n7.g("ReflectAPI", str.concat(simpleName));
            }
        }
    }
}
