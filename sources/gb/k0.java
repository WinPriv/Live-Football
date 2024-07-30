package gb;

import android.content.DialogInterface;
import gb.l0;

/* loaded from: classes2.dex */
public final class k0 implements DialogInterface.OnCancelListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.a f28591s;

    public k0(l0.a aVar) {
        this.f28591s = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l0.a aVar = this.f28591s;
        if (aVar != null) {
            aVar.V();
        }
    }
}
