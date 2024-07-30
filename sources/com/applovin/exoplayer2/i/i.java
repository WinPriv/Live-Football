package com.applovin.exoplayer2.i;

import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f15811a = new i() { // from class: com.applovin.exoplayer2.i.i.1
        @Override // com.applovin.exoplayer2.i.i
        public boolean a(v vVar) {
            String str = vVar.f16838l;
            if (!o.O.equals(str) && !o.P.equals(str) && !o.Z.equals(str) && !o.f9066ab.equals(str) && !o.Y.equals(str) && !o.f9065aa.equals(str) && !o.W.equals(str) && !o.f9067ac.equals(str) && !o.X.equals(str) && !o.aj.equals(str) && !o.af.equals(str) && !"text/x-exoplayer-cues".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.i.i
        public g b(v vVar) {
            String str = vVar.f16838l;
            if (str != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals(o.aj)) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals(o.af)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals(o.f9066ab)) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals(o.O)) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals(o.f9065aa)) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals(o.P)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals(o.f9067ac)) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals(o.W)) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals(o.X)) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals(o.Y)) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals(o.Z)) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new com.applovin.exoplayer2.i.b.a(vVar.f16840n);
                    case 1:
                        return new com.applovin.exoplayer2.i.c.a();
                    case 2:
                        return new com.applovin.exoplayer2.i.i.a();
                    case 3:
                        return new com.applovin.exoplayer2.i.i.g();
                    case 4:
                        return new com.applovin.exoplayer2.i.h.a(vVar.f16840n);
                    case 5:
                        return new com.applovin.exoplayer2.i.e.a(vVar.f16840n);
                    case 6:
                    case '\b':
                        return new com.applovin.exoplayer2.i.a.a(str, vVar.D, 16000L);
                    case 7:
                        return new c();
                    case '\t':
                        return new com.applovin.exoplayer2.i.a.b(vVar.D, vVar.f16840n);
                    case '\n':
                        return new com.applovin.exoplayer2.i.f.a();
                    case 11:
                        return new com.applovin.exoplayer2.i.g.c();
                }
            }
            throw new IllegalArgumentException(s.f.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
    };

    boolean a(v vVar);

    g b(v vVar);
}
