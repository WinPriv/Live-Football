package jc;

import androidx.activity.n;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f30219s;

    public f(String str) {
        this.f30219s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            n.f520z0 = new JSONObject(this.f30219s);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
