package r1;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import r1.j;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f34834a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.o f34835b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f34836c;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends n> {

        /* renamed from: a, reason: collision with root package name */
        public UUID f34837a;

        /* renamed from: b, reason: collision with root package name */
        public a2.o f34838b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f34839c;

        public a(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.f34839c = hashSet;
            this.f34837a = UUID.randomUUID();
            this.f34838b = new a2.o(this.f34837a.toString(), cls.getName());
            hashSet.add(cls.getName());
        }

        public final j a() {
            boolean z10;
            j jVar = new j((j.a) this);
            b bVar = this.f34838b.f64j;
            boolean z11 = true;
            if (bVar.f34807h.f34810a.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !bVar.f34804d && !bVar.f34802b && !bVar.f34803c) {
                z11 = false;
            }
            a2.o oVar = this.f34838b;
            if (oVar.f70q) {
                if (!z11) {
                    if (oVar.f61g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            this.f34837a = UUID.randomUUID();
            a2.o oVar2 = new a2.o(this.f34838b);
            this.f34838b = oVar2;
            oVar2.f56a = this.f34837a.toString();
            return jVar;
        }

        public final j.a b(long j10, TimeUnit timeUnit) {
            this.f34838b.f61g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f34838b.f61g) {
                return (j.a) this;
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public n(UUID uuid, a2.o oVar, HashSet hashSet) {
        this.f34834a = uuid;
        this.f34835b = oVar;
        this.f34836c = hashSet;
    }
}
