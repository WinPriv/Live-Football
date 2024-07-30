package j7;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: AbstractMapEntry.java */
/* loaded from: classes2.dex */
public abstract class e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!i7.g.a(getKey(), entry.getKey()) || !i7.g.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i10 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
