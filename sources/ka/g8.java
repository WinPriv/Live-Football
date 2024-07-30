package ka;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class g8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31209t;

    public g8(w7 w7Var, String str) {
        this.f31209t = w7Var;
        this.f31208s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f31208s;
        if (str != null && TextUtils.equals(str, this.f31209t.f32079d)) {
            this.f31209t.p(true);
        }
    }
}
