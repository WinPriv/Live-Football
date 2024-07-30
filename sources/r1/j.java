package r1;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import r1.n;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class j extends n {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends n.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f34838b.f59d = OverwritingInputMerger.class.getName();
        }
    }

    public j(a aVar) {
        super(aVar.f34837a, aVar.f34838b, aVar.f34839c);
    }
}
