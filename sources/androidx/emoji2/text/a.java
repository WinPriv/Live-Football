package androidx.emoji2.text;

import com.applovin.exoplayer2.l.ai;
import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1614b;

    public /* synthetic */ a(String str, int i10) {
        this.f1613a = i10;
        this.f1614b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f1613a;
        String str = this.f1614b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return ai.a(runnable, str);
        }
    }
}
