package core;

import annotation.Resource;
import logic.Item;
import logic.ItemCatalog;
import logic.ItemCatalogImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Container {
    public Object getInstance(Class clazz) throws Exception{

        Object obj = clazz.getConstructor().newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (Field f:fields) {

            Annotation[] annotations = f.getAnnotations();
            for (Annotation an: annotations) {
                if(an instanceof Resource) {
                    Resource resource = (Resource) an;
                    Class target = resource.value();

                    f.setAccessible(true);
                    f.set(obj, target.getConstructor().newInstance());
                }
            }
        }

        return obj;
    }
}
