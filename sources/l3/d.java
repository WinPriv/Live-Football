package l3;

import a3.x;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.bumptech.glide.manager.o;
import com.huawei.openalliance.ad.ppskit.utils.k0;
import ib.r;
import ib.s;
import j5.g0;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import ka.n7;
import ka.ob;
import t3.a;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: classes.dex */
public class d implements y2.j, com.bumptech.glide.manager.g, k0, m3.c, o, ob, cc.b {

    /* renamed from: s, reason: collision with root package name */
    public static d f32366s;

    /* renamed from: t, reason: collision with root package name */
    public static d f32367t;

    public /* synthetic */ d() {
    }

    public static d0.b d(g0... g0VarArr) {
        return new d0.b(g0VarArr, 2);
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.k0
    public Pair b(Context context, String str) {
        try {
            if (n7.d()) {
                n7.b("HmsOaidAccessor", "query oaid");
            }
            return r.b(context, str);
        } catch (s unused) {
            n7.g("HmsOaidAccessor", "getOaidAndTrackLimit ".concat(s.class.getSimpleName()));
            return null;
        }
    }

    public void e(Bundle bundle, String str) {
        throw null;
    }

    @Override // m3.c
    public x f(x xVar, y2.g gVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((c) xVar.get()).f32358s.f32365a.f32369a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = t3.a.f35403a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f35406a == 0) {
            if (bVar.f35407b == bVar.f35408c.length) {
                bArr = asReadOnlyBuffer.array();
                return new i3.b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new i3.b(bArr);
    }

    @Override // y2.d
    public boolean g(Object obj, File file, y2.g gVar) {
        try {
            t3.a.d(((c) ((x) obj).get()).f32358s.f32365a.f32369a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // cc.b
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        language.hashCode();
        char c10 = 65535;
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3391:
                if (language.equals("ji")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3886:
                if (language.equals(com.anythink.expressad.video.dynview.a.a.V)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "id";
            case 1:
                return "he";
            case 2:
                return "yi";
            case 3:
                StringBuilder l10 = com.ironsource.adapters.facebook.a.l(language, "-");
                l10.append(Locale.getDefault().getCountry());
                return l10.toString();
            default:
                return language;
        }
    }

    @Override // y2.j
    public y2.c h(y2.g gVar) {
        return y2.c.SOURCE;
    }

    public void i(Bundle bundle, String str) {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public void l() {
        throw null;
    }

    public void m(Bundle bundle, String str) {
        throw null;
    }

    public void n() {
        throw null;
    }

    public /* synthetic */ d(int i10) {
    }

    @Override // ka.ob
    public void b() {
    }

    @Override // com.bumptech.glide.manager.g
    public void a() {
    }

    @Override // ka.ob
    public void c() {
    }
}
