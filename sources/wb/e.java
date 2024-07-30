package wb;

import android.webkit.JavascriptInterface;
import ka.p4;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p4 f36197a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36198b = false;

    public e(p4 p4Var) {
        this.f36197a = p4Var;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f36198b) {
            return "";
        }
        this.f36198b = true;
        return this.f36197a.f31624b;
    }
}
