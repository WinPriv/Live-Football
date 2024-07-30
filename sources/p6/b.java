package p6;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.huawei.hms.ads.gl;

/* compiled from: Chip.java */
/* loaded from: classes2.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f34479a;

    public b(Chip chip) {
        this.f34479a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        com.google.android.material.chip.a aVar = this.f34479a.f20605w;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(gl.Code);
        }
    }
}
