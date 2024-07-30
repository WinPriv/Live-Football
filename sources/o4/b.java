package o4;

import com.google.android.exoplayer2.drm.e;
import d6.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33614s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f33615t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f33616u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f33617v;

    public /* synthetic */ b(e.a aVar, com.google.android.exoplayer2.drm.e eVar, int i10) {
        this.f33616u = aVar;
        this.f33617v = eVar;
        this.f33615t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33614s;
        int i11 = this.f33615t;
        Object obj = this.f33617v;
        Object obj2 = this.f33616u;
        switch (i10) {
            case 0:
                e.a aVar = (e.a) obj2;
                com.google.android.exoplayer2.drm.e eVar = (com.google.android.exoplayer2.drm.e) obj;
                int i12 = aVar.f19977a;
                eVar.getClass();
                eVar.K(i12, aVar.f19978b, i11);
                return;
            default:
                o.a aVar2 = (o.a) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    o.c cVar = (o.c) it.next();
                    if (!cVar.f27341d) {
                        if (i11 != -1) {
                            cVar.f27339b.a(i11);
                        }
                        cVar.f27340c = true;
                        aVar2.invoke(cVar.f27338a);
                    }
                }
                return;
        }
    }

    public /* synthetic */ b(CopyOnWriteArraySet copyOnWriteArraySet, int i10, o.a aVar) {
        this.f33616u = copyOnWriteArraySet;
        this.f33615t = i10;
        this.f33617v = aVar;
    }
}
