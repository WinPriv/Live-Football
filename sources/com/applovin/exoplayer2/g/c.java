package com.applovin.exoplayer2.g;

import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f15113a = new c() { // from class: com.applovin.exoplayer2.g.c.1
        @Override // com.applovin.exoplayer2.g.c
        public boolean a(v vVar) {
            String str = vVar.f16838l;
            if (!o.V.equals(str) && !o.ai.equals(str) && !o.ag.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.g.c
        public b b(v vVar) {
            String str = vVar.f16838l;
            if (str != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals(o.V)) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals(o.ai)) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals(o.ag)) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new com.applovin.exoplayer2.g.a.b();
                    case 1:
                        return new com.applovin.exoplayer2.g.d.a();
                    case 2:
                        return new com.applovin.exoplayer2.g.e.g();
                    case 3:
                        return new com.applovin.exoplayer2.g.b.b();
                    case 4:
                        return new com.applovin.exoplayer2.g.g.c();
                }
            }
            throw new IllegalArgumentException(s.f.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
    };

    boolean a(v vVar);

    b b(v vVar);
}
