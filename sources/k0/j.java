package k0;

import java.util.ArrayList;
import k0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class j implements m0.a<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30265a;

    public j(String str) {
        this.f30265a = str;
    }

    @Override // m0.a
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f30268c) {
            q.i<String, ArrayList<m0.a<k.a>>> iVar = k.f30269d;
            ArrayList<m0.a<k.a>> orDefault = iVar.getOrDefault(this.f30265a, null);
            if (orDefault != null) {
                iVar.remove(this.f30265a);
                for (int i10 = 0; i10 < orDefault.size(); i10++) {
                    orDefault.get(i10).accept(aVar2);
                }
            }
        }
    }
}
