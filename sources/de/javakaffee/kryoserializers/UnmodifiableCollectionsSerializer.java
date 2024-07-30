package de.javakaffee.kryoserializers;

import com.anythink.expressad.d.a.b;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class UnmodifiableCollectionsSerializer extends Serializer<Object> {
    private static final Field SOURCE_COLLECTION_FIELD;
    private static final Field SOURCE_MAP_FIELD;

    /* loaded from: classes2.dex */
    public enum UnmodifiableCollection {
        COLLECTION(Collections.unmodifiableCollection(Arrays.asList("")).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.1
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableCollection((Collection) obj);
            }
        },
        RANDOM_ACCESS_LIST(Collections.unmodifiableList(new ArrayList()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.2
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        },
        LIST(Collections.unmodifiableList(new LinkedList()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.3
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        },
        SET(Collections.unmodifiableSet(new HashSet()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.4
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableSet((Set) obj);
            }
        },
        SORTED_SET(Collections.unmodifiableSortedSet(new TreeSet()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.5
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            }
        },
        MAP(Collections.unmodifiableMap(new HashMap()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_MAP_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.6
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableMap((Map) obj);
            }
        },
        SORTED_MAP(Collections.unmodifiableSortedMap(new TreeMap()).getClass(), UnmodifiableCollectionsSerializer.SOURCE_MAP_FIELD) { // from class: de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection.7
            @Override // de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer.UnmodifiableCollection
            public Object create(Object obj) {
                return Collections.unmodifiableSortedMap((SortedMap) obj);
            }
        };

        private final Field sourceCollectionField;
        private final Class<?> type;

        public static UnmodifiableCollection valueOfType(Class<?> cls) {
            for (UnmodifiableCollection unmodifiableCollection : values()) {
                if (unmodifiableCollection.type.equals(cls)) {
                    return unmodifiableCollection;
                }
            }
            throw new IllegalArgumentException("The type " + cls + " is not supported.");
        }

        public abstract Object create(Object obj);

        UnmodifiableCollection(Class cls, Field field) {
            this.type = cls;
            this.sourceCollectionField = field;
        }
    }

    static {
        try {
            Field declaredField = Class.forName("java.util.Collections$UnmodifiableCollection").getDeclaredField("c");
            SOURCE_COLLECTION_FIELD = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("java.util.Collections$UnmodifiableMap").getDeclaredField(b.dH);
            SOURCE_MAP_FIELD = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException("Could not access source collection field in java.util.Collections$UnmodifiableCollection.", e10);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        UnmodifiableCollectionsSerializer unmodifiableCollectionsSerializer = new UnmodifiableCollectionsSerializer();
        UnmodifiableCollection.values();
        for (UnmodifiableCollection unmodifiableCollection : UnmodifiableCollection.values()) {
            kryo.register(unmodifiableCollection.type, unmodifiableCollectionsSerializer);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        try {
            UnmodifiableCollection valueOfType = UnmodifiableCollection.valueOfType(obj.getClass());
            return valueOfType.create(kryo.copy(valueOfType.sourceCollectionField.get(obj)));
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        return UnmodifiableCollection.values()[input.readInt(true)].create(kryo.readClassAndObject(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            UnmodifiableCollection valueOfType = UnmodifiableCollection.valueOfType(obj.getClass());
            output.writeInt(valueOfType.ordinal(), true);
            kryo.writeClassAndObject(output, valueOfType.sourceCollectionField.get(obj));
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
