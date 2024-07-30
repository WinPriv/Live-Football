package k4;

import android.content.Intent;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import j5.u;
import j5.x;
import k4.y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30823s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30824t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f30825u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f30826v;

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30823s = i10;
        this.f30825u = obj;
        this.f30826v = obj2;
        this.f30824t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30823s;
        Object obj = this.f30824t;
        Object obj2 = this.f30826v;
        Object obj3 = this.f30825u;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj2;
                l4.a aVar = ((y0.a) obj3).f30846t.f30840h;
                int intValue = ((Integer) pair.first).intValue();
                u.b bVar = (u.b) pair.second;
                bVar.getClass();
                aVar.h0(intValue, bVar, (j5.r) obj);
                return;
            case 1:
                x.a aVar2 = (x.a) obj3;
                ((j5.x) obj2).O(aVar2.f29851a, aVar2.f29852b, (j5.r) obj);
                return;
            default:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) obj3;
                Intent intent = (Intent) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                int i11 = EnhancedIntentService.f21271x;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
        }
    }
}
