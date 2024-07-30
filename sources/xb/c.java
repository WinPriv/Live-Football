package xb;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final Handler f36521s;

    /* renamed from: t, reason: collision with root package name */
    public final a f36522t;

    public c(a aVar, Handler handler) {
        this.f36522t = aVar;
        this.f36521s = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        a aVar = this.f36522t;
        com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(aVar.f36513a.getParent(), aVar.f36513a.getName());
        Message message = new Message();
        message.obj = cVar;
        String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
        if (makeDir == null) {
            i10 = 1020;
        } else {
            i10 = new b(new a(cVar, aVar.f36514b, aVar.f36515c, aVar.f36516d, aVar.f36517e), makeDir).call().f26528a;
            if (i10 == 200) {
                i10 = 1016;
            }
        }
        message.what = i10;
        this.f36521s.sendMessage(message);
    }
}
