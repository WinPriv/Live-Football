package m2;

import j2.k;
import java.util.List;

/* compiled from: AnimatableIntegerValue.java */
/* loaded from: classes.dex */
public final class d extends u0.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32642u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, int i10) {
        super(list, 1);
        this.f32642u = i10;
    }

    @Override // m2.i
    public final j2.a a() {
        int i10 = this.f32642u;
        Object obj = this.f35738t;
        switch (i10) {
            case 0:
                return new j2.f((List) obj);
            default:
                return new k((List) obj);
        }
    }
}
