package a3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.anythink.basead.ui.SdkBannerAdView;
import com.google.android.gms.measurement.internal.zzgd;
import com.huawei.hms.ads.gl;
import java.util.HashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements b5.o {
    public static void A(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzj().zza(str);
    }

    public static void B(String str, String str2, String str3) {
        com.anythink.expressad.foundation.h.o.d(str3, str2.concat(String.valueOf(str)));
    }

    public static void C(String str, String str2, String str3) {
        com.anythink.expressad.foundation.h.o.a(str3, str2.concat(String.valueOf(str)));
    }

    public static void D(String str, String str2, String str3) {
        com.applovin.exoplayer2.l.q.c(str3, str + str2);
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 == 1) {
            return "INITIALIZE";
        }
        if (i10 == 2) {
            return "RESOURCE_CACHE";
        }
        if (i10 == 3) {
            return "DATA_CACHE";
        }
        if (i10 == 4) {
            return "SOURCE";
        }
        if (i10 == 5) {
            return "ENCODE";
        }
        if (i10 == 6) {
            return "FINISHED";
        }
        return "null";
    }

    public static /* synthetic */ String F(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 == 3) {
            return "GONE";
        }
        if (i10 == 4) {
            return "INVISIBLE";
        }
        return "null";
    }

    public static /* synthetic */ String G(int i10) {
        if (i10 == 1) {
            return "IAM";
        }
        if (i10 == 2) {
            return "NOTIFICATION";
        }
        return "null";
    }

    public static final void a(int i10, View view) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (FragmentManager.H(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                            }
                            view.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (FragmentManager.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (FragmentManager.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        throw null;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 4) {
                return 4;
            }
            if (i10 == 8) {
                return 3;
            }
            throw new IllegalArgumentException(i("Unknown visibility ", i10));
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == gl.Code && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ float d(int i10) {
        if (i10 == 1) {
            return 180.0f;
        }
        if (i10 == 2) {
            return 270.0f;
        }
        if (i10 == 3) {
            return gl.Code;
        }
        if (i10 == 4) {
            return 90.0f;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i10) {
        if (i10 == 1) {
            return "iam";
        }
        if (i10 == 2) {
            return "notification";
        }
        throw null;
    }

    public static int f(float f) {
        return com.anythink.expressad.foundation.h.t.b(com.anythink.core.common.b.n.a().g(), f);
    }

    public static View g(SdkBannerAdView sdkBannerAdView, String str, String str2) {
        return sdkBannerAdView.findViewById(com.anythink.core.common.k.h.a(sdkBannerAdView.getContext(), str, str2));
    }

    public static com.anythink.core.c.a h(com.anythink.core.c.b bVar) {
        return bVar.b(com.anythink.core.common.b.n.a().p());
    }

    public static String i(String str, int i10) {
        return str + i10;
    }

    public static String j(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String k(String str, long j10, String str2) {
        return str + j10 + str2;
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(StringBuilder sb2, int i10, String str, String str2) {
        sb2.append(i10);
        return str.replaceAll(str2, sb2.toString());
    }

    public static String n(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str) {
        sb2.append(com.anythink.core.common.b.n.a().c());
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder r(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap t(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void u(int i10, String str, String str2) {
        com.anythink.expressad.foundation.h.o.a(str2, str.concat(String.valueOf(i10)));
    }

    public static void v(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static void w(com.applovin.impl.mediation.g gVar, StringBuilder sb2, String str, Bundle bundle, com.applovin.impl.sdk.y yVar, String str2) {
        sb2.append(com.applovin.impl.mediation.g.b(gVar));
        sb2.append(str);
        sb2.append(bundle);
        yVar.c(str2, sb2.toString());
    }

    public static void x(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzd().zza(str);
    }

    public static void y(String str, String str2, String str3) {
        d6.p.f(str3, str + str2);
    }

    public static void z(Throwable th, StringBuilder sb2, String str) {
        sb2.append(th.getMessage());
        com.anythink.expressad.foundation.h.o.a(str, sb2.toString());
    }

    @Override // b5.o
    public List getDecoderInfos(String str, boolean z10, boolean z11) {
        return b5.q.e(str, z10, z11);
    }
}
