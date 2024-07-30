package ka;

import android.content.ContentValues;
import android.content.Context;

/* loaded from: classes2.dex */
public final class ec implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f31133t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentValues f31134u;

    public ec(String str, Context context, ContentValues contentValues) {
        this.f31132s = str;
        this.f31133t = context;
        this.f31134u = contentValues;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fc.b(this.f31132s, this.f31133t, this.f31134u);
        } catch (Throwable th) {
            e0.i.p(th, "updateWithCommand ", "AppDataCollectionProvider");
        }
    }
}
