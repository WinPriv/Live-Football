package ka;

import java.io.File;

/* loaded from: classes2.dex */
public final class r5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p5 f31741s;

    public r5(p5 p5Var) {
        this.f31741s = p5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p5 p5Var = this.f31741s;
        p5Var.getClass();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p5Var.f34721c);
            String str = File.separator;
            sb2.append(str);
            sb2.append("tmp");
            sb2.append(str);
            String sb3 = sb2.toString();
            String[] list = new File(sb3).list();
            if (list != null && list.length > 0) {
                p5Var.l(sb3, list);
            }
        } catch (Throwable unused) {
            n7.g("VideoDownloadManager", "deleteTimeoutFile exception");
        }
    }
}
