package e4;

import android.content.Context;
import f4.b;
import f4.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import w3.d;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class c implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27748s;

    /* renamed from: t, reason: collision with root package name */
    public final tc.a f27749t;

    public /* synthetic */ c(tc.a aVar, int i10) {
        this.f27748s = i10;
        this.f27749t = aVar;
    }

    @Override // tc.a
    public final Object get() {
        int i10 = this.f27748s;
        tc.a aVar = this.f27749t;
        switch (i10) {
            case 0:
                i4.a aVar2 = (i4.a) aVar.get();
                HashMap hashMap = new HashMap();
                d dVar = d.DEFAULT;
                b.a aVar3 = new b.a();
                Set<d.b> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    aVar3.f28070c = emptySet;
                    aVar3.f28068a = 30000L;
                    aVar3.f28069b = 86400000L;
                    hashMap.put(dVar, aVar3.a());
                    w3.d dVar2 = w3.d.HIGHEST;
                    b.a aVar4 = new b.a();
                    Set<d.b> emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        aVar4.f28070c = emptySet2;
                        aVar4.f28068a = 1000L;
                        aVar4.f28069b = 86400000L;
                        hashMap.put(dVar2, aVar4.a());
                        w3.d dVar3 = w3.d.VERY_LOW;
                        b.a aVar5 = new b.a();
                        Set<d.b> emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            aVar5.f28070c = emptySet3;
                            aVar5.f28068a = 86400000L;
                            aVar5.f28069b = 86400000L;
                            Set<d.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(d.b.DEVICE_IDLE)));
                            if (unmodifiableSet != null) {
                                aVar5.f28070c = unmodifiableSet;
                                hashMap.put(dVar3, aVar5.a());
                                if (aVar2 != null) {
                                    if (hashMap.keySet().size() >= w3.d.values().length) {
                                        new HashMap();
                                        return new f4.a(aVar2, hashMap);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
