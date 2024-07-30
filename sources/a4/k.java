package a4;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f253a;

    /* renamed from: b, reason: collision with root package name */
    public final i f254b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f255c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f256a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f257b = null;

        public a(Context context) {
            this.f256a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final a4.d a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.k.a.a(java.lang.String):a4.d");
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f255c = new HashMap();
        this.f253a = aVar;
        this.f254b = iVar;
    }

    @Override // a4.e
    public final synchronized m get(String str) {
        if (this.f255c.containsKey(str)) {
            return (m) this.f255c.get(str);
        }
        d a10 = this.f253a.a(str);
        if (a10 == null) {
            return null;
        }
        i iVar = this.f254b;
        m create = a10.create(new c(iVar.f247a, iVar.f248b, iVar.f249c, str));
        this.f255c.put(str, create);
        return create;
    }
}
