package k4;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import d6.o;
import k4.e1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements o.a, s7.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30822s;

    public /* synthetic */ w(int i10) {
        this.f30822s = i10;
    }

    @Override // s7.e
    public Object d(s7.v vVar) {
        switch (this.f30822s) {
            case 0:
                return ExecutorsRegistrar.f21263a.get();
            default:
                return FirebaseMessagingRegistrar.a(vVar);
        }
    }

    @Override // d6.o.a
    public void invoke(Object obj) {
        ((e1.c) obj).onRepeatModeChanged(this.f30822s);
    }
}
