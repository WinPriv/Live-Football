package ka;

import android.widget.CompoundButton;

/* loaded from: classes2.dex */
public final class kj implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton.OnCheckedChangeListener f31399a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31400b = false;

    public kj(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f31399a = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (!this.f31400b) {
            n7.e("OAIDOnCheckedChangeListener", "not click able");
        } else {
            this.f31399a.onCheckedChanged(compoundButton, z10);
        }
    }
}
