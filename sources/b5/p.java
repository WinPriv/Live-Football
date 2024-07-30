package b5;

import b5.q;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Comparator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q.f f2984s;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q.f fVar = this.f2984s;
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }
}
