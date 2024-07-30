package ka;

/* loaded from: classes2.dex */
public final class o8 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31597s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w7 f31598t;

    public o8(w7 w7Var, String str) {
        this.f31598t = w7Var;
        this.f31597s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31598t.t(this.f31597s);
        } catch (u5 e10) {
            n7.c("MediaPlayerAgent", "set media file error:%s", e10.getMessage());
            n7.g("MediaPlayerAgent", "set media file error:".concat(u5.class.getSimpleName()));
        }
    }
}
