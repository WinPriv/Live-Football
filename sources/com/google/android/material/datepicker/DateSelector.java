package com.google.android.material.datepicker;

import android.os.Parcelable;
import android.view.View;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    S P();

    View Q();

    void d();

    String e();

    Collection<m0.c<Long, Long>> f();

    String getError();

    int i();

    boolean j();

    String l();

    Collection<Long> m();
}
