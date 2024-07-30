package c5;

import com.anythink.expressad.exoplayer.k.o;
import k4.i0;
import s.f;

/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes2.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3282a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    /* loaded from: classes2.dex */
    public class a implements b {
        @Override // c5.b
        public final boolean c(i0 i0Var) {
            String str = i0Var.D;
            if (!o.V.equals(str) && !o.ai.equals(str) && !o.ag.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // c5.b
        public final e d(i0 i0Var) {
            String str = i0Var.D;
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
                        return new d5.a();
                    case 1:
                        return new f5.a();
                    case 2:
                        return new g5.a(null);
                    case 3:
                        return new e5.a();
                    case 4:
                        return new h5.a();
                }
            }
            throw new IllegalArgumentException(f.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean c(i0 i0Var);

    e d(i0 i0Var);
}
