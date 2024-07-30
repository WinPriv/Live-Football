package gb;

import android.content.DialogInterface;
import gb.l0;

/* loaded from: classes2.dex */
public final class j0 implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.a f28590s;

    public j0(l0.a aVar) {
        this.f28590s = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        l0.a aVar = this.f28590s;
        if (aVar != null) {
            aVar.V();
        }
    }
}
