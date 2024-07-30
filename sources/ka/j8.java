package ka;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class j8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31324s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31325t;

    public j8(w7 w7Var, String str) {
        this.f31325t = w7Var;
        this.f31324s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f31324s;
        if (str != null && TextUtils.equals(str, this.f31325t.f32079d)) {
            w7.A(this.f31325t);
        } else {
            n7.e("MediaPlayerAgent", "playWhenUrlMatchs - url not match");
        }
    }
}
