package androidx.lifecycle;

/* compiled from: MutableLiveData.java */
/* loaded from: classes.dex */
public class q<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(T t10) {
        LiveData.a("setValue");
        this.f1925g++;
        this.f1924e = t10;
        c(null);
    }
}
