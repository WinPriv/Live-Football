package m2;

import j2.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableColorValue.java */
/* loaded from: classes.dex */
public final class a extends u0.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32640u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ArrayList arrayList, int i10) {
        super(arrayList, 1);
        this.f32640u = i10;
    }

    @Override // m2.i
    public final j2.a a() {
        int i10 = this.f32640u;
        Object obj = this.f35738t;
        switch (i10) {
            case 0:
                return new j2.b((List) obj);
            default:
                return new j((List) obj);
        }
    }
}
