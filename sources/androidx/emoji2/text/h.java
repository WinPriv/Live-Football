package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class h extends f.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.h f1639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1640b;

    public h(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1639a = hVar;
        this.f1640b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1640b;
        try {
            this.f1639a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1640b;
        try {
            this.f1639a.b(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
