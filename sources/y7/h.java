package y7;

import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes2.dex */
public final class h implements v7.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36848a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36849b = false;

    /* renamed from: c, reason: collision with root package name */
    public v7.c f36850c;

    /* renamed from: d, reason: collision with root package name */
    public final e f36851d;

    public h(e eVar) {
        this.f36851d = eVar;
    }

    @Override // v7.g
    public final v7.g d(String str) throws IOException {
        if (!this.f36848a) {
            this.f36848a = true;
            this.f36851d.d(this.f36850c, str, this.f36849b);
            return this;
        }
        throw new v7.b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // v7.g
    public final v7.g e(boolean z10) throws IOException {
        if (!this.f36848a) {
            this.f36848a = true;
            this.f36851d.e(this.f36850c, z10 ? 1 : 0, this.f36849b);
            return this;
        }
        throw new v7.b("Cannot encode a second value in the ValueEncoderContext");
    }
}
