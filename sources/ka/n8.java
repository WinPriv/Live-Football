package ka;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class n8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31495s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31496t;

    public n8(w7 w7Var, String str) {
        this.f31496t = w7Var;
        this.f31495s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f31495s;
        if (str != null && TextUtils.equals(str, this.f31496t.f32079d)) {
            w7.D(this.f31496t);
        }
    }
}
