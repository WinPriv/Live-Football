package androidx.lifecycle;

import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements k {

    /* renamed from: s, reason: collision with root package name */
    public final e f1913s;

    /* renamed from: t, reason: collision with root package name */
    public final k f1914t;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1915a;

        static {
            int[] iArr = new int[i.b.values().length];
            f1915a = iArr;
            try {
                iArr[i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1915a[i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1915a[i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1915a[i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1915a[i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1915a[i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1915a[i.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(e eVar, k kVar) {
        this.f1913s = eVar;
        this.f1914t = kVar;
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        int i10 = a.f1915a[bVar.ordinal()];
        e eVar = this.f1913s;
        switch (i10) {
            case 1:
                eVar.a();
                break;
            case 2:
                eVar.onStart(mVar);
                break;
            case 3:
                eVar.f();
                break;
            case 4:
                eVar.b();
                break;
            case 5:
                eVar.onStop(mVar);
                break;
            case 6:
                eVar.onDestroy(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.f1914t;
        if (kVar != null) {
            kVar.c(mVar, bVar);
        }
    }
}
