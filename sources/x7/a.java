package x7;

import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements v7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36485a;

    @Override // v7.a
    public final void a(Object obj, v7.e eVar) {
        switch (this.f36485a) {
            case 0:
                throw new v7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                Map.Entry entry = (Map.Entry) obj;
                v7.e eVar2 = eVar;
                Charset charset = y7.e.f;
                eVar2.a(y7.e.f36836g, entry.getKey());
                eVar2.a(y7.e.f36837h, entry.getValue());
                return;
        }
    }
}
