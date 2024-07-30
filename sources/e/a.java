package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.huawei.openalliance.ad.constant.bj;
import zc.d;

/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0364a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f27611a;

        public C0364a(T t10) {
            this.f27611a = t10;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0364a b(ComponentActivity componentActivity, Object obj) {
        d.d(componentActivity, bj.f.o);
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
