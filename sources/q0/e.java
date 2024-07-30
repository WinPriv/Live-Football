package q0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import q0.h;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f34555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, d dVar) {
        super(inputConnection, false);
        this.f34555a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        h hVar;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            hVar = null;
        } else {
            hVar = new h(new h.a(inputContentInfo));
        }
        if (((d) this.f34555a).b(hVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
