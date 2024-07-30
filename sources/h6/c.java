package h6;

import android.util.Property;
import android.view.ViewGroup;
import com.hamkho.livefoot.R;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes2.dex */
public final class c extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f28774a = new c();

    public c() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f == null) {
            return Float.valueOf(1.0f);
        }
        return f;
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
