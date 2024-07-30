package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.factories.ReflectionSerializerFactory;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FieldSerializerAnnotationsUtil {
    public FieldSerializerAnnotationsUtil(FieldSerializer fieldSerializer) {
    }

    public void processAnnotatedFields(FieldSerializer fieldSerializer) {
        Serializer makeSerializer;
        Serializer makeSerializer2;
        Serializer makeSerializer3;
        FieldSerializer.CachedField[] fields = fieldSerializer.getFields();
        int length = fields.length;
        for (int i10 = 0; i10 < length; i10++) {
            Field field = fields[i10].getField();
            if (field.isAnnotationPresent(FieldSerializer.Bind.class)) {
                fields[i10].setSerializer(ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), ((FieldSerializer.Bind) field.getAnnotation(FieldSerializer.Bind.class)).value(), field.getClass()));
            }
            if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
                field.isAnnotationPresent(MapSerializer.BindMap.class);
            }
            Class<?> cls = null;
            if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
                if (fields[i10].serializer == null) {
                    CollectionSerializer.BindCollection bindCollection = (CollectionSerializer.BindCollection) field.getAnnotation(CollectionSerializer.BindCollection.class);
                    if (Collection.class.isAssignableFrom(fields[i10].field.getType())) {
                        Class<? extends Serializer> elementSerializer = bindCollection.elementSerializer();
                        if (elementSerializer == Serializer.class) {
                            elementSerializer = null;
                        }
                        if (elementSerializer == null) {
                            makeSerializer3 = null;
                        } else {
                            makeSerializer3 = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), elementSerializer, field.getClass());
                        }
                        boolean elementsCanBeNull = bindCollection.elementsCanBeNull();
                        Class<?> elementClass = bindCollection.elementClass();
                        if (elementClass == Object.class) {
                            elementClass = null;
                        }
                        CollectionSerializer collectionSerializer = new CollectionSerializer();
                        collectionSerializer.setElementsCanBeNull(elementsCanBeNull);
                        collectionSerializer.setElementClass(elementClass, makeSerializer3);
                        fields[i10].setSerializer(collectionSerializer);
                    } else {
                        throw new RuntimeException("CollectionSerialier.Bind should be used only with fields implementing java.util.Collection, but field " + fields[i10].getField().getDeclaringClass().getName() + "." + fields[i10].getField().getName() + " does not implement it.");
                    }
                } else {
                    throw new RuntimeException("CollectionSerialier.Bind cannot be used with field " + fields[i10].getField().getDeclaringClass().getName() + "." + fields[i10].getField().getName() + ", because it has a serializer already.");
                }
            }
            if (field.isAnnotationPresent(MapSerializer.BindMap.class)) {
                if (fields[i10].serializer == null) {
                    MapSerializer.BindMap bindMap = (MapSerializer.BindMap) field.getAnnotation(MapSerializer.BindMap.class);
                    if (Map.class.isAssignableFrom(fields[i10].field.getType())) {
                        Class<? extends Serializer> valueSerializer = bindMap.valueSerializer();
                        Class<? extends Serializer> keySerializer = bindMap.keySerializer();
                        if (valueSerializer == Serializer.class) {
                            valueSerializer = null;
                        }
                        if (keySerializer == Serializer.class) {
                            keySerializer = null;
                        }
                        if (valueSerializer == null) {
                            makeSerializer = null;
                        } else {
                            makeSerializer = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), valueSerializer, field.getClass());
                        }
                        if (keySerializer == null) {
                            makeSerializer2 = null;
                        } else {
                            makeSerializer2 = ReflectionSerializerFactory.makeSerializer(fieldSerializer.getKryo(), keySerializer, field.getClass());
                        }
                        boolean valuesCanBeNull = bindMap.valuesCanBeNull();
                        boolean keysCanBeNull = bindMap.keysCanBeNull();
                        Class<?> keyClass = bindMap.keyClass();
                        Class<?> valueClass = bindMap.valueClass();
                        if (keyClass == Object.class) {
                            keyClass = null;
                        }
                        if (valueClass != Object.class) {
                            cls = valueClass;
                        }
                        MapSerializer mapSerializer = new MapSerializer();
                        mapSerializer.setKeysCanBeNull(keysCanBeNull);
                        mapSerializer.setValuesCanBeNull(valuesCanBeNull);
                        mapSerializer.setKeyClass(keyClass, makeSerializer2);
                        mapSerializer.setValueClass(cls, makeSerializer);
                        fields[i10].setSerializer(mapSerializer);
                    } else {
                        throw new RuntimeException("MapSerialier.Bind should be used only with fields implementing java.util.Map, but field " + fields[i10].getField().getDeclaringClass().getName() + "." + fields[i10].getField().getName() + " does not implement it.");
                    }
                } else {
                    throw new RuntimeException("MapSerialier.Bind cannot be used with field " + fields[i10].getField().getDeclaringClass().getName() + "." + fields[i10].getField().getName() + ", because it has a serializer already.");
                }
            }
        }
    }
}
