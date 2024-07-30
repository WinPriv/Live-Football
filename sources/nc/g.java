package nc;

import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f33499s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f33500t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String[] f33501u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f33502v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f33503w;

    public g(String str, String str2, String[] strArr, int i10, ExecutorService executorService) {
        this.f33499s = str;
        this.f33500t = str2;
        this.f33501u = strArr;
        this.f33502v = i10;
        this.f33503w = executorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Matcher matcher = Pattern.compile(this.f33499s, 34).matcher(new qc.a(this.f33500t));
            if (matcher.find()) {
                this.f33501u[0] = matcher.group(this.f33502v);
            }
        } catch (Throwable unused) {
        }
        try {
            synchronized (this.f33503w) {
                this.f33503w.notifyAll();
            }
        } catch (Throwable unused2) {
        }
    }
}
