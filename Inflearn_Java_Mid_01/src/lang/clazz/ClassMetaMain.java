package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
        Class clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회
        // 세개 다 같은 결과값을 출력한다.


        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("SuperClass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }
    }
}
