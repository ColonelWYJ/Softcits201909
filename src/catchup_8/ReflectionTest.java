package catchup_8;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	private String rt = "Reflection Testing";
	
	public ReflectionTest() {
	}

	public void printHello(){
		System.out.println("Hello!");
	}
	
	public void printString(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		// �����ַ�������ȡ��Ӧ��Class����
		Class<?> clazz = Class.forName("catchup_8.ReflectionTest");
		Class<?> clazz1 = ReflectionTest.class;
		Class<?> clazz2 = rt.getClass();
		
		//��ͨ��ʽ���÷���
		ReflectionTest rt = new ReflectionTest();
		rt.printHello();
		
		
		//ͨ������ķ�ʽ���÷���
		//����û�в����ķ���
		Method mtd = clazz.getMethod("printHello");
		//����ʵ��
		Object obj = clazz.newInstance();
		//�����޲η���
		mtd.invoke(obj);
		
		
		//���ɲ���ΪString���� ����ΪpringString �ķ���
		mtd = clazz.getMethod("printString", String.class);
		//�趨����Ϊinput string�����÷���
		mtd.invoke(obj, "input string");
		
		//���ɳ�Ա����
		Field fd = clazz.getDeclaredField("rt");
		//����˽�г�Ա�����ɷ���
		fd.setAccessible(true); 
		
		//���ʳ�Ա����ֵ
		System.out.println("Filed rt vaule is: "+ fd.get(obj));
	}

}
