package com.anythink.expressad.exoplayer.g;

import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f8126a = new d() { // from class: com.anythink.expressad.exoplayer.g.d.1
        @Override // com.anythink.expressad.exoplayer.g.d
        public final boolean a(m mVar) {
            String str = mVar.f9257h;
            if (!o.V.equals(str) && !o.ai.equals(str) && !o.ag.equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.anythink.expressad.exoplayer.g.d
        public final b b(m mVar) {
            String str = mVar.f9257h;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1248341703:
                    if (str.equals(o.V)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(o.ai)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(o.ag)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new com.anythink.expressad.exoplayer.g.b.g();
                case 1:
                    return new com.anythink.expressad.exoplayer.g.a.b();
                case 2:
                    return new com.anythink.expressad.exoplayer.g.c.c();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    };

    boolean a(m mVar);

    b b(m mVar);
}
