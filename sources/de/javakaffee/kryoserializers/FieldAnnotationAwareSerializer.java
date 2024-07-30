package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.factories.SerializerFactory;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class FieldAnnotationAwareSerializer<T> extends FieldSerializer<T> {
    private final boolean disregarding;
    private final Set<Class<? extends Annotation>> marked;

    /* loaded from: classes2.dex */
    public static class Factory implements SerializerFactory {
        private final boolean disregarding;
        private final Collection<Class<? extends Annotation>> marked;

        public Factory(Collection<Class<? extends Annotation>> collection, boolean z10) {
            this.marked = collection;
            this.disregarding = z10;
        }

        @Override // com.esotericsoftware.kryo.factories.SerializerFactory
        public Serializer<?> makeSerializer(Kryo kryo, Class<?> cls) {
            return new FieldAnnotationAwareSerializer(kryo, cls, this.marked, this.disregarding);
        }
    }

    public FieldAnnotationAwareSerializer(Kryo kryo, Class<?> cls, Collection<Class<? extends Annotation>> collection, boolean z10) {
        super(kryo, cls);
        this.disregarding = z10;
        this.marked = new HashSet(collection);
        rebuildCachedFields();
    }

    private boolean isMarked(Field field) {
        for (Annotation annotation : field.getAnnotations()) {
            if (this.marked.contains(annotation.annotationType())) {
                return true;
            }
        }
        return false;
    }

    private boolean isRemove(Field field) {
        return (!isMarked(field)) ^ this.disregarding;
    }

    private void removeFields() {
        String str;
        for (FieldSerializer.CachedField cachedField : getFields()) {
            Field field = cachedField.getField();
            if (isRemove(field)) {
                if (Log.TRACE) {
                    Object[] objArr = new Object[2];
                    if (this.disregarding) {
                        str = "without";
                    } else {
                        str = "with";
                    }
                    objArr[0] = str;
                    objArr[1] = cachedField;
                    Log.trace("kryo", String.format("Ignoring field %s tag: %s", objArr));
                }
                super.removeField(field.getName());
            }
        }
    }

    public boolean addAnnotation(Class<? extends Annotation> cls) {
        if (this.disregarding && this.marked.add(cls)) {
            initializeCachedFields();
            return true;
        }
        return false;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void rebuildCachedFields() {
        if (this.marked == null) {
            return;
        }
        super.rebuildCachedFields();
        removeFields();
    }

    public boolean removeAnnotation(Class<? extends Annotation> cls) {
        if (!this.disregarding && this.marked.remove(cls)) {
            initializeCachedFields();
            return true;
        }
        return false;
    }
}
